import java.util.Scanner;

class Ejercicio8_Guia3{
	public static void main (String[] args){
		Scanner leer = new Scanner(System.in);
		System.out.println("ingrese una nota");
		int nota = leer.nextInt();
		while (nota < 0 || nota > 10){
			System.out.println("ingrese una nota valida (0-10");
			int nota = leer.nextInt();
		}
	}
}
