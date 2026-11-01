package POOpractica;

public class Mascota {
    private final String nombre;
    private final String especie;
    private final Duenio duenio;

    public Mascota(String nombre, String especie, Duenio duenio) {
        this.nombre = nombre;
        this.especie = especie;
        this.duenio = duenio;
    }

    public void MostrarFicha() {
        System.out.println("--- FICHA DE MASCOTA ---");
        System.out.println("Mascota: " + nombre + " (" + especie + ")");
        System.out.println("Dueño: " + duenio.getNombre() + " | Tel: " + duenio.getTelefono());
    }
}
