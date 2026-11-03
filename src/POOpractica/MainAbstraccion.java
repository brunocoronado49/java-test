package POOpractica;

public class MainAbstraccion {
    public static void main(String[] args) {
        GestorArchivos ga = new GestorArchivos();

        ga.guardar();
        ga.eliminar();
    }
}
