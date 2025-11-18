package Ejercicios_D;
import java.util.*;

public class Ejercicio_Arrays {
	
	static Scanner escaner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] numero=new int[5];
		
		for(int i=0;i<numero.length;i++) {
			System.out.println("Introduce un numero");
			numero[i]=escaner.nextInt();
			if(numero[i] % 2 == 0)System.out.println("El numero es par :)");
			else System.out.println("El numero es impar :(");
		}
		
	}
	// Utilidad: leer array de tamaño n
	static int[] leerArrayInt(int n) {  // setter and getter
		int[] array = new int [n];
		for(int i=0;i<n;i++) array[i] = escaner.nextInt();
		return array;
	}
	
	static void imprimirArray(int[] array) { //setter
		for(int i=0;i<array.length;i++) {
			if(i>0) System.out.println(" ");
			System.out.println(array[i]);
		}
		System.out.println();
	}

}
