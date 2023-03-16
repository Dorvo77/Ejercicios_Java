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
// Ejercicio 12 Guia 4
public class Multiplo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario
        System.out.println("Ingrese el primer número entero:"); // Pedir al usuario que ingrese el primer número entero
        int num1 = sc.nextInt(); // Leer el primer número entero y asignarlo a la variable num1
        System.out.println("Ingrese el segundo número entero:"); // Pedir al usuario que ingrese el segundo número entero
        int num2 = sc.nextInt(); // Leer el segundo número entero y asignarlo a la variable num2
        sc.close(); // Cerrar el objeto Scanner

        if (num1 % num2 == 0) { // Si el resto de dividir num2 entre num1 es cero, significa que num2 es múltiplo de num1
            System.out.println("El segundo número es múltiplo del primero."); // Imprimir este mensaje
        } else { // Si no, significa que num2 no es múltiplo de num1
            System.out.println("El segundo número no es múltiplo del primero."); // Imprimir este otro mensaje
        }
    }
}