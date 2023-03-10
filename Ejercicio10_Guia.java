/*Realizar un programa que lea 4 números (comprendidos entre 1 y 20)
 e imprima el número ingresado seguido de tantos asteriscos como indique su valor. 
 Por ejemplo:
5 *****
3 ***
11 ***********
2 **

*/

import java.util.Scanner;

class Ejercicio10_Guia3{
	public static void main (String[] args){
			Scanner leer = new Scanner(System.in);
			for (i=1; 1<5; i++){
				System.out.println("Ingrese un numero");
				leer int num = leer.nextInt();
				System.out.print(num);
				for(j=1; j<=num; j++){
					System.out.print("*");
				}
				System.out.println();
			}
	}
}