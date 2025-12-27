package graficos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CreandoCuadrosDeTexto {

	public static void main(String[] args) {
		
		MarcoCuadroDeTexto miMarco=new MarcoCuadroDeTexto();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoCuadroDeTexto extends JFrame{
	
	public MarcoCuadroDeTexto(){
		
		setBounds(600, 300, 600, 350);
		
		LaminaCuadroDeTexto miLamina=new LaminaCuadroDeTexto();
		
		add(miLamina);
		
		setVisible(true);
	}
}

class LaminaCuadroDeTexto extends JPanel{
	
	public LaminaCuadroDeTexto() {
		
		setLayout(new BorderLayout());
		
		JPanel miLamina2=new JPanel();
		
		miLamina2.setLayout(new FlowLayout());
		
		JLabel texto1=new JLabel("Email:  ");
		
		miLamina2.add(texto1);
		
		campo1=new JTextField(20);
		
		miLamina2.add(campo1);
		
		JButton miBoton=new JButton("Comprobar");
		
		DameTexto miEvento=new DameTexto();
		
		miBoton.addActionListener(miEvento);
		
		miLamina2.add(miBoton);
		
		add(miLamina2, BorderLayout.NORTH);
		
		resultado=new JLabel("", JLabel.CENTER);
		
		add(resultado, BorderLayout.CENTER);
	}
	
	private class DameTexto implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			int correcto=0;
			
			String email=campo1.getText().trim();
			
			for(int i=0; i<email.length(); i ++) {
				
				if(email.charAt(i) == '@') {
					
					correcto++;
				}
			}
			
			if(correcto!=1) {
				
				resultado.setText("Incorrecto");
			}else {
				
				resultado.setText("Correcto");
			}
		}
	}
	
	private JTextField campo1;
	
	private JLabel resultado;
}