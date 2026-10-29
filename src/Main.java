public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World from Java <3!");

        // Tipos de datos
        String name = "Franco Coronado";
        int age = 29;
        double myMoney = 483.53;
        float myWeight = 85.6f;
        boolean isSingle = true;
        char arroba = '@';

        System.out.println("String: " + name);
        System.out.println("Integer: " + age);
        System.out.println("Double: " + myMoney);
        System.out.println("Float: " + myWeight);
        System.out.println("Boolean: " + isSingle);
        System.out.println("Character: " + arroba);

        // Estructuras de control basics
        int calif = 85;

        if (calif >= 70) {
            System.out.println("Aprobado con excelencia");
        } else {
            System.out.println("Hay que estudiar mas");
        }

        // Bucles
        for(int i = 0; i <= 10; i++) {
            System.out.println("Numero del ciclo: " + i);
        }
    }
}
