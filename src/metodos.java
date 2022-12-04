import java.util.ArrayList;
import java.util.Scanner;

public class metodos {

	Scanner entrada = new Scanner(System.in);
	ArrayList<personas> lista = new ArrayList<personas>();
	int x, i, edad, j;
	float sueldo;
	String nombre;
	
	public void entrada() {
		System.out.println("=================================================");
		System.out.println("		Bienvenido!");
		System.out.println("=================================================");
		System.out.println("\nPor favor digite la cantidad de empleados a nomina");
		x = entrada.nextInt();
		
	}
		
	public void datos() {
		System.out.println("\nPor favor digite el nombre del empleado " + j++);
		nombre = entrada.nextLine();
		nombre = entrada.nextLine();
		System.out.println("\nPor favor digite el sueldo del empleado");
		sueldo = entrada.nextFloat();
		System.out.println("\nPor favor digite la edad del empleado");
		edad = entrada.nextInt();
	}
	
	
	public void empleados() {
		ArrayList<personas> lista = new ArrayList<personas>();
		lista.add(new personas(nombre, sueldo, edad));
	}
	
	public void impreso() {
		System.out.println("Llega a funcion");
		for (personas perso: lista) {
			System.out.println("Nombre: " + " " +  perso.getNombre() + " " + perso.getSueldo() + " " + perso.getEdad());
		}
	}
}

