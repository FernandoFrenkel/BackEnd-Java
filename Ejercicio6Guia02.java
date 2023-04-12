
package javaintro01;

import java.util.Scanner;

/*  Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.*/


public class Ejercicio6Guia02 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números enteros: ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        if (num1>25 && num2>25) {
            System.out.println("Ambos números son mayores a 25");
        } else if (num1>25 && num2<25) {
            System.out.println("El primer número es mayor a 25");
        } else if (num1<25 && num2>25) {
            System.out.println("El segundo número es mayor a 25");
        } else {
            System.out.println("Ninguno es mayor a 25");
        }
        
        
        
        
      
        
        
    }
}
