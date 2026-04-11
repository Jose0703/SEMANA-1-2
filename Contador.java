public class Contador{

    private static int contadorObjetos = 0;


    public Contador() {
        contadorObjetos++; 
    }

   
    public static int getTotalObjetos() {
        return contadorObjetos;
    }

    public static void main(String[] args) {
       
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();

      
        System.out.println("Objetos creados: " + Contador.getTotalObjetos());
    }
}
