/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej4;

/**
 *
 * @author Skaynet
 */
public class Rectangulo {
    private double longitud  = 1;
    private double anchura = 1;
    
    public Rectangulo(){}
    
    public double getLongitud(){return longitud;}
    
    public double getAnchura(){return anchura;}
    
    public void setLongitud(double nuevaLongitud){
        if (nuevaLongitud > 0 && nuevaLongitud < 20) {
            this.longitud = nuevaLongitud;
        }else{
            System.out.println("El valor ingresado es invalido! No se realizaron modificaciones.");
        }
    }
    
    public void setAnchura(double nuevaAnchura){
        if (nuevaAnchura > 0 && nuevaAnchura < 20) {
            this.anchura = nuevaAnchura;
        }else{
            System.out.println("El valor ingresado es invalido! No se realizaron modificaciones.");
        }
    }
    
    public double calcularPerimetro(){ return (getLongitud() * 2) + (getAnchura() *2);}
    
    public double calcularArea(){ return getLongitud() * getAnchura();}
}
