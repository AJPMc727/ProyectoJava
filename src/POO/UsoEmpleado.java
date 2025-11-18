package POO;

import java.util.*;

public class UsoEmpleado {
	
	public static void main(String[] args) {
		
	 Datos empleado1=new Datos("Pachacuti", 85000, 2008, 2, 1);
	 
	 Datos empleado2=new Datos("Poma", 100, 2008, 1, 30);
		
	 Datos empleado3=new Datos("Martin", 105000, 2002, 12, 21);
	 
	 empleado1.subeSueldo(10);
	 
	 empleado2.subeSueldo(5);
	 
	 empleado3.subeSueldo(15);
	 
	 System.out.println("Nombre: " + empleado1.dameNombre() + 
			 " Sueldo: " + empleado1.dameSueldo() + " Fecha de alta en la empresa: " +
			 empleado1.dameAltaContrato());
	 
	 System.out.println("Nombre: " + empleado2.dameNombre() + 
			 " Sueldo: " + empleado2.dameSueldo() + " Fecha de alta en la empresa: " +
			 empleado2.dameAltaContrato());
	 
	 System.out.println("Nombre: " + empleado3.dameNombre() + 
			 " Sueldo: " + empleado3.dameSueldo() + " Fecha de alta en la empresa: " +
			 empleado3.dameAltaContrato());
	}

}

class Datos{
	
	public Datos(String nom, double sue, int agno, int mes, int dia) {

		nombre=nom;
		
		sueldo=sue;
		
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		
		altaContrato=calendario.getTime();
		
	}
	
	private String nombre;
	
	public String dameNombre() {  //getter getNombre

		return nombre;
	}
	
	private double sueldo;
	
	public double dameSueldo() {   //getter getSueldo
		
		return sueldo;
	}
	
	private Date altaContrato;
	
	public Date dameAltaContrato() { //getter getAltaContrato
		
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) { //setter
		
		double aumento=sueldo*porcentaje/100;
		
		sueldo+=aumento;
	}
}
