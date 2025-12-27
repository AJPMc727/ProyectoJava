package graficos;

import java.awt.event.*;

import javax.swing.*;

public class CreandoMultiplesOyentes {

	public static void main(String[] args) {
		
		MarcoMultiplesOyentes miMarco=new MarcoMultiplesOyentes();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoMultiplesOyentes extends JFrame{
	
	public MarcoMultiplesOyentes() {
		
		setBounds(1000, 150, 250, 150);
		
		setTitle("Multiples Oyentes");
		
		LaminaMultiplesOyentes miLamina=new LaminaMultiplesOyentes();
		
		add(miLamina);
		
		setVisible(true);
	}
}

class LaminaMultiplesOyentes extends JPanel{
	
	public LaminaMultiplesOyentes() {
		
		JButton botonNuevaLamina=new JButton("Nueva Lamina");
		
		add(botonNuevaLamina);
		
		botonCerrarLaminas=new JButton("Cerrar Todas");
		
		add(botonCerrarLaminas);
		
		oyenteNuevaLamina oyenteBotonLamina=new oyenteNuevaLamina();
		
		botonNuevaLamina.addActionListener(oyenteBotonLamina);
	}
	
	private class oyenteNuevaLamina implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			MarcosNuevos nuevoMarco=new MarcosNuevos(botonCerrarLaminas);
			
			nuevoMarco.setVisible(true);
		}	
	}
	
	JButton botonCerrarLaminas;
}

class MarcosNuevos extends JFrame{
	
	public MarcosNuevos(JButton botonCopiaCerrar) {
		
		contador++;
		
		setTitle("Ventana " + contador);
		
		setBounds(100*contador, 100*contador, 250, 150);
		
		oyenteCerrarLaminas oyenteBotonCerrar=new oyenteCerrarLaminas();
		
		botonCopiaCerrar.addActionListener(oyenteBotonCerrar);
	}
	
	private static int contador=0;
	
	private class oyenteCerrarLaminas implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			dispose();
			
			contador=0;
		}
	}
}