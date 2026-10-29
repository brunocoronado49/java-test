class Mascota {
    String nombre;
    String especie;
    int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Mascota: " + nombre + ", Especie: " + especie + ", edad: " + edad);
    }
}

public class PooExample {
    public static void main(String[] args) {
        Mascota miPerro = new Mascota("Seven", "Pastor belga", 4);
        miPerro.mostrarInfo();
    }
}
