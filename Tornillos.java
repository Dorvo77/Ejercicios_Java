import java.util.Scanner;

public class Tornillos {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
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