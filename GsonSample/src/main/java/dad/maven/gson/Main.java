package dad.maven.gson;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Pedir nombre
        System.out.print("Introduzca su nombre: ");
        String Nombre = sc.nextLine();

        // Pedir apellidos
        System.out.print("Introduzca sus apellidos: ");
        String Apellidos = sc.nextLine();

        // Pedir edad
        System.out.print("Introduzca su edad: ");
        int Edad = sc.nextInt();

        // Crear una instancia de Persona con los datos introducidos
        Persona p = new Persona(Nombre, Apellidos, Edad);

        // Crear un objeto Gson para convertir a JSON y mostrarlo
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(p);
        System.out.println(json);

        // Cerrar el scanner
        sc.close();

	}

}
