/**
 * 
 */
package Ejercicio;

import java.util.Scanner;

/**
 * @author nbarbetta
 *
 */
public class E1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el primer numero: ");
		int a= sc.nextInt();
		System.out.println("Ingrese el segundo numero");
		int b= sc.nextInt();
		int opc;
		do {
			System.out.println("**MENU**");
			System.out.println("1.Suma ");
			System.out.println("2.Resta\n 3.Multiplica \n 4.Division \n 5. Salir");
			opc = sc.nextInt();
			switch(opc) {
				case 1:
					sumar(a,b);
					break;
				case 2:
					restar(a,b);
					break;
				case 5:
					System.out.println("**Exit**");
					continue;
				default:
					System.out.println("Ingrese opción valida");
			}
		}while (opc !=5);
		sc.close();
		
		//ystem.out.print(" Esta es la suma");
	}

	public static void sumar(int x, int y) {
		System.out.println("La suma es: "+(x+y));
	}
	public static void restar(int x, int y) {
		System.out.println("La resta es: "+(x-y));
	}
}

