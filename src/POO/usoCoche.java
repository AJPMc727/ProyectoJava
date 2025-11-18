package POO;

public class usoCoche {
	
	public static void main(String[] args) {
		
		Coche coche1=new Coche();
		
		coche1.setAsientosCuero("si");
		
		System.out.println("Peso: " + coche1.getPeso());
		System.out.println("Precio: " + coche1.getPrecio());
	}

}
