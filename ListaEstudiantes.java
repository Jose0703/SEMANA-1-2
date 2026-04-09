import java.util.ArrayList;
import java.util.Scanner;

public class ListaEstudiantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> estudiantes = new ArrayList<>();
		
		String nombre;
		
		try {
			while(true) {
				System.out.print("Ingrese el nombre del estudiantes: ");
				nombre = sc.nextLine();

				if (nombre.equalsIgnoreCase("Fin")) {
					break;
				}
				if(nombre.isEmpty()) {
					System.out.println("Dato inválido");
				} else if (!nombre.matches("[A-Z][a-zA-Z ]*")) {
				    System.out.println("Error: solo se permiten letras");
				}
				else {
					estudiantes.add(nombre);
				}
			}
			System.out.println("\n Lista de estudiantes: ");
			for (int i = 0; i < estudiantes.size(); i++) {
				System.out.println((i + 1) + ". " + estudiantes.get(i));
			}
		} catch (Exception e) {
			System.out.println("Hubo un error en el ingreso");
		}
		sc.close();
	}
}
