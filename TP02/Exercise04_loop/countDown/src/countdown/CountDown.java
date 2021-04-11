/*
 * Realizar un programa que realice la cuenta rergesiva para año nuevo.
 * La cuenta debe comenzar en 10 y terminar en 1
 */
package countdown;

/**
 *
 * @author Marcos
 */
public class CountDown {

    public static void main(String[] args) {
        System.out.print("Countdown:\n");
        for(int i = 10; i > 0; i--){
            System.out.println(i);
        }
        System.out.println("Happy new year!!!");
    }
}
