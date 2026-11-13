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
 * @author rojas
 */
public class Factura {
    private int nroFactura;
    private int nroArticulo;
    private int cantArticulos;
    private double precioArt;
    private String descripcion;
    
    public Factura(int factura, int articulo, int cant, double precio, String descripcion){
        this.nroFactura = factura;
        this.nroArticulo = articulo;
        this.cantArticulos = cant;
        this.precioArt = precio;
        this.descripcion = descripcion;
    }
    
    public int getNroFactura(){
        return nroFactura;
    }
    
    public int getNroArticulo(){
        return nroArticulo;
    }
    
    public int getCantArticulos(){
        return cantArticulos;
    }
    
    public double getPrecio(){
        return precioArt;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setNroFactura(int nuevoNroFactura){
        this.nroFactura = nuevoNroFactura;
    }
    
    public void setNroArticulo(int nuevoNroArticulo){
        this.nroArticulo = nuevoNroArticulo;
    }
    
    public void setCant(int nuevaCant){
        this.cantArticulos = nuevaCant;
    }
    
    public void setPrecio(double nuevoPrecio){
        this.precioArt = nuevoPrecio;
    }
    
    public void setDescripcion(String nuevaDescripcion){
        this.descripcion = nuevaDescripcion;
    }
    
    public double obtenerMontoFactura(){
        return ((getCantArticulos() * getPrecio()) > 0)? getCantArticulos() * getPrecio() : 0;
    }
}
