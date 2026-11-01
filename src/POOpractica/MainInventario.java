package POOpractica;

public class MainInventario {
    public static void main(String[] args) {
        Product product1 = new Product("P001", "Teclado negro", 850.45, 15);
        Product product2 = new Product("P002", "Mouse Logitec", 550.45, 10);

        System.out.println("--- Inventario inicial ---");
        product1.mostrarDetalles();
        product2.mostrarDetalles();

        product1.setStock(10);
        System.out.println("\n--- DESPUÉS DE UNA VENTA ---");
        System.out.println("Nuevo stock de " + product1.getNombre() + ": " + product1.getStock());
    }
}
