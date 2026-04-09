package ejercisio;
import java.util.Scanner;

public class CalculadoraBasica {


    public static double sumar(double a, double b) {
        return a + b;
    }


    public static double restar(double a, double b) {
        return a - b;
    }


    public static double multiplicar(double a, double b) {
        return a * b;
    }


    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre 0");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Ingrese el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = sc.nextDouble();

        // Menú
        System.out.println("\nSeleccione una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();

        double resultado = 0;


        switch (opcion) {
            case 1:
                resultado = sumar(num1, num2);
                break;
            case 2:
                resultado = restar(num1, num2);
                break;
            case 3:
                resultado = multiplicar(num1, num2);
                break;
            case 4:
                resultado = dividir(num1, num2);
                break;
            default:
                System.out.println("Opción inválida");
                return;
        }


        System.out.println("El resultado es: " + resultado);
    }
}