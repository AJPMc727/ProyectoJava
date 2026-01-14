package graficos;

import java.awt.*;

import javax.swing.*;

public class EjercicioPractico {

	public static void main(String[] args) {
		
		MarcoEjercicioPractico miMarco=new MarcoEjercicioPractico();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}

}
class MarcoEjercicioPractico extends JFrame{
	
	public MarcoEjercicioPractico() {
		
		setBounds(500, 300, 500, 350);
		
		setTitle("Ejercicio Practico");
		
		add(new LaminaEjercicioPractico());
		
		setVisible(true);
	}
}

class LaminaEjercicioPractico extends JPanel{
	
	public LaminaEjercicioPractico() {
		
		setLayout(new BorderLayout());
		
		JPanel laminaPrincipal=new JPanel();
		
		laminaPrincipal.setLayout(new GridLayout(2, 3));
		
		//-----------------------------------------------------------------------------------------
		
		Box cajaTipo=Box.createVerticalBox();
		
		ButtonGroup grupoTipo=new ButtonGroup();
		
		agregaBotones("Mensaje", cajaTipo, grupoTipo, true);
		
		agregaBotones("Confirmar", cajaTipo, grupoTipo, false);
		
		agregaBotones("Opcion", cajaTipo, grupoTipo, false);
		
		agregaBotones("Entrada", cajaTipo, grupoTipo, false);
		
		cajaTipo.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Tipo"));
		
		laminaPrincipal.add(cajaTipo);
		
		//-----------------------------------------------------------------------------------------
		
		Box cajaTipoMensaje=Box.createVerticalBox();
		
		ButtonGroup grupoTipoMensaje=new ButtonGroup();
		
		agregaBotones("ERROR_MESSAGE", cajaTipoMensaje, grupoTipoMensaje, true);
		
		agregaBotones("INFORMATION_MESSAGE", cajaTipoMensaje, grupoTipoMensaje, false);
		
		agregaBotones("WARNING_MESSAGE", cajaTipoMensaje, grupoTipoMensaje, false);
		
		agregaBotones("QUESTION_MESSAGE", cajaTipoMensaje, grupoTipoMensaje, false);
		
		agregaBotones("PLAIN_MESSAGE", cajaTipoMensaje, grupoTipoMensaje, false);
		
		cajaTipoMensaje.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Tipo de Mensaje"));
		
		laminaPrincipal.add(cajaTipoMensaje);
		
		//-----------------------------------------------------------------------------------------
		
		Box cajaMensaje=Box.createVerticalBox();
		
		ButtonGroup grupoMensaje=new ButtonGroup();
		
		agregaBotones("Cadena", cajaMensaje, grupoMensaje, true);
		
		agregaBotones("Icono", cajaMensaje, grupoMensaje, false);
		
		agregaBotones("Componente", cajaMensaje, grupoMensaje, false);
		
		agregaBotones("Otros", cajaMensaje, grupoMensaje, false);
		
		agregaBotones("Object[]", cajaMensaje, grupoMensaje, false);
		
		cajaMensaje.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Mensaje"));
		
		laminaPrincipal.add(cajaMensaje);
		
		//-----------------------------------------------------------------------------------------
		
		Box cajaConfirmar=Box.createVerticalBox();
		
		ButtonGroup grupoConfirmar=new ButtonGroup();
		
		agregaBotones("DEFAULT_OPTION", cajaConfirmar, grupoConfirmar, true);
		
		agregaBotones("YES_NO_OPTION", cajaConfirmar, grupoConfirmar, false);
		
		agregaBotones("YES_NO_CANCEL_OPTION", cajaConfirmar, grupoConfirmar, false);
		
		agregaBotones("OK_CANCEL_OPTION", cajaConfirmar, grupoConfirmar, false);
		
		cajaConfirmar.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Confirmar"));
		
		laminaPrincipal.add(cajaConfirmar);
		
		//-----------------------------------------------------------------------------------------
		
		Box cajaOpcion=Box.createVerticalBox();
		
		ButtonGroup grupoOpcion=new ButtonGroup();
		
		agregaBotones("String[]", cajaOpcion, grupoOpcion, true);
		
		agregaBotones("Icon[]", cajaOpcion, grupoOpcion, false);
		
		agregaBotones("Object[]", cajaOpcion, grupoOpcion, false);
		
		cajaOpcion.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Opcion"));
		
		laminaPrincipal.add(cajaOpcion);
		
		//-----------------------------------------------------------------------------------------
		
		Box cajaEntrada=Box.createVerticalBox();
		
		ButtonGroup grupoEntrada=new ButtonGroup();
		
		agregaBotones("Campo de texto", cajaEntrada, grupoEntrada, true);
		
		agregaBotones("Combo", cajaEntrada, grupoEntrada, false);
		
		cajaEntrada.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Entrada"));
		
		laminaPrincipal.add(cajaEntrada);
		
		//-----------------------------------------------------------------------------------------
		
		add(laminaPrincipal, BorderLayout.CENTER);
		//Fin de la lamina central
		
		//-----------------------------------------------------------------------------------------

		JPanel laminaSecundaria=new JPanel();
		
		JButton botonMostrar=new JButton("Mostrar");
		
		laminaSecundaria.add(botonMostrar);
		
		add(laminaSecundaria, BorderLayout.SOUTH);
	}
	
	private void agregaBotones(String nombre, Box caja, ButtonGroup grupo, boolean booleano) {
		
		JRadioButton boton=new JRadioButton(nombre, booleano);
		
		grupo.add(boton);
		
		caja.add(boton);
	}
}