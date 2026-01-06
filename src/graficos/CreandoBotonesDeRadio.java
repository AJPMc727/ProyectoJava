package graficos;

import javax.swing.*;

public class CreandoBotonesDeRadio {

	public static void main(String[] args) {
		
		MarcoBotonesDeRadio miMarco=new MarcoBotonesDeRadio();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoBotonesDeRadio extends JFrame{
	
	public MarcoBotonesDeRadio() {
		
		setBounds(500, 300, 500, 350);
		
		setTitle("Botones de Radio");
		
		LaminaBotonesDeRadio miLamina=new LaminaBotonesDeRadio();
		
		add(miLamina);
		
		setVisible(true);
	}
}

class LaminaBotonesDeRadio extends JPanel{
	
	public LaminaBotonesDeRadio() {
		
		ButtonGroup grupo1=new ButtonGroup();
		
		ButtonGroup grupo2=new ButtonGroup();
		
		JRadioButton boton1=new JRadioButton("Azul", false);
		
		JRadioButton boton2=new JRadioButton("Amarillo", true);
		
		JRadioButton boton3=new JRadioButton("Rojo", false);
		
		JRadioButton boton4=new JRadioButton("Masculino", false);
		
		JRadioButton boton5=new JRadioButton("Femenino", false);
		
		grupo1.add(boton1);
		
		grupo1.add(boton2);
		
		grupo1.add(boton3);
		
		grupo2.add(boton4);
		
		grupo2.add(boton5);
		
		add(boton1);
		
		add(boton2);
		
		add(boton3);
		
		add(boton4);
		
		add(boton5);
	}
}