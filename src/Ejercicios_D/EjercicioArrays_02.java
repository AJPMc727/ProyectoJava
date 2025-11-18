package Ejercicios_D;
import java.util.*;
public class EjercicioArrays_02 {
	
	static Scanner escaner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] numeros=new int[3];
		
		System.out.println("Introduce tres numeros");
		
		for(int i=0;i<3;i++) {
			numeros[i]=escaner.nextInt();
			}
			
		int numeroAlto=numeros[0];
		
		for(int i=0;i<3;i++) {
			if(numeros[i]>numeroAlto) {
			numeroAlto=numeros[i];	
			}
		}
		System.out.println("El numero mas alto es: " + numeroAlto);
		
		int n=4;
		
		int[] valores = Ejercicios_D.EjercicioArrays_02.leerArrayInt(n);
		
		Ejercicios_D.EjercicioArrays_02.imprimirArray(valores);
	}
	// Utilidad: leer array de tamaño n
	static int[] leerArrayInt(int n) {  // setter and getter
		int[] arra = new int [n];
		for(int i=0;i<n;i++) arra[i] = escaner.nextInt();
		return arra;
	}
	
	static void imprimirArray(int[] array) { //setter
		for(int i=0;i<array.length;i++) {
			if(i>0) System.out.println(" ");
			System.out.println(array[i]);
		}
		System.out.println();
		

	}

}


