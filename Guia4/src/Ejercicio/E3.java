/**
 * 
 */
package Ejercicio;

import java.util.Scanner;

/**
 * @author nbarbetta
 *
 */
public class E3 {

	/**
	 * 
	 */
	public static void conversor(double euro, int moneda) {
		// TODO Auto-generated constructor stub
		switch (moneda) {
		case 1:
			System.out.println(euro + "Euros, son: "+ (euro*0.86)+" Libras");
			break;
		case 2:
			System.out.println(euro + "Euros, son: "+ (euro*1.28611)+" Dolares");
			break;
		case 3:
			System.out.println(euro + "Euros, son: "+ (euro*129.852)+" Yenes");
			break;
		default:
			System.out.println("Opción incorrecta...");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("INgrese la cantidad de Euros:\n");
		double euro = sc.nextDouble();
		System.out.println("INgrese a que moneda convertir: \n "
				+ "1.Libras \n 2.Dolar \n 3.Yen");
		int moneda = sc.nextInt();
		conversor(euro,moneda);
		sc.close();

	}

}
