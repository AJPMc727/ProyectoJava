package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CreandoAreasDeTexto {

	public static void main(String[] args) {
		
		MarcoAreasDeTexto miMarco=new MarcoAreasDeTexto();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	}
}

class MarcoAreasDeTexto extends JFrame{
	
	public MarcoAreasDeTexto() {
		
		setBounds(500, 300, 500, 350);
		
		setTitle("Areas de Texto");
		
		LaminaAreasDeTexto miLamina=new LaminaAreasDeTexto();
		
		add(miLamina);
		
		setVisible(true);
	}
}

class LaminaAreasDeTexto extends JPanel{
	
	public LaminaAreasDeTexto() {
		
		miTexto=new JTextArea(8, 20);
		
		JScrollPane laminaBarras=new JScrollPane(miTexto);
		
		miTexto.setLineWrap(true);
		
		add(laminaBarras);
		
		JButton miBoton=new JButton("Dale");
		
		miBoton.addActionListener(new EventoAreaDeTexto());
		
		add(miBoton);
	}
	
	private class EventoAreaDeTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			System.out.println(miTexto.getText());
		}
	}
	
	private JTextArea miTexto;
}