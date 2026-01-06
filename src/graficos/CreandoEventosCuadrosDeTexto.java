package graficos;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

public class CreandoEventosCuadrosDeTexto {

	public static void main(String[] args) {
		
		MarcoEventosCuadrosDeTexto miMarco=new MarcoEventosCuadrosDeTexto();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoEventosCuadrosDeTexto extends JFrame{
	
	public MarcoEventosCuadrosDeTexto() {
		
		setBounds(500, 300, 500 ,350);
		
		setTitle("Eventos de Cuadros de Texto");
		
		LaminaEventosCuadrosDeTexto miLamina=new LaminaEventosCuadrosDeTexto();
		
		add(miLamina);
		
		setVisible(true);
	}
}

class LaminaEventosCuadrosDeTexto extends JPanel{
	
	public LaminaEventosCuadrosDeTexto() {
		
		JTextField texto1=new JTextField(20);
		
		EventoTexto miEvento=new EventoTexto();
		
		Document miDocumento=texto1.getDocument();
		
		miDocumento.addDocumentListener(miEvento);
		
		add(texto1);
	}
	
	private class EventoTexto implements DocumentListener{

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
			System.out.println("Has insertado texto");
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
			System.out.println("Has eliminado texto");
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
}