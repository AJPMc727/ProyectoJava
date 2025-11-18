package Ejercicios_D;

public class Persona {
	
	public static void main(String[] args) {
		
		Persona empleado1=new Persona("Andres", 15, "ajpm267@gmail.com");
		
		empleado1.cambioNombre("Jhordi");
		
		System.out.println(empleado1.descripcion());
		
	}
	
	public Persona(String nombre, int edad) {
		int x=0;
		for(int i=0; i<nombre.length(); i++) {
		if(nombre.charAt(i)==' ') x++; 
		}
		if(x==0)this.nombre=nombre;
		else System.out.println("El nombre no tiene que tener espacios vacios");

		if(edad<0 || edad>100) System.out.println("La edad introducida no es valida");
		else this.edad = edad;
	
	}
	
	public Persona(String nombre, int edad, String correo) {
		int x=0;
		for(int i=0; i<nombre.length(); i++) {
		if(nombre.charAt(i)==' ') x++; 
		}
		if(x==0)this.nombre=nombre;
		else System.out.println("El nombre no tiene que tener espacios vacios");

		if(edad<0 || edad>100) System.out.println("La edad introducida no es valida");
		else this.edad = edad;
	
		for(int i=0; i<correo.length(); i++) {
			if(correo.charAt(i)=='@') {
				this.correo=correo;
			}
		}
	}

	private String nombre;
	
	public void cambioNombre(String nombre) {
		int x=0;
		for(int i=0; i<nombre.length(); i++) {
		if(nombre.charAt(i)==' ') x++; 
		}
		if(x==0)this.nombre=nombre;
		else System.out.println("El nombre no tiene que tener espacios vacios");
	}
	
	public String dameNombre() {
		return nombre;
	}
	
	private int edad;
	
	public void cambioEdad(int edad) {
		if(edad<0 || edad>100) System.out.println("La edad introducida no es valida");
		else this.edad = edad;
	}
	
	public int dameEdad() {
		return edad;
	}
	
	private String correo;
	
	public void cambioCorreo(String correo) {
		for(int i=0; i<correo.length(); i++) {
			if(correo.charAt(i)=='@') {
				this.correo=correo;
			}}
		}
	
	public String dameCorreo() {
		return correo;
	}
	
	public String descripcion() {
		return "El empleado se llama " + dameNombre() + ", tiene " + dameEdad() + " anos y su correo electronico es " + dameCorreo();
	}
		
}
