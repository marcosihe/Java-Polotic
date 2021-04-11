/*
 * Mostrar por pantalla palabras que sean ingresadas por teclado
 * hasta que se ingrese la palabra "salir".
 */
package showstrings;
import java.util.Scanner;

/**
 *
 * @author soledad
 */
public class ShowStrings {

    public static void main(String[] args) {
        System.out.print("Todas las palabras que ingrese por teclado serán mostradas por pantalla\n");
        System.out.print("Cuando desee terminar, ingrese la palabra 'salir' y se cerrará el programa.\n");
        String text = "salir";
        do{
            System.out.print("Ingrese una palabra: ");
            Scanner keyboard = new Scanner (System.in);
            text = keyboard.nextLine();
            if(!text.toLowerCase().trim().equals("salir")){
                System.out.println(text);
            }
        }while(!text.toLowerCase().trim().equals("salir"));
    }
    
}
