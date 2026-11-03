package ColeccionesPractica;

import POOpractica.Product;

import java.util.ArrayList;

public class MainColecciones {
    public static void main(String[] args) {
        ArrayList<Product> inventory = new ArrayList<>();

        inventory.add(new Product("P001", "Teclado negro", 550.56, 9));
        inventory.add(new Product("P002", "Mouse gamer", 250.56, 24));
        inventory.add(new Product("P003", "Monitor LG", 950.56, 6));

        System.out.println("--- INVENTARIO INICIAL (total: " + inventory.size() + ") ---");

        for (Product p : inventory) {
            p.mostrarDetalles();
        }

        Product myProduct = inventory.get(1);
        myProduct.setStock(10);

        System.out.println("\n[Actualizado] Stock de " + myProduct.getNombre() + ": " + myProduct.getStock());

        inventory.remove(1);

        System.out.println("\n--- INVENTARIO TRAS ELIMINAR PRODUCTO (QUEDAN: " + inventory.size() + ") ---");

        for (Product p : inventory) {
            p.mostrarDetalles();
        }
    }
}
