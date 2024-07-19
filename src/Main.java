import java.util.Scanner;

public class Main {

    public static void holaMundo() {
        System.out.println("Hola, Mundo!");
    }

    public static void suma(int n1, int n2){
        System.out.println("El resultado de la suma es "+ (n1+n2));
    }

    public static void numeroParOImpar(int num){
        if(num%2==0){
            System.out.println("El numero ingresado es PAR.");
        }else{
            System.out.println("El numero ingresado es IMPAR.");
        }
    }

    public static void factorialDeUnNumero(int num){
        int fact = num;

        for (int i = num - 1; i > 0; i--) {
            fact = fact * i;
        }

        System.out.println("El factorial de "+num+" es "+fact);
    }

    public static void tablaDeMultiplicar(int num){
        System.out.println("Tabla de multiplicar del numero "+num+": ");

        System.out.println("ORDEN ASCENDENTE:");
        for (int i = 1; i<=10; i++){
            System.out.println("\t"+num+" x "+i+" = "+(num*i));
        }

        System.out.println("\nORDEN DESCENDENTE:");
        for (int i = 10; i > 0; i--){
            System.out.println("\t"+num+" x "+i+" = "+(num*i));
        }
    }

    public static void listaDeNumeros(){
        Scanner sc = new Scanner(System.in);
        int num, max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;

        do{
            System.out.println("Ingrese un numero: ");
            num = sc.nextInt();

            if (num>max){
                max = num;
            }

            if (num<min && num>=0){
                min = num;
            }
        }while(num >= 0);

        System.out.println("El numero maximo ingresado es: "+max);
        System.out.println("El numero minimo ingresado es: "+min);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option, num, num2;

        do {
            System.out.println("\nMenú de Ejercicios:");
            System.out.println("1.- Hola Mundo");
            System.out.println("2.- Suma de dos números");
            System.out.println("3.- Número par o impar");
            System.out.println("4.- Factorial de un número");
            System.out.println("5.- Tabla de multiplicar");
            System.out.println("6.- Salir");
            System.out.println("0.- Bonus");
            System.out.print("Selecciona una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    holaMundo();
                    break;

                case 2:
                    System.out.print("Ingrese el primer numero: ");
                    num = scanner.nextInt();

                    System.out.print("Ingrese el segundo numero: ");
                    num2 = scanner.nextInt();

                    suma(num, num2);
                    break;

                case 3:
                    System.out.print("Ingrese un numero: ");
                    num = scanner.nextInt();

                    numeroParOImpar(num);
                    break;

                case 4:
                    System.out.print("Ingrese un numero: ");
                    num = scanner.nextInt();

                    factorialDeUnNumero(num);
                    break;

                case 5:
                    System.out.print("Ingrese un numero: ");
                    num = scanner.nextInt();

                    tablaDeMultiplicar(num);
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                case 0:
                    listaDeNumeros();
                    break;

                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        } while (option != 6);

        scanner.close();
    }
}