
public class personas {

	private String nombre;
	private float sueldo;
	private int edad;

	public personas(String nombre, float sueldo, int edad) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.edad = edad;
	}
	
	public String getNombre(){
		return nombre;
	}
	public void setNombre(){
		this.nombre = nombre;
	}
	
	public double getSueldo(){
		return sueldo;
	}
	public void setSueldo(){
		this.sueldo = sueldo;
	}
	
	public int getEdad(){
		return edad;
	}
	public void setEdad(){
		this.edad = edad;
	}

}