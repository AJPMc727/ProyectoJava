package Ejercicios_D;

public class ejercicioObject {
	
	public static void main(String[] args) {
		
		Gato cat1=new Gato("Negro", 1);
		Gato cat2=new Gato("Negro", 2);
		
		System.out.println((cat1.clone()).getColorPelo());
		
		System.out.println((cat1.clone()).equals(cat1));
		
		System.out.println(cat1.equals(cat2));
	
	}

}

class Gato{
	
	public Gato(String colorPelo, int edad) {
		
		this.colorPelo=colorPelo;
		this.edad=edad;
	}
	
	public String getColorPelo() {
		
		return colorPelo;
	}
	
	public int getEdad() {
		
		return edad;
	}
	
	@Override
	public Gato clone() {
		
		return new Gato(this.colorPelo, this.edad);
	}
	
	@Override
	public boolean equals(Object a) {
		
		if(a instanceof Gato ) {
			if(((Gato)a).getColorPelo().equals(this.colorPelo) && ((Gato)a).getEdad()==(this.edad)) {
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		
		int numero=1;
		
		return numero;
	}
	
	private String colorPelo;
	private int edad;
}