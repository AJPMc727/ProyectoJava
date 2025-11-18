import javax.swing.*;

public class EntradaDatos2 {

	public static void main(String[] args) {
		
		/* JoptionPane (Nos muestra una ventana para la introduccion de datos 
		 * lamentablemente solo guarda datos en forma de String o texto pero
		 * se lo puede convertir a Int o Double con un parse.Int o parse.Double */
		String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre, por favor");
	
		int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
		
		double salario=Double.parseDouble(JOptionPane.showInputDialog("Introduce tu salario"));
		
		System.out.println("Te llamas " + nombre_usuario + " y el proximo año tendras " + (edad+1) + " años :D"
				+ " y tu salario es de " + salario + " dolares");
		
	}

}
