package dad.maven.gson;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        //Le pido el nombre al usuario
        System.out.print("Introduzca su nombre: ");
        String Nombre = sc.nextLine();

        //Le pido los apellidos al usuario
        System.out.print("Introduzca sus apellidos: ");
        String Apellidos = sc.nextLine();

        //Le pido edad al usuario
        System.out.print("Introduzca su edad: ");
        int Edad = sc.nextInt();

        //Creo una instancia de Persona 
        Persona p = new Persona(Nombre, Apellidos, Edad);

        //Creo un objeto Gson para convertirlo a JSON y luego lo muestro en pantalla
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(p);
        System.out.println(json);

        // Cerrar el scanner
        sc.close();

	}

}
