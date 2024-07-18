import java.util.Scanner;

public class Main {

    public static void holaMundo() {
        System.out.println("Hola, Mundo!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menú de Ejercicios:");
            System.out.println("1.- Hola Mundo");
            System.out.println("2.- Suma de dos números");
            System.out.println("3.- Número par o impar");
            System.out.println("4.- Factorial de un número");
            System.out.println("5.- Tabla de multiplicar");
            System.out.println("6.- Salir");
            System.out.print("Selecciona una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    holaMundo();
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        } while (option != 6);

        scanner.close();
    }



}