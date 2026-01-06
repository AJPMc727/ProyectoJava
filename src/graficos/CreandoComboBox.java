package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CreandoComboBox {

	public static void main(String[] args) {
		
		MarcoComboBox miMarco=new MarcoComboBox();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoComboBox extends JFrame{
	
	public MarcoComboBox() {
		
		setBounds(500, 300, 500, 350);
		
		setTitle("Menus Desplegables");
		
		LaminaComboBox miLamina=new LaminaComboBox();
		
		add(miLamina);
		
		setVisible(true);
	}
}

class LaminaComboBox extends JPanel{
	
	public LaminaComboBox() {
		
		setLayout(new BorderLayout());
		
		texto= new JLabel("En un lugar de la mancha cuyo nombre no recuerdo");
		
		texto.setFont(new Font("Serif", Font.PLAIN, 18));
		
		add(texto, BorderLayout.CENTER);
		
		miCombo=new JComboBox();
		
		miCombo.addItem("Serif");
		
		miCombo.addItem("SansSerif");
		
		miCombo.addItem("Monospaced");
		
		miCombo.addItem("Dialog");
		
		EventoCombo miEvento=new EventoCombo();
		
		miCombo.addActionListener(miEvento);
		
		JPanel laminaCombo=new JPanel();
		
		laminaCombo.add(miCombo);
		
		add(laminaCombo, BorderLayout.NORTH);
	}
	
	private class EventoCombo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			texto.setFont(new Font((String)miCombo.getSelectedItem(), Font.PLAIN, 18));
		}
	}
	
	private JLabel texto;
	
	private JComboBox miCombo;
}