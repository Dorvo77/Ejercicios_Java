/*Escriba un programa que lea 20 números. 
Si el número leído es igual a cero se debe salir del bucle y mostrar
el mensaje "Se capturó el numero cero". 
El programa deberá calcular y mostrar el resultado de la suma de los números leídos,
pero si el número es negativo no debe sumarse. 
Nota: recordar el uso de la sentencia break.
*
*/

import java.util.Scanner;

class Ejercicio9_Guia3{
	public static void main (String[] args){
			Scanner leer = new Scanner(System.in);
			int i = 1;
			int suma = 0;
			System.out.println("ingrese un numero");
			int num = leer.nextInt();
			while (i<20){
				if (num == 0){
					System.out.println("SE capturo el numero #cero#");
					break;
				}else if (num>0){
					suma += num;
				}
				
				System.out.println("ingrese un numero");
				int nota = leer.nextInt();
				i++;
			}
			System.out.println("La suma es " + suma);
	}
}
