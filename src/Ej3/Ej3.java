/*
 Cree una clase llamada Factura, que una ferretería podría utilizar para representar una factura para un artículo vendido en la tienda. 
Una Factura debe incluir un número de factura, un número de articulo, la descripción del articulo, 
    la cantidad de artículos de ese tipo que se van a comprar y el precio por artículo. 
Su clase debe tener un constructor que inicialice las variables de instancia. 
Proporcione los métodos get y set para cada variable de instancia. 
Además, proporcione un método llamado obtenerMontoFactura, que calcule el monto de la factura 
    (es decir, que multiplique la cantidad por el precio por artículo) y después lo devuelva como un valor double. 
Si la cantidad no es positiva, debe establecerse en 0. 
Si el precio por artículo no es positivo, debe establecerse en 0.0. 
Escriba una aplicación de prueba llamada PruebaFactura, que demuestre las capacidades de la clase Factura.
 */
package Ej3;

/**
 *
 * @author Skaynet
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Factura fact = new Factura(201243, 201, 15, 0.5, "Tornillo perforante");
        
        System.out.println("Monto de la factura: $" + fact.obtenerMontoFactura());
        
        System.out.println("Precio actual: " + fact.getPrecio());
        fact.setPrecio(-0.5);
        System.out.println("Precio modificado: " + fact.getPrecio());
        
        System.out.println("Monto de la factura: $" + fact.obtenerMontoFactura());
        
        fact.setPrecio(0.5);
        System.out.println("Precio restaurado: " + fact.getPrecio());
        
        System.out.println("Monto de la factura: $" + fact.obtenerMontoFactura());
        
        System.out.println("Cantidad Actual: " + fact.getCantArticulos());
        fact.setCant(-1);
        System.out.println("Cantidad Modificada: " + fact.getCantArticulos());
        
        System.out.println("Monto de la factura: $" + fact.obtenerMontoFactura());
        
        fact.setCant(15);
        System.out.println("Cantidad restaurada: " + fact.getCantArticulos());
        
        System.out.println("Monto de la factura: $" + fact.obtenerMontoFactura());
    }
    
}
