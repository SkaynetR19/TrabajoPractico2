/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej6;

/**
 *
 * @author Skaynet
 */
public class Articulo {
    private int nroArticulo;
    private double precio;
    
    public Articulo(int nro, double precio){
        this.nroArticulo = nro;
        this.precio = precio;
    }
    
    public int getNroArticulo(){return nroArticulo;}
    public double getPrecio(){return precio;}
    
    public void setNroArticulo(int nuevoNro){this.nroArticulo = nuevoNro;}
    public void setPrecio(double nuevoPrecio){this.precio = nuevoPrecio;}
}
