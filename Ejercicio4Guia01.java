
package javaintro01;

import java.util.Scanner;

/*Dada una cantidad de grados centígrados se debe mostrar su equivalente
en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
public class Ejercicio4Guia01{
    
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese los grados centígrados: ");
         int celcius = leer.nextInt();
         int fahrenheit = 32 + (9 * celcius / 5);
        System.out.println("El equivalente en grados Fahrenheit es: " + fahrenheit);
             
          
         
    }
        

    
}
