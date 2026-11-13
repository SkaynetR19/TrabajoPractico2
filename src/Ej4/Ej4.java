/*
Cree una clase llamada Rectángulo con los atributos longitud y anchura, 
    cada uno con un valor predeterminado de 1. 
Debe tener métodos para calcular el perímetro y el área del rectángulo. 
Debe tener métodos get y set para longitud y anchura. 
Los métodos set deben verificar que longitud y anchura sean números de punto flotante mayores de 0.0, 
    y menores de 20.0. 
Escriba un programa para probar la clase Rectángulo y cada uno de sus métodos.
 */
package Ej4;

/**
 *
 * @author Skaynet
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rec = new Rectangulo();
        
        System.out.println("Longitud: " + rec.getLongitud() + " Anchura: " + rec.getAnchura());
        System.out.println("Perimetro: " + rec.calcularPerimetro() + " Area: " + rec.calcularArea());
        
        rec.setLongitud(10);
        rec.setAnchura(15);
        System.out.println("Longitud: " + rec.getLongitud() + " Anchura: " + rec.getAnchura());
        System.out.println("Perimetro: " + rec.calcularPerimetro() + " Area: " + rec.calcularArea());
        
        rec.setLongitud(-1);
        rec.setAnchura(21);
        System.out.println("Longitud: " + rec.getLongitud() + " Anchura: " + rec.getAnchura());
        System.out.println("Perimetro: " + rec.calcularPerimetro() + " Area: " + rec.calcularArea());
    }
    
}
