/*
El sector de ventas online de notebooks Lenovo paga a sus vendedores mediante comisiones. 
Los vendedores reciben $2000 por semana, más el 6% de sus ventas brutas durante esa semana. 
Por ejemplo, un vendedor que vende $50000 de mercancía en una semana, recibe $2000 más el 6% de $50000, 
    o un total de $5000. 
Usted acaba de recibir una lista de los artículos vendidos por cada vendedor. 
Los valores de estos artículos son los siguientes:
Articulo                     Valor
     1                      $ 7239.99
     2                      $ 9129.75
     3                      $ 6899.95
     4                      $ 13150.89
Desarrolle una aplicación en JAVA que reciba como entrada los artículos vendidos por un vendedor 
    durante cada día de la última semana, y que calcule y muestre los ingresos de ese vendedor. 
No hay límite en cuanto al número de artículos que un representante puede vender.
 */
package Ej6;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Skaynet
 */
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Articulo> listaArticulos = new ArrayList<>();
        listaArticulos.add(new Articulo(1,7239.99));
        listaArticulos.add(new Articulo(2,9129.75));
        listaArticulos.add(new Articulo(3,6899.95));
        listaArticulos.add(new Articulo(4,13150.89));
        
        Vendedor luis = new Vendedor();
        
        for (int i = 0; i < 7; i++) {
            GananciaDiaria dia = new GananciaDiaria();
            int nroArt = 0;
            int cant = 0;
            boolean find = false;
            
            System.out.println("Ventas del dia " + (i+1));
            do {
                System.out.println("Ingrese el numero de articulo (0 para finalizar el dia)");
                nroArt = sc.nextInt();
                
                for(Articulo art : listaArticulos){
                    if (art.getNroArticulo() == nroArt) {
                        System.out.println("Ingrese la cantidad: ");
                        cant = sc.nextInt();
                        dia.agregarVenta(art, cant);
                        find = true;
                    }
                }
                if (!find && nroArt != 0) {
                    System.out.println("Articulo no encontrado!");
                }
                
                find = false;
                cant = 0;
            } while (nroArt > 0);
            
            luis.agregarDia(dia);
        }
        
        System.out.println("Ganancia de la semana del vendedor: " + luis.calcularSueldo());
        sc.close();
    }
    
}
