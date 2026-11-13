/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej7;

/**
 *
 * @author rojas
 */
public class RegistroVentas {
    private static final int cantProductos = 5;
    private static final int cantVendedores = 4;
    private double[][] ventas = new double[cantProductos][cantVendedores];

    public RegistroVentas() {}
   
    public void agregarNotaVenta(int vendedor, int producto, double monto) {
        if (vendedor >= 1 && vendedor <= cantVendedores &&
            producto >= 1 && producto <= cantProductos &&
            monto >= 0) {
            
            ventas[producto - 1][vendedor - 1] += monto;
        } else {
            System.out.println("Datos inválidos: verifique el número de vendedor (1-4), producto (1-5) y monto positivo.");
        }
    }
  
    public void mostrarResumen() {
        double[] totalPorVendedor = new double[cantVendedores];
        double granTotal = 0;

        System.out.println("\n===========================================================================");
        System.out.printf("%-12s %12s %12s %12s %12s %12s%n", 
                "Producto", "Vendedor 1", "Vendedor 2", "Vendedor 3", "Vendedor 4", "Total Prod.");
        System.out.println("---------------------------------------------------------------------------");
        
        for (int i = 0; i < cantProductos; i++) {
            double totalFilaProducto = 0;
            System.out.printf("Producto %-3d ", (i + 1));
           
            for (int j = 0; j < cantVendedores; j++) {
                double monto = ventas[i][j];
                System.out.printf("%12.2f ", monto);
                
                totalFilaProducto += monto;
                totalPorVendedor[j] += monto;
            }

            System.out.printf("%12.2f%n", totalFilaProducto);
            granTotal += totalFilaProducto;
        }

        System.out.println("---------------------------------------------------------------------------");
        
        System.out.printf("%-12s ", "Total Vend.");
        for (int i = 0; i < cantVendedores; i++) {
            System.out.printf("%12.2f ", totalPorVendedor[i]);
        }

        System.out.printf("%12.2f%n", granTotal);
        System.out.println("===========================================================================");
    }
}
