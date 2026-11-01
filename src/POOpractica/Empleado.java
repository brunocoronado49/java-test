package POOpractica;

public class Empleado {
    protected String nombre; // 'protected' permite que las clases hijas lo usen directamente
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public void calcularPago() {
        System.out.println("Pago base para: " + nombre + " -> $" + salarioBase);
    }
}
