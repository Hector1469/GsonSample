package dad.maven.gson;

public class Persona {
	//Atributos
	private String Nombre;
	private String Apellidos;
	private int Edad;
	
	//Constructor
	public Persona(String Nombre, String Apellidos, int Edad) {
		
		this.Nombre = Nombre;
		this.Apellidos = Apellidos;
		this.Edad = Edad;
	}
	
	//Metodos
	public String getNombre() {
		return Nombre;
	}
	
	
	public String getApellidos() {
		return Apellidos;
	}
	
	public int getEdad() {
		return Edad;
	}
}


