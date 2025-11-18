package POO;

import java.util.Date;
import java.util.GregorianCalendar;

public class usoPersona {
	
	public static void main(String[] args) {
		
		Persona[] lasPersonas=new Persona[2];
		
		lasPersonas[0]=new Empleado2("Juan David", 1500, 2008, 2, 1 );
        lasPersonas[1]=new Alumno("Demian Martinez", "Derecho");
        
        for(Persona p:lasPersonas) {
        	
        	System.out.println(p.dameNombre() + ", " + p.dameDescripcion());
        }
	}

}

abstract class Persona{
	
	public Persona(String nom){
		
		nombre=nom;
	}
	
	public abstract String dameDescripcion();
	
	public String dameNombre() {
		
		return nombre;
	}
	
	private String nombre;
}
 
class Empleado2 extends Persona{
	
	public Empleado2(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom);
		
		sueldo=sue;
		
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		
		altaContrato=calendario.getTime();
		
		IdSiguiente=Id;
		
		Id++;
		
	}
	
	public String dameDescripcion() {
		
		return "Este empleado tiene un Id de: " + IdSiguiente + " con un sueldo de: " + sueldo;
	}
	
	public double dameSueldo() {  //getter
		
		return sueldo;
	}
	
	
	
	public Date dameFechaContrato() {  //getter
		 
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) {  //setter
		
		double aumento=sueldo*porcentaje/100;

		
		sueldo+=aumento;
	}
	
	public int dameId() {
		
		return IdSiguiente;
	}		
	
	private double sueldo;
	
	private Date altaContrato;
	
	private int IdSiguiente;		
	
	private static int Id=1;
}

class Alumno extends Persona{
	
	public Alumno(String nom, String car) {
		
		super(nom);
		
		carrera=car;
	}
	
	public String dameDescripcion() {
		
		return "El alumno es de la carrera de: " + carrera; 
	}
	
	public String dameCarrera() {
		
		return carrera;
	}
	
	private String carrera;
	
}