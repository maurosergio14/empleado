/*

 */
package empleado;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Sergio
 */
public class Fecha {
    //Atributos
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    public String toString(){
        return dia+"-"+mes+"-"+anio;
    }
    
    public int darDiferenciaEnMeses(Fecha pFecha){
        int diferencia=0;
        int otroanio=pFecha.getAnio();
        int otroMes=pFecha.getMes();
        int otroDia=pFecha.getDia();
        //calcula la diferencia en meses
        diferencia=12*(otroanio-anio)+(otroMes-mes);
        //si el dia no es mayor, resta un mes
        if (otroDia<dia){
            diferencia--;
        }
        return diferencia;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }
    
    
    
    
    
}
