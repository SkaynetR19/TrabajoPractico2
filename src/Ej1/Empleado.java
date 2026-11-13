
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
public class Empleado {
    private String nombre;
    private String apellido;
    private double salarioM;
    
    public Empleado (String nom, String ape, double sM){
        this.nombre = nom;
        this.apellido = ape;
        this.salarioM = sM;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public double getSalario(){
        return salarioM;
    }
    
    public void setNombre(String nom){
        this.nombre = nom;
    }
    
    public void setApellido(String ape){
        this.apellido = ape;
    }
    
    public void setSalario(double sal){
        if (sal > 0) {
            this.salarioM = sal;
        }else{
            System.out.println("El salario no puede ser negativo, no se ah establecido el valor!");
        }
    }
}
