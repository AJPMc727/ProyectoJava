import javax.swing.*;
import java.math.BigInteger;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		BigInteger resultado=new BigInteger("1");
		
		int numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Escribe un numero", "Factorial de un numero", JOptionPane.QUESTION_MESSAGE));
		
		for(int i=numero;i>0;i--) resultado=resultado.multiply(BigInteger.valueOf(i));
			
			System.out.println("El factorial de " + numero + " es " + resultado);
		
	}
}
