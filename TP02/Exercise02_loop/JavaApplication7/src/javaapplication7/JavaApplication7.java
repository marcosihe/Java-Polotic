/*
 * Pedir por pantalla un número entero y mostrar todos los números enteros desde
 * el 1 hasta el número ingresado por el usuario.
 */
package javaapplication7;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class JavaApplication7 {

    public static void main(String[] args) {
        System.out.print("Ingrese un numero entero mayor a 0:\n");
        Scanner keyboard = new Scanner (System.in);
        int upperBound = keyboard.nextInt();
        System.out.println("Programa para mostar todos los números enteros desde 1 hasta " + upperBound);
        for(int i = 1; i <= upperBound; i++){
            System.out.println(i);
        }
    }
    
}
