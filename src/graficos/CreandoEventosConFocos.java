package graficos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CreandoEventosConFocos {

	public static void main(String[] args) {
		
		MarcoDeEventosConFocos miMarco=new MarcoDeEventosConFocos();
		
		miMarco.setVisible(true);
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoDeEventosConFocos extends JFrame{
	
	public MarcoDeEventosConFocos() {
		
		setSize(750,500);
		
		setLocation(200,200);
		
		setTitle("Eventos de Foco");
		
		LaminaDeEventosConFocos miLamina=new LaminaDeEventosConFocos();
		
		add(miLamina);
	}
}

class LaminaDeEventosConFocos extends JPanel{
	
	public LaminaDeEventosConFocos(){
		
		setLayout(null);
		
		cuadro1=new JTextField();
		
		cuadro2=new JTextField();
		
		cuadro1.setBounds(150, 10, 150,20);
		
		cuadro2.setBounds(150, 50, 150, 20);
		
		add(cuadro1);
		
		add(cuadro2);
		
		EventoFoco miFoco=new EventoFoco();
		
		cuadro1.addFocusListener(miFoco);
	}
	
	private class EventoFoco implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			
			String email=cuadro1.getText();
			
			int cantidadArroba=0, cantidadPunto=0;
			
			boolean comprobacion=false;
			
			for(int i=0; i < email.length(); i++) {
				
				if(email.charAt(i) == '@') cantidadArroba++;
				if(email.charAt(i) == '.') cantidadPunto++;
				
				if(cantidadArroba==1 && cantidadPunto==1) {
					
					comprobacion=true;
				}
			}
			
			if(comprobacion){
				
				System.out.println("El email es correcto");
			}
			
			else System.out.println("El email es incorrecto");
			
			System.out.println("El email es: " + email);
		}
	}
	
	JTextField cuadro1;
	
	JTextField cuadro2;
}