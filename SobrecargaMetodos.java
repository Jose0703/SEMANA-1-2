class Operacion {
    
    public int sumar(int a, int b) {
        return a + b;
    }
    
    public double sumar(double a, double b) {
        return a + b;
    }
    
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }
}

public class SobrecargaMetodos {
    public static void main(String[] args) {
        Operacion op = new Operacion();
        
        int resultado1 = op.sumar(5, 10);
        System.out.println("Suma de 5 + 10 = " + resultado1);
        
        double resultado2 = op.sumar(3.5, 7.8);
        System.out.println("Suma de 3.5 + 7.8 = " + resultado2);
        
        int resultado3 = op.sumar(2, 4, 6);
        System.out.println("Suma de 2 + 4 + 6 = " + resultado3);
        
        System.out.println("\n--- Resultados directos ---");
        System.out.println("Suma int-int: " + op.sumar(8, 12));
        System.out.println("Suma double-double: " + op.sumar(2.5, 3.7));
        System.out.println("Suma int-int-int: " + op.sumar(1, 2, 3));
    }
}