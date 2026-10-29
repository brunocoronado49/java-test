import java.util.Scanner;

public class ControlStructs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa una option (1-3): ");
        int option = sc.nextInt();

        switch(option) {
            case 1:
                System.out.println("Crear registro...");
                break;
            case 2:
                System.out.println("Leer registros...");
                break;
            case 3:
                System.out.println("Borrar registro...");
                break;
            default:
                System.out.println("Option no valida.");
        }

        sc.close();

        int contador = 1;
        while(contador <= 7) {
            System.out.println("Ciclo numero: " + contador);
            contador++;
        }
    }
}
