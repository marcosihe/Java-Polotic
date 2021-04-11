/*
 * Realizar un programa que muestre por pantalla los números del 200 al 250
 * saltando de dos en dos. La secuencia debería ser: 200, 202, 204, ...
 */
package showpairs;

/**
 *
 * @author Marcos
 */
public class showPairs {

    public static void main(String[] args) {
        int lowerBound = 200, upperBound = 250;
        for(int i = lowerBound; i <= upperBound; i++){
            System.out.println(i++);
        }
    }
    
}
