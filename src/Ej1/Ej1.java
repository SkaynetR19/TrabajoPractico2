/*
Cree una clase llamada Empleado, que incluya tres variables de instancia: el nombre (String),
    un apellido (String) y un salario mensual (double). 
Su clase debe tener un constructor que inicialice las tres variables de instancia. 
Proporcione los métodos get y set para cada variable de instancia. 
Si el salario mensual no es positivo, no establezca su valor. 
Escriba una aplicación de prueba llamada PruebaEmpleado, que demuestre las capacidades de la clase Empleado. 
Cree dos objetos Empleado y muestre el salario anual de cada objeto. 
Después, proporcione a cada Empleado un aumento del 10% y muestre el salario anual de cada Empleado otra vez.
 */
package Ej1;

/**
 *
 * @author rojas
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Evan", "Angeline", 1000);
        Empleado emp2 = new Empleado("Cris", "Galarza", 1050);
        
        System.out.println("Salario Anual de " + emp1.getNombre() + ": " + emp1.getSalario()*12);
        System.out.println("Salario Anual de " + emp2.getNombre() + ": " + emp2.getSalario()*12);
        
        emp1.setSalario(emp1.getSalario() * 1.1);
        emp2.setSalario(emp2.getSalario() * 1.1);
        
        System.out.println("Salario Anual de " + emp1.getNombre() + ": " + emp1.getSalario()*12);
        System.out.println("Salario Anual de " + emp2.getNombre() + ": " + emp2.getSalario()*12);
    }
    
}
