package POOpractica;

public class Desarrollador extends Empleado {
    private int lineasCodigoPorDia;

    public Desarrollador(String nombre, double salarioBase, int lineasCodigoPorDia) {
        super(nombre, salarioBase);
        this.lineasCodigoPorDia = lineasCodigoPorDia;
    }

    @Override
    public void calcularPago() {
        double bono = lineasCodigoPorDia * 0.50;
        System.out.println("Dev: " + nombre + " | Pago total con bono: $" + (salarioBase + bono));
    }
}
