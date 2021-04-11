/*
 * 
 */
package amounttopay;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */

public class AmountToPay {

    public static void main(String[] args) {
        int max_NumberOfCustomers = 5;
        int plan1 = 890, plan2 = 1050, plan3 = 1600;
        int[] typeOfService = new int[max_NumberOfCustomers];
        long[] id_dni = new long[max_NumberOfCustomers];
        
        System.out.println("¡Bienvenido/a!");
        
        for(int i = 0; i < max_NumberOfCustomers; i++){
            System.out.println("\n\nIngrese el DNI del cliente: ");
            Scanner keyboard = new Scanner (System.in);
            id_dni[i] = keyboard.nextLong();
            
            do{
                System.out.println("\nElija el pack de internet que desea: \n"
                    + "1. Internet 30 megas\n"
                    + "2. Internet 50 megas\n"
                    + "3. Internet 100 megas\n"
                    + "Ingrese 1, 2 o 3 segun corresponda: ");
                Scanner keyboard_two = new Scanner (System.in);
                typeOfService[i] = keyboard_two.nextInt();
            }while(typeOfService[i] < 0 || typeOfService[i] > 3);
            /* Se debe agregar una variable de control que aumente
             * de acuerdo a la cantidad de intentos para poder 
             * salir del programa y evitar un ciclo infinito
             * (dentro de la condición del while).
            */
            switch (typeOfService[i]){
                case 1: System.out.print("\nCliente: " + id_dni[i] + "\nMonto "
                        + "a pagar: $" + (plan1 + 0.10*plan1));
                        break;
                case 2: System.out.print("\nCliente: " + id_dni[i] + "\nMonto "
                        + "a pagar: $" + (plan2 + 0.10*plan2));
                        break;
                case 3: System.out.print("\nCliente: " + id_dni[i] + "\nMonto "
                        + "a pagar: $" + (plan3 + 0.10*plan3));
                        break;
            }
        }
    }
}
