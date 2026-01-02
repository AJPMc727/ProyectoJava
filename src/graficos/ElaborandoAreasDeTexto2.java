package graficos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ElaborandoAreasDeTexto2 {

	public static void main(String[] args) {
		
		MarcoAreasDeTexto2 miMarco=new MarcoAreasDeTexto2();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoAreasDeTexto2 extends JFrame{
	
	public MarcoAreasDeTexto2() {
		
		setBounds(500, 300, 500, 350);
		
		setTitle("Areas de Texto");
		
		setLayout(new BorderLayout());
		
		laminaBotones=new JPanel();
		
		botonInsertar=new JButton("Insertar");
		
		botonInsertar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				areaTexto.append("Erase una vez, una persona que queria programar, pero la pregunta es si lo lograra? ");
			}
		});
		
		laminaBotones.add(botonInsertar);
		
		botonSaltoLinea=new JButton("Activar Salto");
		
		botonSaltoLinea.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				boolean booleano=! areaTexto.getLineWrap();
				
				areaTexto.setLineWrap(booleano);;
				
				botonSaltoLinea.setText(booleano ? "Activar Salto" : "Quitar Salto");
			}
		});
		
		laminaBotones.add(botonSaltoLinea);
		
		add(laminaBotones, BorderLayout.SOUTH);
		
		areaTexto=new JTextArea(8, 20);
		
		barrasTexto=new JScrollPane(areaTexto);
		
		add(barrasTexto, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	private JPanel laminaBotones;
	
	private JButton botonInsertar, botonSaltoLinea;
	
	private JScrollPane barrasTexto;
	
	private JTextArea areaTexto;
}