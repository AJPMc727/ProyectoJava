import java.math.BigInteger;

public class UsoMath {

	public static void main(String[] args) {
	
		// Caculos con la base Math
		
		// Math.pow (Potencia)
		BigInteger base=BigInteger.valueOf(2);
		
		int exponente=3;
		
		BigInteger potencia=base.pow(exponente);
		
		
		// Math.random (numeros aleatorios)
		int aleatorio=Math.round((float)(Math.random()*100));
		
		
		// Math.abs {valor absoluto de un numero(distancia de recorrido del numero hasta el cero sin importar el signo)}
		int absoluto=Math.abs(45);
		
		// Math.max (devuelve el valor mayor entre dos variables a y b)
		int mayor=Math.max(7,9);
		
		System.out.println(potencia);
		
		
		}

}
