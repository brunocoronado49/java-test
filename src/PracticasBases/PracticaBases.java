package PracticasBases;

import java.util.Scanner;

public class PracticaBases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean execute = true;

        System.out.println("=== ACCESS SYSTEM ===");
        System.out.println("Enter username:");
        String username = sc.nextLine();

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("\n[Aviso]: Hola " + username + ", eres menor de edad");
        } else {
            System.out.println("\\n[Aviso]: Bienvenido \" + username + \", tienes acceso total!");
        }

        while (execute) {
            System.out.println("\n===========================");
            System.out.println("     MENÚ PRINCIPAL        ");
            System.out.println("===========================");
            System.out.println("1. Ver perfil de usuario");
            System.out.println("2. Evaluar número par/impar");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("\n--- PERFIL ---");
                    System.out.println("Usuario: " + username);
                    System.out.println("Edad: " + age);
                    break;
                case 2:
                    System.out.println("\n--- EVALUAR NÚMERO ---");
                    System.out.print("Ingresa un número entero: ");

                    int myNumber = sc.nextInt();

                    if (myNumber % 2 == 0) {
                        System.out.println("El numero " + myNumber + " es PAR");
                    } else {
                        System.out.println("El numero " + myNumber + " es IMPAR");
                    }

                    break;
                case 3:
                    System.out.println("\nSaliendo del programa... Adios!");
                    execute = false;
                    break;
                default:
                    System.out.println("\n[Error]: Option invalida, elige bien el numero");
            }
        }

        sc.close();
    }
}
