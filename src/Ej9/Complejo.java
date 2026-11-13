/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej9;

/**
 *
 * @author rojas
 */
public class Complejo {
    private double parteReal;
    private double parteImaginaria;
    
    public Complejo(double parteR, double parteI){
        this.parteReal = parteR;
        this.parteImaginaria = parteI;
    }
    
    public Complejo(){
        this.parteReal = 1;
        this.parteImaginaria = 1;
    }
    
    public double getParteReal(){return parteReal;}
    public double getParteImaginaria(){return parteImaginaria;}
    
    public void setParteReal(double nuevaParteR){this.parteReal = nuevaParteR;}
    public void setParteImaginaria(double nuevaParteI){this.parteImaginaria = nuevaParteI;}
    
    public static Complejo sumarComplejos(Complejo num1, Complejo num2){
        double parteReal = num1.getParteReal() + num2.getParteReal();
        double parteImaginaria = num1.getParteImaginaria() + num2.getParteImaginaria();
        return new Complejo(parteReal, parteImaginaria);
    }
    
    public static Complejo restarComplejos(Complejo num1, Complejo num2){
        double parteReal = num1.getParteReal() - num2.getParteReal();
        double parteImaginaria = num1.getParteImaginaria() - num2.getParteImaginaria();
        return new Complejo(parteReal, parteImaginaria);
    }
    
    public void mostrarComplejo(){
        if (getParteImaginaria() > 0) {
            System.out.println(getParteReal() + " +" + getParteImaginaria() + "i");
        }else{
            System.out.println(getParteReal() + " " + getParteImaginaria() + "i");
        }        
    }
}
