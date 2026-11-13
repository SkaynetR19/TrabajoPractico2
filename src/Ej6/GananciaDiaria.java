/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej6;

/**
 *
 * @author Skaynet
 */
public class GananciaDiaria {
    private double gananciaAcumulada = 0;
    private int cantVentas = 0;
    
    public GananciaDiaria(){}
    
    public double getGanancia(){return gananciaAcumulada;}
    public int getCantVentas(){return cantVentas;}
    
    public void agregarVenta(Articulo x, int cant){
        if (cant > 0) {
            gananciaAcumulada = x.getPrecio() * cant;
            cantVentas++;
        }else{
            System.out.println("La cantidad de articulos debe ser mayor a 0. No se ah agregado la venta.");
        }
    }
}
