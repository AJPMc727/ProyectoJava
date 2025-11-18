import javax.swing.*;

public class UsoVehiculo {

	public static void main(String[] args) {
		
		/*Coche renault=new Coche();
		
		renault.setRuedas(3);;
		
		renault.arrancar();
		
		Coche mazda=new Coche();
		
		mazda.setColor("azul");
		
		mazda.girar();  
		
		System.out.println("El renault tiene: " + renault.getRuedas() + " ruedas");
		
		System.out.println("El mazda tiene: " + mazda.getRuedas() + " ruedas");
		
		System.out.println("El renault tiene el color: " + renault.getColor());
		
		System.out.println("El mazda tiene el color: " + mazda.getColor());
		
		// Inicio de videos antiguos 
		
		Coche miCoche=new Coche();
		
		System.out.println(miCoche.datos_generales());
		
		miCoche.asientos_cuero(JOptionPane.showInputDialog("El coche lleva asientos de cuero?"));
		
		miCoche.climatizador(JOptionPane.showInputDialog("El coche lleva climatizador?"));
	
		System.out.println(miCoche.dime_asientos());
		
		System.out.println(miCoche.dime_climatizador());
		
		System.out.println(miCoche.dime_peso_coche());
		
		System.out.println(miCoche.dime_precio());*/
		
		Coche miCoche1=new Coche();
		
		miCoche1.setColor("Rojo");
		
		Furgoneta miFurgoneta1=new Furgoneta(7, 580);
		
		miFurgoneta1.setColor("Azul");
		
		miFurgoneta1.asientos_cuero("Si");
		
		miFurgoneta1.climatizador("Si");
		
		System.out.println(miCoche1.datos_generales() + " " + miCoche1.getColor());
		
		System.out.println(miFurgoneta1.datos_generales() + " " + miFurgoneta1.dimeDatosFurgoneta());
	}
}
