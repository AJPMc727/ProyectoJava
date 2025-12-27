package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculadoraPildorasInformaticas {

	public static void main(String[] args) {
		
		MarcoCalculadoraPildorasInformaticas suCalculadora=new MarcoCalculadoraPildorasInformaticas();
		
		suCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoCalculadoraPildorasInformaticas extends JFrame{
	
	public MarcoCalculadoraPildorasInformaticas() {
		
		//setBounds(550, 200, 300, 450);
		
		setLocation(500, 200);
		
		setTitle("Calculadora de Pildoras Informaticas");
		
		setVisible(true);
		
		LaminaCalculadoraPildorasInformaticas suLamina=new LaminaCalculadoraPildorasInformaticas();
		
		add(suLamina);
		
		pack();
	}
}

class LaminaCalculadoraPildorasInformaticas extends JPanel{
	
	public LaminaCalculadoraPildorasInformaticas() {
		
		principio=true;
		
		setLayout(new BorderLayout());
		
		pantalla=new JButton("0");
		
		pantalla.setEnabled(false);
		
		add(pantalla, BorderLayout.NORTH);
		
		suLamina2=new JPanel();
		
		suLamina2.setLayout(new GridLayout(4, 4));
		
		ActionListener insertar=new InsertaNumero();
		
		ActionListener orden=new AccionOrden();
		
		creaBotones("7", insertar);
		
		creaBotones("8", insertar);
		
		creaBotones("9", insertar);
		
		creaBotones("/", orden);
		
		creaBotones("4", insertar);
		
		creaBotones("5", insertar);
		
		creaBotones("6", insertar);
		
		creaBotones("*", orden);
		
		creaBotones("1", insertar);
		
		creaBotones("2", insertar);
		
		creaBotones("3", insertar);
		
		creaBotones("-", orden);
		
		creaBotones("0", insertar);
		
		creaBotones(".", insertar);
		
		creaBotones("=", orden);
		
		creaBotones("+", orden);
		
		add(suLamina2, BorderLayout.CENTER);
		
		ultimaOperacion = "=";
	}
	
	private void creaBotones(String container, ActionListener oyente) {
		
		JButton boton=new JButton(container);

		boton.addActionListener(oyente);
		
		suLamina2.add(boton);
	}
	
	private class InsertaNumero implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(principio) {
				
				pantalla.setText("");
				
				principio=false;
			}
			
			String entrada=e.getActionCommand();
			
			pantalla.setText(pantalla.getText() + entrada);
		}
	}
	
	private class AccionOrden implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			String operacion=e.getActionCommand();
			
			calcular(Double.parseDouble(pantalla.getText()));
			
			ultimaOperacion=operacion;
			
			principio=true;
		}
		
		public void calcular(double x) {
			
			if(ultimaOperacion.equals("+")) {
				
				resultado += x;
			}else if(ultimaOperacion.equals("-")) {
				
				resultado -= x;
			}else if(ultimaOperacion.equals("*")) {
				
				resultado *= x;
			}else if(ultimaOperacion.equals("/")) {
				
				resultado /= x;
			}else  if(ultimaOperacion.equals("=")) {
				
				resultado = x;
			}
			
			pantalla.setText("" + resultado);
		}
	}
	
	private double resultado;
	
	private JPanel suLamina2;
	
	private JButton pantalla;
	
	private boolean principio;
	
	private String ultimaOperacion;
}
