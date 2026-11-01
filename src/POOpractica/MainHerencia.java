package POOpractica;

public class MainHerencia {
    public static void main(String[] args) {
        Empleado empGenerico = new Empleado("Carlos", 10000);
        Desarrollador devBruce = new Desarrollador("Bruno", 18000, 500);

        empGenerico.calcularPago();
        devBruce.calcularPago();
    }
}
