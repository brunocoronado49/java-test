package FinalProject;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FinalMain {
    private static final String ARCHIVO = "inventario_crud.txt";
    private static ArrayList<Product> listaProducts = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        cargarDatosDesdeArchivo();

        boolean continuar = true;

        while(continuar) {
            System.out.println("\n=======================================");
            System.out.println("   SISTEMA DE GESTIÓN DE INVENTARIO    ");
            System.out.println("=======================================");
            System.out.println("1. Crear producto (Create)");
            System.out.println("2. Ver productos (Read)");
            System.out.println("3. Actualizar stock/precio (Update)");
            System.out.println("4. Eliminar producto (Delete)");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            int option = sc.nextInt();
            sc.nextLine();

            switch(option) {
                case 1:
                    crearProducto();
                    break;
                case 2:
                    leerProductos();
                    break;
                case 3:
                    actualizarProducto();
                    break;
                case 4:
                    eliminarProducto();
                    break;
                case 5:
                    System.out.println("\n¡Guardando estado final y saliendo del sistema. Nos vemos!");
                    continuar = false;
                    break;
                default:
                    System.out.println("\n[Error]: No valid, Intenta de nuevo");
            }
        }
        sc.close();
    }

    private static void cargarDatosDesdeArchivo() {
        File archivoLocal = new File(ARCHIVO); // Tomamos el archivo
        if(!archivoLocal.exists()) {
            return; // Nada que cargar
        }

        // Se intenta leer line by line, mientras que cada line no sea nula
        try(BufferedReader br = new BufferedReader(new FileReader(archivoLocal))) {
            String linea;

            while((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");

                if(partes.length == 6) {
                    String id = partes[0];
                    String nombre = partes[1];
                    String description = partes[2];
                    double precio = Double.parseDouble(partes[3]);
                    int stock = Integer.parseInt(partes[4]);
                    boolean disponible = Boolean.parseBoolean(partes[5]);

                    listaProducts.add(new Product(id, nombre, description, precio, stock, disponible));
                }
            }

            System.out.println("[Sistema]: Se cargaron " + listaProducts.size() + " registros desde disco local");
        } catch(IOException e) {
            System.out.println("[Error]: Hubo un problema al leer el archivo de datos local: " + e.getMessage());
        }
    }

    private static void crearProducto() {
        System.out.println("\n--- REGISTRAR NUEVO PRODUCTO ---");
        System.out.print("Ingresa ID único (ej. P001): ");

        String id = sc.nextLine();

        // Validamos si el id ya existe
        for(Product p : listaProducts) {
            if(p.getId().equalsIgnoreCase(id)) {
                System.out.println("[Error]: Ya existe un producto con ese ID.");
                return;
            }
        }

        System.out.println("Nombre del producto: ");
        String nombre = sc.nextLine();

        System.out.println("Description del producto: ");
        String description = sc.nextLine();

        System.out.println("Precio del producto ($MXN): ");
        double precio = sc.nextDouble();

        System.out.println("Stock del producto: ");
        int stock = sc.nextInt();

        boolean disponible = stock >= 1;
        System.out.println("Disponible: " + ((disponible) ? "Si" : "No"));

        Product nuevo = new Product(id, nombre, description, precio, stock, disponible);
        listaProducts.add(nuevo);

        sincronizarArchivoCompleto();
        System.out.println("¡Producto registrado y guardado en disco con éxito!");
    }

    private static void leerProductos() {
        System.out.println("\n--- LISTA DE PRODUCTOS EN INVENTARIO ---");
        if(listaProducts.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return;
        }

        for(Product p : listaProducts) {
            p.showDetails();
        }
    }

    private static void actualizarProducto() {
        System.out.println("\n--- ACTUALIZAR PRODUCTO ---");
        System.out.print("Ingresa el ID del producto a modificar: ");
        String idBuscado = sc.nextLine();

        boolean encontrado = false;
        for(Product p : listaProducts) {
            if(p.getId().equalsIgnoreCase(idBuscado)) {
                encontrado = true;
                System.out.println("Producto encontrado:");
                p.showDetails();

                p.setPrecio(sc.nextDouble());
                p.setStock(sc.nextInt());
                sc.nextLine();

                sincronizarArchivoCompleto();
                System.out.println("¡Producto actualizado correctamente en memoria y disco!");
                System.out.println("Producto con datos nuevos:");
                p.showDetails();
                break;
            }
        }

        if(!encontrado) {
            System.out.println("[Aviso]: No se encontró ningún producto con el ID: " + idBuscado);
        }
    }

    private static void eliminarProducto() {
        System.out.println("\n--- ELIMINAR PRODUCTO ---");
        System.out.println("Ingresa el ID del producto a eliminar: ");
        String idBuscado = sc.nextLine();

        boolean eliminado = listaProducts.removeIf(p -> p.getId().equalsIgnoreCase(idBuscado));
        if(eliminado) {
            sincronizarArchivoCompleto();
            System.out.println("¡Producto eliminado del sistema con éxito!");
        } else {
            System.out.println("[Aviso]: No se encontró ningún producto con ese ID para eliminar.");
        }
    }

    private static void sincronizarArchivoCompleto() {
        try(PrintWriter pw = new PrintWriter(new FileWriter(ARCHIVO, false))) {
            for(Product p : listaProducts) {
                pw.println(p.aLineaTexto());
            }
        } catch(IOException e) {
            System.out.println("[Error crítico]: No se pudo actualizar el archivo local: " + e.getMessage());
        }
    }
}
