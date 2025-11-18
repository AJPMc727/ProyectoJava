package Ejercicios_D;
import java.util.*;

public class EjercicioArrays_03 {

	static Scanner escaner= new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] numeros = new int[4];
		int sumaNumeros=0;
		
		System.out.println("Escribe 4 numeros, porfavor");
		
		for(int i=0;i<4;i++) {
			numeros[i]=escaner.nextInt();
			sumaNumeros=sumaNumeros+numeros[i];	
		}
		
		System.out.println("La suma de los numeros es: " + sumaNumeros);
		
	}
}
