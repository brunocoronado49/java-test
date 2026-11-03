package FileManage;

import java.io.*;

public class GestorArchivos {
    // Nombre archivo local
    private static final String NOMBRE_ARCHIVO = "inventario_datos.txt";

    // Method for save
    public static void guardarDatos(String lineaTexto) {
        // El true en el FileWriter activa el modo APPEND
        // El uso de try-with-resources cierra auto los flujos al terminar
        try (FileWriter fw = new FileWriter(NOMBRE_ARCHIVO, true);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println(lineaTexto);
            System.out.println("[SISTEMA]: Registro guardado en el disco");;
        } catch (IOException e) {
            System.out.println("[Error]: No se pudo escribir en el archivo: " + e.getMessage() );
        }
    }

    // Method for read
    public static void leerDatos() {
        System.out.println("\n--- CONTENIDO DEL ARCHIVO LOCAL ---");

        try (BufferedReader br = new BufferedReader(new FileReader(NOMBRE_ARCHIVO))) {
            String lineal;

            // Lee línea por línea hasta que el archivo se acabe (devuelva null)
            while ((lineal = br.readLine()) != null) {
                System.out.println("Linea: " + lineal);
            }
        } catch (IOException e) {
            System.out.println("[Aviso]: El archivo no existe o esta en blanco");
        }
    }

    public static void main(String[] args) {
        guardarDatos("P001, Teclado gamer, 850.26, 9");
        guardarDatos("P002, Mouse del gato, 199.26, 5");

        leerDatos();
    }
}
