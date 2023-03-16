/**
 * 
 */
package Ejercicio;

import java.util.Scanner;

/**
 * @author nbarbetta
 *
 */
public class E2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();

	}
	public static void menu() {
		Scanner sc = new Scanner(System.in);
		boolean salir = true;
		String estado;
		while (salir){
			System.out.println("INgrese NOmbre");
			String nom = sc.next();
			System.out.println("INgrese Edad:");
			int edad = sc.nextInt();
			if (edad >= 18) {
				estado = "Mayor de edad";
			}else {
				estado = "Menor de edad";
			}
			System.out.println("Nombre: "+nom+" edad: "+edad+ ", es "+estado+"\n");
			
			System.out.println("Desea seguir ingresando?? (no -> Salir)\n");
			String opc = sc.nextLine();
			if (opc.equalsIgnoreCase("no")) {
				salir = false;
			}
		}
		sc.close();
			
	}
	

}
