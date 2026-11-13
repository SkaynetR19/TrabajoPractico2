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
public class Fecha {
    private int mes;
    private int dia;
    private int anio;

    private static final String[] NOMBRES_MESES = {
        "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO",
        "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"
    };

    public Fecha(int mes, int dia, int anio) {
        establecerFecha(mes, dia, anio);
    }

    public Fecha(String nombreMes, int dia, int anio) {
        int mesNumero = convertirMesAEntero(nombreMes);
        establecerFecha(mesNumero, dia, anio);
    }

    public Fecha(int dia, String nombreMes, int anioCorto) {
        int mesNumero = convertirMesAEntero(nombreMes);
        int anioCompleto = (anioCorto < 100) ? (2000 + anioCorto) : anioCorto;
        establecerFecha(mesNumero, dia, anioCompleto);
    }

    public int getMes() {return mes;}
    public int getDia() {return dia;}
    public int getAnio() {return anio;}
    
    public void setMes(int mes) {establecerFecha(mes, this.dia, this.anio);}
    public void setDia(int dia) {establecerFecha(this.mes, dia, this.anio);}
    public void setAnio(int anio) {establecerFecha(this.mes, this.dia, anio);}
    
    private void establecerFecha(int mes, int dia, int anio) {
        if (anio > 0) {
            this.anio = anio;
        } else {
            System.out.println("Año inválido! Se asigna 2000 por defecto.");
            this.anio = 2000;
        }

        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            System.out.println("Mes inválido! Se asigna 1 (Enero) por defecto.");
            this.mes = 1;
        }

        int maxDias = 31;
        if (dia >= 1 && dia <= maxDias) {
            this.dia = dia;
        } else {
            System.out.println("Día inválido (" + dia + ") para el mes " + this.mes + ". Se asigna 1 por defecto.");
            this.dia = 1;
        }
    }

    private int convertirMesAEntero(String nombreMes) {
        if (nombreMes != null) {
            
            nombreMes = nombreMes.toUpperCase();
            
            for (int i = 0; i < NOMBRES_MESES.length; i++) {
                if (NOMBRES_MESES[i].equals(nombreMes)) {
                    return i + 1;
                }
            }
        }
        System.out.println("Nombre de mes no reconocido: '" + nombreMes + "'. Se toma 1 por defecto.");
        return 1;
    }

    public void mostrarFecha() {
        mostrarFormato1();
        mostrarFormato2();
        mostrarFormato3();
    }

    public void mostrarFormato1() {
        System.out.println(mes + " / " +  dia + " / " + anio);
    }

    public void mostrarFormato2() {        
        System.out.println(NOMBRES_MESES[mes - 1] + ", " +  dia + ", " +  anio);
    }

    public void mostrarFormato3() {        
        System.out.println(dia + " " + NOMBRES_MESES[mes - 1] + " " + anio % 100);
    }
}
