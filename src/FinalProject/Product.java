package FinalProject;

public class Product {
    private String id;
    private String nombre;
    private String description;
    private double precio;
    private int stock;
    private boolean disponible;

    public Product(String id, String nombre, String description, double precio, int stock, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.description = description;
        this.precio = precio;
        this.stock = stock;
        this.disponible = disponible;
    }

    public String getId() { return id; }
    public void setId(String Id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    public boolean getDisponible() { return disponible; }
    public void setPrecio(boolean disponible) { this.disponible = disponible; }

    public String aLineaTexto() {
        return id + ", " + nombre + ", " + description + ", " + precio + ", " + stock + ", " + disponible;
    }

    public void showDetails() {
        System.out.println("--- DETALLES DEL PRODUCTO ---");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre + " - " + description);
        System.out.println("Stock: " + stock + ((disponible) ? "Disponible" : "No disponible"));
        System.out.println("Precio: $" + precio + " MXN");
        System.out.println("-----------------------------");
    }
}
