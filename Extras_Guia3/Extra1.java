/**
 * 
 */
package Extras_Guia3;

import java.util.Scanner;

/**
 * @author nbarbetta
 *
 */
public class Extra1 {

	/**
	 * 
	 */
	//Extra 1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese cantidad de minutos");
		Scanner leer = new Sacanner(System.in);
		int minutos = leer.nextInt();
		int dia = minutos / 1440;
		int horas = (minutos % 1440) / 60;
		System.out.println(dia + "dia, "+horas+" horas.");
		
		/* Próximo ejercicio
		 * Extra número 2
		 *  B tome el valor de C,
		 *  C tome el valor de A, 
		 *  A tome el valor de D y
		 *  D tome el valor de B.
		 */
		int a = 1; int b=2;int c=3;int d=4; int aux;
		aux = c;
		c = a;
		a = d;
		d = b;
		b = c;
		System.out.println(a+b+c+d);
		
		/* Extra 3
		 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte
		 *  si se trata de una vocal. Caso contrario mostrar un mensaje
		 */
		Scanner leer = new Scanner(System.in);
		char letra = leer.next();
		if (letra == 'a' ||letra == 'e' ||letra == 'i' ||letra == 'o' || letra == 'u') {
			System.out.println("Es vocal");
		}else {
			System.out.println("NO es vocal");
		}
		
		/* Extra 4
		 * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y
		 *  se muestre su equivalente en romano
		 */
		Scanner leer = new Scanner(System.in);
		int num = leer.nextInt();
				
		

	}

}
