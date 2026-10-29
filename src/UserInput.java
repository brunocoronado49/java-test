import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tu nombre: " );
        String nombre = sc.nextLine();

        System.out.println("Tu edad: ");
        int edad = sc.nextInt();

        System.out.println("Hola " + nombre + "! Tienes " + edad +" de edad");

        sc.close();
    }
}
