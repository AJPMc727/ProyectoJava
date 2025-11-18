import javax.swing.*;

public class ejercicio1Panels {

	public static void main(String[] args) {
		
		int aleatorio=(int)(Math.random()*100)+1;
		
		JOptionPane.showMessageDialog(null, "Un numero se perdio, ayudanos a encontrarlo :(","Numero Perdido", JOptionPane.INFORMATION_MESSAGE);
		
		int costo=0, intento=0;
		
		while(aleatorio!=intento) {
		
		intento=Integer.parseInt(JOptionPane.showInputDialog(null,"Adivina el numero escondido", "Numero perdido", JOptionPane.QUESTION_MESSAGE));
		
		if (intento>aleatorio) {
			JOptionPane.showMessageDialog(null, "Piensa en pequeno", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
		}
		if (intento<aleatorio) {
			JOptionPane.showMessageDialog(null, "Piensa en grande", "Respuesta", JOptionPane.INFORMATION_MESSAGE); 
		}
		
		costo=costo+1;
	}
		JOptionPane.showMessageDialog(null, "Felicidades adivinaste el numero en " + costo + " intentos :D");
	}
}