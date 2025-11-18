package POO;

import java.util.*;

public class uso_Empleado {

	public static void main(String[] args) {

		/*Empleado empleado1=new Empleado("Jhordy", 85000, 1990, 12, 17);
		
		Empleado empleado2=new Empleado("Andres", 95000, 1995, 06, 02);
		
		Empleado empleado3=new Empleado("Maria", 105000, 2002, 03, 15);
		
		empleado1.subeSueldo(5);

		empleado2.subeSueldo(5);
		
		empleado3.subeSueldo(5);
	
	System.out.println("Nombre: " + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo()
	+ " Fecha de alta: " + empleado1.dameFechaContrato());
	
	System.out.println("Nombre: " + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo()
	+ " Fecha de alta: " + empleado2.dameFechaContrato());
	
	System.out.println("Nombre: " + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo()
	+ " Fecha de alta: " + empleado3.dameFechaContrato());*/
		
		Jefatura jefeRRHH=new Jefatura("Juan", 55000, 2006, 9, 25);
		
		jefeRRHH.estableceIncentivo(2570);
		
		Empleado[] misEmpleados=new Empleado[6];
		
		misEmpleados[0]=new Empleado("Jhordy", 85000, 1990, 12, 17);
         	
		misEmpleados[1]=new Empleado("Andres", 95000, 1995, 06, 02);
		
		misEmpleados[2]=new Empleado("Maria", 105000, 2002, 03, 15);
		
		misEmpleados[3]=new Empleado("Antonio");
		
		misEmpleados[4]=jefeRRHH; //Polimorfismo en accion. Principio de sustitucion
			
		misEmpleados[5]=new Jefatura("Maria", 95000, 1999, 05, 26);	
		
		Jefatura jefeFinanzas=(Jefatura) misEmpleados[5];
		
		jefeFinanzas.estableceIncentivo(55000);

		/*for(int i=0; i<3; i++) {
			
			misEmpleados[i].subeSueldo(5);
		
		}*/
		
		System.out.println(jefeFinanzas.tomarDecisiones("dar mas dias de vacaciones a los empleados"));
		
		System.out.println("El jefe  " + jefeFinanzas.dameNombre() + " tiene un bonus de " + 
		jefeFinanzas.estableceBonus(500));
		
		System.out.println(misEmpleados[3].dameNombre() + " tiene un bonus de: " + misEmpleados[3].estableceBonus(200));
		
		Arrays.sort(misEmpleados);
		
		for(Empleado e: misEmpleados) {
			
			e.subeSueldo(5); 
		}
		
		
		/*for(int i=0; i<3; i++) {
			
			System.out.println("Nombre: " + misEmpleados[i].dameNombre() + " Sueldo: " + misEmpleados[i].dameSueldo() + " Fecha de alta: " + misEmpleados[i].dameFechaContrato());
		}*/
		
		
		for(Empleado e:misEmpleados) {
			
			System.out.println("Nombre: " + e.dameNombre() + " Sueldo: " + e.dameSueldo() + " Fecha de alta: " +e.dameFechaContrato() + " y Id: " + e.dameId());
			
		}
	}
	}


class Empleado implements Comparable, Trabajadores{
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		
		nombre=nom;
		
		sueldo=sue;
		
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		
		altaContrato=calendario.getTime();
		
		IdSiguiente=Id;
		
		Id++;
		
	}

	public double estableceBonus(double gratificacion) {
		
		return Trabajadores.bonusBase + gratificacion;
	}
	
	public Empleado(String nom) {
		
		this(nom,30000,2000,01,01);

	}
	
	public String dameNombre() {  //getter
		
		return nombre;
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

	public int compareTo(Object miObjeto) {
		
		Empleado otroEmpleado=(Empleado)miObjeto;
		
		if(this.sueldo<otroEmpleado.sueldo) {
			
			return -1;
		}
		
		if(this.sueldo>otroEmpleado.sueldo) {
			
			return 1;
		}
		
		return 0;
	}
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
	
	private int IdSiguiente;
	
	private static int Id=1;
}

class Jefatura extends Empleado implements Jefes{
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom, sue, agno, mes, dia);
		
	}
	
	public double estableceBonus(double gratificacion) {
		
		double prima=2000;
		
		return Trabajadores.bonusBase + gratificacion + prima;
	}
	
	public String tomarDecisiones(String decision) {
		
		return "Un miembro de la direccion ha tomado la decision de: " + decision;
	}
	
	public void estableceIncentivo(double incentivo) {
		
		this.incentivo=incentivo;
	}
	
	public double dameSueldo() {
		
		double sueldoJefe = super.dameSueldo();
		
		return sueldoJefe + incentivo;
	}
	
	private double incentivo;
	
}

