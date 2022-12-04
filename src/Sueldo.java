import java.util.Scanner;

public class Sueldo {

	public static void main(String[] args) {

		// Incializacion de variables
		Scanner entrada = new Scanner(System.in);
		metodos m = new metodos();
		int x, k = 0;
		boolean cerrar = false;

		// Motor del programa
	
			m.entrada();

			x = m.x;
			while (!cerrar) {
			System.out.println("Para ingresar datos digite 1");
			System.out.println("Para visuzaliar datos digitre el 2");

			k = entrada.nextInt();
			switch (k) {
			case 1:
				while (x >= 1) {
					m.datos();
					m.empleados();
					m.impreso();
					x--;
				}
				break;
			case 2:{
				System.out.println("entro a opcion 2");
				m.impreso();}
				break;
			case 3:
				cerrar = true;
				break;
			default:
				System.out.println("Imprima una opcion dentro del menu");
				entrada.close();
				break;
			}
		}
	}

}
