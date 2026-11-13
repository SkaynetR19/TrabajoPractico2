/*
Realizar una aplicación sencilla para simular una cuenta bancaria (caja de ahorro). 
Una cuenta bancaria vista como un objeto tiene, por una parte, atributos que definen su estado, 
    como Tipo de interés y Saldo, y por otra, operaciones que definen su comportamiento, como Establecer tipo de interés,
    Ingresar dinero, Retirar dinero, Saldo actual o Abonar intereses. 
Asegúrese que el monto a retirar no exceda el saldo de Cuenta. 
Si lo hace, el saldo debe permanecer sin cambio y el método debe imprimir un mensaje que indique 
    " El monto a retirar excede el saldo de la cuenta.” 
Realice la clase PruebaCuenta para probar los diferentes métodos.
 */
package Ej2;

/**
 *
 * @author rojas
 */
public class Cuenta {
   private boolean estado;
   private double interes;
   private double saldo;
   
   public Cuenta (boolean est, double interes, double saldo){
       this.estado = est;
       this.interes = interes;
       this.saldo = saldo;
   }
   
   public boolean getEstado(){
       return estado;
   }
   
   public double getInteres(){
       return interes;
   }
   
   public double getSaldo(){
       return saldo;
   }
   
   public void setEstado(boolean nuevoEstado){
       this.estado = nuevoEstado;
   }
   
   public void setInteres(double nuevoInteres){
       this.interes = nuevoInteres;
   }
   
   private void setSaldo(double nuevoSaldo){
       this.saldo = nuevoSaldo;
   }
   
   public void ingresarDinero(double ingreso){
       setSaldo(getSaldo() + ingreso);
   }
   
   public void retirarDinero(double retiro){
       if (retiro > getSaldo()) {
           System.out.println("El monto a retirar excede el saldo de la cuenta");
       }else{
           setSaldo(getSaldo() - retiro);
       }
   }
}
