package empleado;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Sergio
 */
public class Empleado {

    //Atributos
    private String nombre, apellido, imagen;
    private int genero; 
    private Fecha fechaNacimiento;
    private Fecha fechaIngreso;
    private double salario;

    //Constructor
    public Empleado() {
        nombre = "Sergio";
        apellido = "Ferrer";
        genero = 1;
        fechaNacimiento = new Fecha(14, 10, 1980);
        fechaIngreso = new Fecha(13, 7, 2003);
        imagen = "empleado.png";
        salario = 50000;
    }

    public int calcularEdad() {
        Fecha hoy = darFechaActual();
        int edad = fechaNacimiento.darDiferenciaEnMeses(hoy) / 12;
        return edad;
    }

    public int calcularAntiguedad() {
        Fecha hoy = darFechaActual();
        int antiguedad = fechaIngreso.darDiferenciaEnMeses(hoy) / 12;
        return antiguedad;
    }
    
    public double calcularPrestaciones(){
        int antiguedad=calcularAntiguedad();
        double prestaciones=((double)(antiguedad*salario))/12;
        return prestaciones;
    }
    
    public void cambiarEmpleado(String pNombre,String pApellido,int pGenero,Fecha pFechaNacimiento,Fecha pFechaIngreso,int pSalario,String pImagen){
        nombre=pNombre;
        apellido=pApellido;
        genero=pGenero;
        fechaNacimiento=pFechaNacimiento;
        fechaIngreso=pFechaIngreso;
        salario=pSalario;
        imagen=pImagen;
    }
    public void cambiarSalario(double pSalario){
        salario=pSalario;
    }
    
    public Fecha darFechaActual(){
        GregorianCalendar gc=new GregorianCalendar();
        int dia=gc.get(Calendar.DAY_OF_MONTH);
        int mes=gc.get(Calendar.MONTH)+1;
        int anio=gc.get(Calendar.YEAR);
        Fecha hoy=new Fecha(dia, mes, anio);
        return hoy;
    }
    
    public String metodo1(){
        return "Respuesta 1";
    }
    public String metodo2(){
        return "Respuesta 2";
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getImagen() {
        return imagen;
    }

    public int getGenero() {
        return genero;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Fecha getFechaIngreso() {
        return fechaIngreso;
    }

    public double getSalario() {
        return salario;
    }

}
