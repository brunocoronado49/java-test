package POOpractica;

public class MainMascota {
    public static void main(String[] args) {
        Duenio bruce = new Duenio("Bruce", "492-225-9765");
        Mascota melina = new Mascota("Melina", "pitbull", bruce); // Composición

        melina.MostrarFicha();
    }
}
