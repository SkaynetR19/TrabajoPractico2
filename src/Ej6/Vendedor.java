/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej6;
import java.util.Arrays;
import java.util.ArrayList;
/**
 *
 * @author Skaynet
 */
public class Vendedor {
    ArrayList<GananciaDiaria> semana = new ArrayList();
    private double gananciaSemanal = 0;
    private double sueldoBase = 2000;
    
    public Vendedor(){}
    
    public double getGananciaSemanal(){return gananciaSemanal;}
    
    public void agregarDia(GananciaDiaria dia){
        semana.add(dia);
    }
    
    private void calcularGananciaSemanal(){
        for(GananciaDiaria dia : semana){
            gananciaSemanal += dia.getGanancia();
        }
    }
    
    public double calcularSueldo(){
        calcularGananciaSemanal();
        return sueldoBase + (getGananciaSemanal() * 0.06);
    }
}
