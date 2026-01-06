package graficos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.Document;

public class CreandoEventoCuadroDeTexto2 {

	public static void main(String[] args) {
		
		MarcoEventoCuadroDeTexto2 miMarco=new MarcoEventoCuadroDeTexto2();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoEventoCuadroDeTexto2 extends JFrame{
	
	public MarcoEventoCuadroDeTexto2() {
		
		setBounds(500, 300, 500, 350);
		
		setTitle("Eventos de Cuadros de Texto 2");
		
		LaminaEventoCuadroDeTexto miLamina=new LaminaEventoCuadroDeTexto();
		
		add(miLamina);
		
		setVisible(true);
	}
}

class LaminaEventoCuadroDeTexto extends JPanel{
	
	public LaminaEventoCuadroDeTexto() {
		
		setLayout(new BorderLayout());
		
		JPanel miLamina2=new JPanel();
		
		miLamina2.setLayout(new GridLayout(2, 2));
		
		JLabel etiquetaEmail=new JLabel("Email:  ");
		
		miLamina2.add(etiquetaEmail);
		
		miEmail=new JTextField(10);
		
		miLamina2.add(miEmail);
		
		JLabel etiquetaContraseña=new JLabel("Contraseña:  ");
		
		miLamina2.add(etiquetaContraseña);
		
		miContraseña=new JPasswordField(10);
		
		miDocumento=miContraseña.getDocument();
		
		EventoCuadroDeTexto miEvento=new EventoCuadroDeTexto();
		
		miDocumento.addDocumentListener(miEvento);
		
		miLamina2.add(miContraseña);
		
		add(miLamina2, BorderLayout.NORTH);
		
		JPanel miLamina3=new JPanel();
		
		miLamina3.setLayout(new FlowLayout());
		
		JButton miBoton=new JButton("Enviar");
		
		EnviarDatos eventoDatos=new EnviarDatos();
		
		miBoton.addActionListener(eventoDatos);
		
		miLamina3.add(miBoton);
		
		add(miLamina3, BorderLayout.SOUTH);
	}
	
	private class EventoCuadroDeTexto implements DocumentListener{

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			if(miDocumento.getLength()>8 && miDocumento.getLength()<12) {
				
				miContraseña.setBackground(Color.GREEN);
			}else {
				
				miContraseña.setBackground(Color.RED);
			}
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			if(miDocumento.getLength()>8 && miDocumento.getLength()<12) {
				
				miContraseña.setBackground(Color.GREEN);
			}else {
				
				miContraseña.setBackground(Color.RED);
			}
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	private class EnviarDatos implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(miDocumento.getLength()>8 && miDocumento.getLength()<12) {
				
				System.out.println("Datos enviados correctamente");
				System.out.println("Email: " + miEmail.getText());
				System.out.println("Contraseña: " + miContraseña.getText());
			}else {
				
				System.out.println("ERROR Datos No Validos");
			}
		}
	}
	
	private JPasswordField miContraseña;
	
	private Document miDocumento;
	
	private JTextField miEmail;
}