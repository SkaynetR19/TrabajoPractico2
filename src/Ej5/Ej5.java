/*
Cree una clase llamada Fecha, que incluya tres variables de instancia: un mes (int), 
    un día (int) y un año (int). 
Su clase debe tener un constructor que inicialice las tres variables de instancia, 
    y debe verificar que los valores que se proporcionan son correctos. 
Proporcione los métodos get y set para cada variable de instancia. 
Proporcione un método mostrarFecha , para Imprimir la fecha en varios formatos, como
     05/21/2010
     Junio 14, 2012
     20 Agosto 11
Usar constructores sobrecargados para crear objetos Fecha inicializados con fechas de los 
    formatos solicitados para imprimir. 
En el primer caso, el constructor debe recibir tres valores enteros. 
En el segundo, debe recibir un objeto String y dos valores enteros. 
En el tercero debe recibir un valor entero, string y otro entero. 
Escriba una aplicación de prueba llamada PruebaFecha, 
que demuestre las capacidades de la clase Fecha.
*/
package Ej5;

/**
 *
 * @author Skaynet
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha fecha1 = new Fecha(5, 21, 2010);
        System.out.println("Fecha 1: ");
        fecha1.mostrarFecha();

        Fecha fecha2 = new Fecha("Junio", 14, 2012);
        System.out.println("\nFecha 2: ");
        fecha2.mostrarFecha();
        
        Fecha fecha3 = new Fecha(20, "Agosto", 11);
        System.out.println("\nFecha 3: ");
        fecha3.mostrarFecha();
        
        System.out.println("\nPrueba de Modificación");
        fecha1.setMes(12);
        fecha1.setDia(31);
        fecha1.setAnio(2025);
        System.out.println("\nFecha 1 modificada: ");
        fecha1.mostrarFecha();

        System.out.println("\nPrueba de Validación con Valores Inválidos");
        Fecha fechaInvalida = new Fecha(2, 33, 2023);
        System.out.println("\nResultado tras corrección por defecto: ");
        fechaInvalida.mostrarFecha();
    }
}