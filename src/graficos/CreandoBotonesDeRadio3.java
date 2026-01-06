package graficos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CreandoBotonesDeRadio3 {

	public static void main(String[] args) {
		
		MarcoBotonesDeRadio3 miMarco=new MarcoBotonesDeRadio3();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoBotonesDeRadio3 extends JFrame{
	
	public MarcoBotonesDeRadio3() {
		
		setBounds(500, 300, 500, 350);
		
		setTitle("Botones de radio 3");
		
		LaminaBotonesDeRadio3 miLamina=new LaminaBotonesDeRadio3();
		
		add(miLamina);
		
		setVisible(true);
	}
}

class LaminaBotonesDeRadio3 extends JPanel{
	
	public LaminaBotonesDeRadio3() {
		
		setLayout(new BorderLayout());
		
		texto=new JLabel("En un pueblo muy lejano, que no me acuerdo el nombre");
		
		texto.setFont(new Font("Serif", Font.PLAIN, 12));
		
		add(texto, BorderLayout.CENTER);
		
		miGrupo=new ButtonGroup();
		
		miLamina2=new JPanel();
		
		agregaBotones("Pequeño", false, 10);
		
		agregaBotones("Mediano", true, 12);
		
		agregaBotones("Grande", false, 18);
		
		agregaBotones("Muy Grande", false, 24);
		
		add(miLamina2, BorderLayout.SOUTH);
	}
	
	private void agregaBotones(String nombre, boolean booleano, int tamaño) {
		
		JRadioButton boton=new JRadioButton(nombre, booleano);
		
		miGrupo.add(boton);
		
		ActionListener EventoBoton=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				texto.setFont(new Font("Serif", Font.PLAIN, tamaño));
			}
		};
		
		boton.addActionListener(EventoBoton);
		
		miLamina2.add(boton);
	}
	
	private JLabel texto;
	
	ButtonGroup miGrupo;
	
	JPanel miLamina2;
}