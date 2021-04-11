/*
 *
 */
package basiccalculator;

import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class BasicCalculator {
    
    public static void main(String[] args) {
        int operation;
        int numbers[] = new int[2];
        
        System.out.println("Basic Calculator\n");
        for(int i = 0; i < 2; i++){
            System.out.println("\nIngrese el " + (i+1) + "º numero");
            Scanner keyboard = new Scanner (System.in);
            numbers[i] = keyboard.nextInt();
        }
        do{
            System.out.println("\n\nElija la operación: "
                + "\n1. + (suma)"
                + "\n2. - (diferencia)"
                + "\n3. * (producto)"
                + "\n4. / (cociente)"
                + "\nElija 1, 2, 3 o 4 segun corresponda");
            Scanner keyboard_two = new Scanner (System.in);
            operation = keyboard_two.nextInt();
            if(operation < 1 || operation > 4){
                System.out.println("\n¡Debe seleccionar una opcion valida!");
            }
        }while(operation < 1 || operation > 4);
        switch(operation){
            case 1: System.out.println(numbers[0] + " + " + numbers[1] + " = "
                    + "" + (numbers[0] + numbers[1]));
                break;
            case 2: System.out.println(numbers[0] + " - " + numbers[1] + " = "
                    + "" + (numbers[0] - numbers[1]));
                break;
            case 3: System.out.println(numbers[0] + " * " + numbers[1] + " = "
                    + "" + (numbers[0] * numbers[1]));
                break;
            case 4: if(numbers[1]==0){
                System.out.println("\nNo se puede dividir por cero.");
            }else{
                System.out.println(numbers[0] + " / " + numbers[1] + " = "
                        + "" + ((float)numbers[0] / (float)numbers[1]));
            }
        }
        
    }
    
}
