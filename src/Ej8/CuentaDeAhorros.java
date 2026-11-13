/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej8;

/**
 *
 * @author rojas
 */
public class CuentaDeAhorros {
    private static double tasaInteresAnual;
    private double saldoAhorros;
    
    public CuentaDeAhorros(double saldo){
        this.saldoAhorros = saldo;
    }
    
    public double getSaldo(){return saldoAhorros;}
    
    public static double getTasaInteres(){return tasaInteresAnual;}
    
    public static void modificarTasaInteres(double nuevaTasa){
        tasaInteresAnual = nuevaTasa;
    }
    
    public void calcularInteresMensual(){
        this.saldoAhorros += (saldoAhorros * tasaInteresAnual) / 12;
    }     
}
