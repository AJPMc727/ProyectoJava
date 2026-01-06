package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CreandoCheckBox {

	public static void main(String[] args) {
		
		MarcoCheckBox miMarco=new MarcoCheckBox();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoCheckBox extends JFrame{
	
	public MarcoCheckBox() {
		
		setBounds(500,300,500,350);
		
		setTitle("Check Box");
		
		LaminaCheckBox miLamina=new LaminaCheckBox();
		
		add(miLamina);
		
		setVisible(true);
	}
}

class LaminaCheckBox extends JPanel{
	
	public LaminaCheckBox() {
		
		setLayout(new BorderLayout());
		
		Font miLetra=new Font("Serif", Font.PLAIN, 24);
		
		texto=new JLabel("En un lugar de la mancha, cuyo nombre no recuerdo");
		
		texto.setFont(miLetra);
		
		JPanel laminaTexto=new JPanel();
		
		laminaTexto.add(texto);
		
		add(laminaTexto, BorderLayout.CENTER);
		
		check1=new JCheckBox("Negrita");
		
		check2=new JCheckBox("Cursiva");
		
		check1.addActionListener(new EventoCheck());
		
		check2.addActionListener(new EventoCheck());
		
		JPanel laminaCheck=new JPanel();
		
		laminaCheck.add(check1);
		
		laminaCheck.add(check2);
		
		add(laminaCheck, BorderLayout.SOUTH);
	}
	
	private class EventoCheck implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int tipoDato=0;
			
			if(check1.isSelected()) tipoDato+=Font.BOLD;
			
			if(check2.isSelected()) tipoDato+=Font.ITALIC;
			
			texto.setFont(new Font("Serif", tipoDato, 24));
		}
	}
	
	private JLabel texto;
	
	private JCheckBox check1, check2;
}