package graficos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CreandoBotonesDeRadio2 {

	public static void main(String[] args) {
		
		MarcoBotonesDeRadio2 miMarco=new MarcoBotonesDeRadio2();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoBotonesDeRadio2 extends JFrame{
	
	public MarcoBotonesDeRadio2() {
		
		setBounds(500, 300, 500, 350);
		
		setTitle("Botones de radio 2");
		
		LaminaBotonesDeRadio2 miLamina=new LaminaBotonesDeRadio2();
		
		add(miLamina);
		
		setVisible(true);
	}
}

class LaminaBotonesDeRadio2 extends JPanel{
	
	public LaminaBotonesDeRadio2() {
		
		setLayout(new BorderLayout());
		
		texto=new JLabel("En un lugar de la mancha, cuyo nombre no recuerdo");
		
		add(texto, BorderLayout.CENTER);
		
		boton1=new JRadioButton("Pequeño", false);
		
		boton2=new JRadioButton("Mediano", true);
		
		boton3=new JRadioButton("Grande", false);
		
		boton4=new JRadioButton("Muy grande", false);
		
		ButtonGroup miGrupo=new ButtonGroup();
		
		miGrupo.add(boton1);
		
		miGrupo.add(boton2);
		
		miGrupo.add(boton3);
		
		miGrupo.add(boton4);
		
		EventoBotones miEvento=new EventoBotones();
		
		boton1.addActionListener(miEvento);
		
		boton2.addActionListener(miEvento);
		
		boton3.addActionListener(miEvento);
		
		boton4.addActionListener(miEvento);
		
		JPanel laminaBotones=new JPanel();
		
		laminaBotones.add(boton1);
		
		laminaBotones.add(boton2);
		
		laminaBotones.add(boton3);
		
		laminaBotones.add(boton4);
		
		add(laminaBotones, BorderLayout.SOUTH);
	}
	private class EventoBotones implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==boton1) {
				
				texto.setFont(new Font("Serif", Font.PLAIN, 10));
			}else if(e.getSource()==boton2) {
				
				texto.setFont(new Font("Serif", Font.PLAIN, 12));
			}else if(e.getSource()==boton3) {
				
				texto.setFont(new Font("Serif", Font.PLAIN, 18));
			}else {
				
				texto.setFont(new Font("Serif", Font.PLAIN, 24));
			}
		}	
	}
	
	private JLabel texto;
	
	private JRadioButton boton1, boton2, boton3, boton4;
}