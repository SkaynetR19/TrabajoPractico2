/*
 
 */
package Ej9;

/**
 *
 * @author rojas
 */
public class Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Complejo num1 = new Complejo(1,-2);
        Complejo num2 = new Complejo();
        
        num1.mostrarComplejo();
        num2.mostrarComplejo();
        
        Complejo num3 = Complejo.sumarComplejos(num1, num2);
        Complejo num4 = Complejo.restarComplejos(num1, num2);
        
        num3.mostrarComplejo();
        num4.mostrarComplejo();
    }
    
}
