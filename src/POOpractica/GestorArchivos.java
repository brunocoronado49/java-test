package POOpractica;

interface Operable {
    void guardar();
    void eliminar();
}

public class GestorArchivos implements Operable {
    @Override
    public void guardar() {
        System.out.println("Guardando en disco local...");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando datos del disco...");
    }
}
