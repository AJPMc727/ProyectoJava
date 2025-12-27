package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {

	public static void main(String[] args) {
		
		MarcoCalculadora miCalculadora=new MarcoCalculadora();
		
		miCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoCalculadora extends JFrame{
	
	public MarcoCalculadora() {
		
		setBounds(550, 200, 300, 450);
		
		setTitle("Calculadora Java");
		
		LaminaCalculadora miLamina=new LaminaCalculadora();
		
		add(miLamina);
		
		setVisible(true);
	}
}

class LaminaCalculadora extends JPanel{
	
	public LaminaCalculadora() {
		
		setLayout(new BorderLayout());
		
		pantalla=new JButton("0");
		
		pantalla.setEnabled(false);
		
		add(pantalla, BorderLayout.NORTH);
		
		laminaCalculadora2=new JPanel();
		
		laminaCalculadora2.setLayout(new GridLayout(4, 4));
		
		agregaBotones("7");
		
		agregaBotones("8");
		
		agregaBotones("9");
		
		agregaBotones("/");
		
		
		agregaBotones("4");
		
		agregaBotones("5");
		
		agregaBotones("6");
		
		agregaBotones("*");
		
		
		agregaBotones("1");
		
		agregaBotones("2");
		
		agregaBotones("3");
		
		agregaBotones("-");
		
		
		agregaBotones("0");
		
		agregaBotones(".");
		
		agregaBotones("=");
		
		agregaBotones("+");
		
		add(laminaCalculadora2, BorderLayout.CENTER);
	}
	
	private void agregaBotones(String container) {
		
		JButton boton=new JButton(container);

		laminaCalculadora2.add(boton);
		
		switch(container) {
		
			case "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ".":
				
			boton.addActionListener(accionBoton);
				
			break;
		}
		
		switch(container) {
		
			case "+", "-", "*", "/":
			
			boton.addActionListener(funcionCalculadora);
			
			break;
		}
		
		if(container.equals("=")) {
			
			boton.addActionListener(resultadoCalculadora);
		}
	}
	
	private class AccionCalculadora implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			texto = ((JButton)e.getSource()).getText();
			
			if(texto.equals(".")) {
				
					pantalla.setText(pantalla.getText() + texto);
			}else if(pantalla.getText().equals("0")){
				
					pantalla.setText(texto);
			}else if(pantalla.getText().equals("+") || pantalla.getText().equals("-") || pantalla.getText().equals("*") || pantalla.getText().equals("/")) {
				
					pantalla.setText(texto);
			}else if(pantalla.getText().equals(textoResultadoNumero)) {
				
					pantalla.setText(texto);
			}else {
				
					pantalla.setText(pantalla.getText() + texto);
			}
		}
	}
	
	private class FuncionesCalculadora implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			primerNumero=Double.parseDouble(pantalla.getText());
			
			operacion = ((JButton)e.getSource()).getText();
			
			pantalla.setText(operacion);
		}
	}
	
	private class ResultadoCalculadora implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			segundoNumero=Double.parseDouble(pantalla.getText());
			
			switch(operacion) {
			
				case "+":
					resultadoNumero=primerNumero+segundoNumero;
					break;
				
				case "-":
					resultadoNumero=primerNumero-segundoNumero;
					break;
					
				case "*":
					resultadoNumero=primerNumero*segundoNumero;
					break;
					
				case "/":
					resultadoNumero=primerNumero/segundoNumero;
					break;
			}
			
			textoResultadoNumero=String.valueOf(resultadoNumero);
			
			pantalla.setText(textoResultadoNumero);
		}
	}
	
	private AccionCalculadora accionBoton=new AccionCalculadora();
	
	private FuncionesCalculadora funcionCalculadora=new FuncionesCalculadora();
	
	private ResultadoCalculadora resultadoCalculadora=new ResultadoCalculadora();
	
	private String textoResultadoNumero = " ";
	
	private String operacion;
	
	private String texto;
	
	private double primerNumero=0,segundoNumero=0,resultadoNumero=0;
    
	private JPanel laminaCalculadora2;
	
	private JButton pantalla;
}
