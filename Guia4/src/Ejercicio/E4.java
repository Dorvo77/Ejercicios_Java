package Ejercicio;

import java.util.Scanner;

public class E4 {
	public static boolean esPrimo(int num) { // Definir una función que recibe un número como parámetro y devuelve un valor booleano
	        if (num <= 1) { // Si el número es menor o igual a 1, no es primo
	            return false; // Devolver falso
	        }
	        for (int i = 2; i < num; i++) { // Recorrer los números desde 2 hasta num - 1
	            if (num % i == 0) { // Si el número es divisible por algún otro número, no es primo
	                return false; // Devolver falso
	            }
	        }
	        return true; // Si no se encontró ningún divisor, el número es primo. Devolver verdadero.
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
        System.out.println("Ingrese un número:");
        int num = sc.nextInt(); 
        sc.close(); // Cerrar el objeto Scanner

        boolean esPrimo = esPrimo(num); // Llamar a la función esPrimo y asignar el resultado a la variable esPrimo

        if (esPrimo) { // Si esPrimo es verdadero, significa que el número es primo
            System.out.println("El número es primo."); // Imprimir este mensaje
        } else { // Si no, significa que el número no es primo
            System.out.println("El número no es primo."); // Imprimir este otro mensaje
        }

	}

}
