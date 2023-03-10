import java.util.Scanner;

public class For {

	public static void main(String[] args) {

		// Nos interesa imprimir toda la tabla del nueve

		for (int i = 1; i < 11; i++) {

			System.out.println("La tabla del nueve es " + i * 9);

		}

	}

}

public class Ejercicio1 {

	public static void main(String[] args) {
		char letra = "A";
		String frase = "Hola Mundo";
		int num1 = 77;
		float num2 = 125.5;
		long num3 = num1 * 8;
		boolean bandera = false;
		boolean logico = num1 > num2;
		system.out.println(letra + " " + frase);
		System.out.println();
		//public static void main(String[] args) {
		//	Scanner leer = new Scanner(System.in)

		}

	}

}

piblic class rentaCar{
	public static void main(String[] args){
		Scanner leer = new Sacanner(System.in);
		System.out.println("Ingrese cantidad de horas");
		int horas = leer.nextInt();
		System.out.println("Ingrese cantidad de minutos");
		int minutos = leer.nextInt();
		int tiempoTranscurrido = horas * 60 + minutos;
		if (minutos >= 0 && minutos <= 60){
			if (tiempoTranscurrido <= 120) {
				System.out.println("Importe a abonar $400");
				
			} else {
				System.out.println("Ingrese la cantidad de litros:");
				float litros = leer.nextFloat();
				System.out.println("Importe a abonar: $ " + (40*litros + (minuto *5.2)));
			}
		}else{
			System.out.println("Ingrse un valor valido \n Reinicie el programa");
		}
	}
}

public class Tornillos{
	public static void main(String[] args){
		Scanner leer = new Sacanner(System.in);
		System.out.println("Ingrese cantidad de tornillos defectuosos ");
		int defect = leer.nextInt();
		System.out.println("Ingrese cantidad de tornillos correctos ");
		int correct = leer.nextInt();
		if (defect < 200 && correct > 10000){
			System.out.println("Grado 8 ");
			
		}else if (defect > 200 && correct > 10000){
			System.out.println("Grado 7");
		}else (defect <200 && correct <10000){
			System.out.println("Grado 6 ");
		}
	} 
}

public class Ejercio7{
	public static void main(String[] args){
		Scanner leer = new Sacanner(System.in);
		System.out.println("Ingrese Tipo de MOtor. 1-4");
		int tipoMotor = leer.nextInt();
		switch (tipoMotor){
			case 1:
			System.out.println("La bomba es una bomba de agua");
			break;
			case 2:
			System.out.println("La bomba es una bomba de gasolina");
			break;
			case 3:
			System.out.println("La bomba es una bomba de hormigon");
			break;
			case 4:
			System.out.println("La bomba es una bomba de pasta alimenticia");
			break;
			default:
			System.out.println("No existe un valor valido");
			
		} 
	}
}



