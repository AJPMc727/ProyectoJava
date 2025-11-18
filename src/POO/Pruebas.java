package POO;

public class Pruebas {
	
	public static void main(String[] args) {
		
		Empleados trabajador1= new Empleados("Jhordy");
		
		Empleados trabajador2=new Empleados("Andres"); 
		
		Empleados trabajador3=new Empleados("Antonio");
		
		Empleados trabajador4=new Empleados("Maria");
		
		trabajador1.cambiaSeccion("RRHH");
		
		
		System.out.println(trabajador1.devuelveDatos() + "\n" + trabajador2.devuelveDatos() + "\n" + 
		trabajador3.devuelveDatos() + "\n" + trabajador4.devuelveDatos());
		
		System.out.println(Empleados.dameSiguienteId());
		
	}

}

class Empleados{
	
	public Empleados(String nom) {
		
		nombre=nom;
		
		seccion="Administracion";
		
		Id=IdSiguiente;
		
		IdSiguiente++;
		
	}
	
	public void cambiaSeccion(String seccion) {  //setter
		
		this.seccion=seccion;
		
	}
	
	public String devuelveDatos() { //getter
		
		return "El nombre es: " + nombre + " y la seccion en la que se encuentra es:  " + seccion + " el Id es igual: " + Id; 
		
	}
	
	public static String dameSiguienteId() {
		
		return "El siguiente Id es: " + IdSiguiente;
	}
	
	private final String nombre;
	
	private String seccion;
	
	private int Id;
	
	private static int IdSiguiente=1;
}