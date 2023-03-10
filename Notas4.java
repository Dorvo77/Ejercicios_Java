
/*
 * El promedio de los trabajos prácticos de un curso se calcula en base a cuatro notas de las
//cuales se elimina la nota menor y se promedian las tres notas más altas. Escriba un
//programa que determine cuál es la nota eliminada y el promedio de los trabajos prácticos
//de un estudiante.
 */
import java.util.Scanner;

public class Notas4 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("INgrese Nota 1");
        float nota1 = leer.nextFloat();
        System.out.println("INgrese Nota 2");
        float nota2 = leer.nextFloat(); 
        System.out.println("INgrese Nota 3");
        float nota3 = leer.nextFloat();
        System.out.println("INgrese Nota 4");
        float nota4 = leer.nextFloat();
        if (nota1 < nota2 && nota1 < nota3 && nota1 < nota4) {
            System.out.println(" Nota 1 eliminada ");
            System.out.println(" Promedio Notas = " + ((nota2+nota3+nota4)/3);
      
        }else if( nota2 < nota1 && nota2 < nota3 && nota2 < nota4) {
            System.out.println(" Nota 2 eliminada ");
            System.out.println(" Promedio Notas = " + ((nota1+nota3+nota4)/3);
            
        }else if( nota3 < nota1 && nota3 < nota2 && nota3 < nota4) {
            System.out.println(" Nota 3 eliminada ");
            System.out.println(" Promedio Notas = " + ((nota1+nota2+nota4)/3);
        }else{
            System.out.println(" Nota 4 eliminada ");
            System.out.println(" Promedio Notas = " + ((nota1+nota2+nota3)/3);
        }
    }

}
