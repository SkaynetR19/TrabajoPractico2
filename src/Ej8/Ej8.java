/*
 Cree una clase llamada CuentaDeAhorros. Use una variable static llamada tasalnteresAnual para almacenar 
    la tasa de interés anual para todos los clientes. 
Cada objeto de la clase debe contener una variable de instancia llamada saldoAhorros, 
    que indique la cantidad que el ahorrador tiene actualmente en depósito. 
Proporcione el método calcularlnteresMensual para calcular el interés mensual, 
    multiplicando el saldoAhorros por la tasalnteresAnual dividida entre 12; este interés debe sumarse al saldoAhorros. 
Proporcione un método static llamado modificarTasalnteres 
    para establecer la tasalnteresAnual en un nuevo valor. 
Escriba un programa para probar la clase CuentaDeAhorros. 
Cree dos instancias de objetos CuentaDeAhorros, ahorradorl y ahorrador2, 
    con saldos de $20000.00 y $30000.00. 
Establezca la tasalnteresAnual en 4%, después calcule el interés mensual para cada uno de los 12 meses 
    e imprima los nuevos saldos para ambos ahorradores. 
Luego establezca la tasalnteresAnual en 5%, calcule el interés del siguiente mes e imprima los nuevos saldos para ambos ahorradores.
 */
package Ej8;

/**
 *
 * @author rojas
 */
public class Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaDeAhorros ahorrador1 = new CuentaDeAhorros(20000);
        CuentaDeAhorros ahorrador2 = new CuentaDeAhorros(30000);
        
        CuentaDeAhorros.modificarTasaInteres(0.04);
        
        for (int i = 0; i < 12; i++) {
            ahorrador1.calcularInteresMensual();
            ahorrador2.calcularInteresMensual();
        }

        System.out.println("Saldo del ahorrador 1 al 4%: " + ahorrador1.getSaldo());
        System.out.println("Saldo del ahorrador 2 al 4%: " + ahorrador2.getSaldo());
        
        CuentaDeAhorros.modificarTasaInteres(0.05);
        
        ahorrador1.calcularInteresMensual();
        ahorrador2.calcularInteresMensual();
        System.out.println("Saldo del ahorrador 1 del siguiente mes al 5%: " + ahorrador1.getSaldo());
        System.out.println("Saldo del ahorrador 2 del siguiente mes al 5%: " + ahorrador2.getSaldo());
    }
    
}
