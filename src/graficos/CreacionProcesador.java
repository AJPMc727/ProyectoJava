package graficos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CreacionProcesador {

	public static void main(String[] args) {
		
		MarcoProcesador miMarco=new MarcoProcesador();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoProcesador extends JFrame{
	
	public MarcoProcesador() {
		
		setBounds(500, 300, 500, 350);
		
		setTitle("Procesador de texto Java");
		
		LaminaProcesador miLamina=new LaminaProcesador();
		
		add(miLamina);
		
		setVisible(true);
	}
}

class LaminaProcesador extends JPanel{
	
	public LaminaProcesador() {
		
		setLayout(new BorderLayout());
		
		JPanel laminaMenu=new JPanel();
		
		JMenuBar barraMenu=new JMenuBar();
		
		JMenu fuente=new JMenu("Fuente");
		
		setMenuItem("DejaVu Sans", fuente, "DejaVu Sans", 9, 10);
		
		setMenuItem("Liberation Sans", fuente, "Liberation Sans", 9, 10);
		
		setMenuItem("Noto Mono", fuente, "Noto Mono", 9 , 10);
		
		JMenu estilo=new JMenu("Estilo");
		
		setMenuItem("Negrita", estilo, "", Font.BOLD, 9);
		
		setMenuItem("Cursiva", estilo, "", Font.ITALIC, 9);
		
		JMenu tamagno=new JMenu("Tamagno");
		
		setMenuItem("12", tamagno, "", 9, 12);
		
		setMenuItem("16", tamagno, "", 9, 16);
		
		setMenuItem("18", tamagno, "", 9, 18);
		
		setMenuItem("20", tamagno, "", 9, 20);
		
		barraMenu.add(fuente);
		
		barraMenu.add(estilo);
		
		barraMenu.add(tamagno);
		
		laminaMenu.add(barraMenu);
		
		add(laminaMenu, BorderLayout.NORTH);
		
		texto=new JTextPane();
		
		add(texto, BorderLayout.CENTER);
	}
	
	public void setMenuItem(String nombre, JMenu menu, String textoTipo, int textoEstilo, int textoTamagno) {
		
		JMenuItem item=new JMenuItem(nombre);
		
		menu.add(item);
		
		item.addActionListener(new GestionaEventos(nombre, textoTipo, textoEstilo, textoTamagno));
	}
	
	private class GestionaEventos implements ActionListener{

		String tipoTexto, menu;
		
		int estiloTexto, tamagnoTexto;
		
		public GestionaEventos(String elemento, String texto2, int estilo2, int tamagno2) {
			
			tipoTexto=texto2;
			
			estiloTexto=estilo2;
			
			tamagnoTexto=tamagno2;
			
			menu=elemento;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		
			letras=texto.getFont();
			
			if(menu.equals("DejaVu Sans") || menu.equals("Liberation Sans") || menu.equals("Noto Mono")) {
				
				estiloTexto=letras.getStyle();
				
				tamagnoTexto=letras.getSize();
			}else if(menu.equals("Negrita") || menu.equals("Cursiva")) {
				
				if(booNegrita==false && menu.equals("Negrita")) {
					
					estiloTexto=Font.BOLD;
					
					booNegrita=true;
					
					if(letras.getStyle()==2) {
						
						estiloTexto=3;
					}
				}else if(booNegrita && menu.equals("Negrita")){
					
					estiloTexto=Font.PLAIN;
					
					booNegrita=false;
					
					if(letras.getStyle()==3) {
						
						estiloTexto=2;
					}
				}
				
				if(booCursiva==false && menu.equals("Cursiva")) {
					
					estiloTexto=Font.ITALIC;
					
					booCursiva=true;
					
					if(letras.getStyle()==1) {
						
						estiloTexto=3;
					}
				}else if(booCursiva && menu.equals("Cursiva")){
					
					estiloTexto=Font.PLAIN;
					
					booCursiva=false;
					
					if(letras.getStyle()==3) {
						
						estiloTexto=1;
					}
				}
				
				tipoTexto=letras.getFamily();
				
				tamagnoTexto=letras.getSize();
			}else if(menu.equals("12") || menu.equals("16") || menu.equals("18") || menu.equals("20")) {
				
				tipoTexto=letras.getFamily();
				
				estiloTexto=letras.getStyle();
			}
			
			texto.setFont(new Font(tipoTexto, estiloTexto, tamagnoTexto));
		}
	}
	
	boolean booNegrita=false, booCursiva=false;
	
	private JTextPane texto;
	
	Font letras;
}