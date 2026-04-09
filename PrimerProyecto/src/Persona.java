
public class Persona {
	
	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: " + nombre + ", Edad: " + edad);
	}
	
	public static void main(String[] args) {
		
		Persona a = new Persona("Juana Lupe", 21);
		Persona b = new Persona ("Luis Alfredo", 22);
		
		System.out.println("Persona 1:");
		a.mostrarDatos();
		
		System.out.println("Persona 2:");
		b.mostrarDatos();
	}
}
