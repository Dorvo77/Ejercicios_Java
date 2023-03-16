/**
 * 
 */
package Ejercicio;

import java.util.Scanner;

/**
 * @author nbarbetta
 *
 */
public class E2_bis {

	public static void mostrarPersona(Scanner sc) { // Definir una función que recibe un objeto Scanner como parámetro y no devuelve nada
        System.out.println("Ingrese el nombre de la persona:"); // Pedir al usuario que ingrese el nombre de la persona
        String nombre = sc.nextLine(); // Leer el nombre y asignarlo a la variable nombre

        System.out.println("Ingrese edad de la persona:"); // Pedir al usuario que ingrese edad
        int edad = sc.nextInt(); // Leer edad
		if (edad>=21){
			System.out.println("Nombre: "+nombre+", edad: "+edad+". Es mayor de edad");
		}else{
			System.out.println("Nombre: "+nombre+", edad: "+edad+". Es menor de edad");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario
        String respuesta = "Si"; // Crear una variable para almacenar la respuesta del usuario
        while (respuesta.equalsIgnoreCase("Si")) { // Mientras la respuesta sea "Si" o "si", repetir el proceso
            mostrarPersona(sc); // Llamar a la función mostrarPersona y pasarle el objeto Scanner como parámetro
            System.out.println("¿Desea seguir mostrando personas? (SI-Continua / NO-Salir"); // Preguntar al usuario si desea seguir mostrando personas
            respuesta = sc.nextLine(); // Leer la respuesta y asignarla a la variable respuesta
        }
        sc.close(); // Cerrar el objeto Scanner
	}

}
