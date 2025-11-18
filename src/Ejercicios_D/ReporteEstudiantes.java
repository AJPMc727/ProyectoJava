package Ejercicios_D;

import java.util.*;

public class ReporteEstudiantes {
	
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		int m, n; //m son los estudiantes y n son las unidades 
		int aprobados=0,reprobados=0;	
		double porcentajeAprobados=0, porcentajeReprobados=0;
		
		//Entrada de el numero de estudiantes y unidades
		System.out.println("Ingrese el numero de estudiantes");
		m=entrada.nextInt();
		System.out.println("Ingrese el numero de unidades");
		n=entrada.nextInt();
		
		if(m<=0 || n<=0) {
			System.out.println("m y n deben ser mayores que 0");
			entrada.close();
			return;
		}
		
		//Inicializacion de los Arrays Promedios
		double promedios[][]=new double[m][n];
		double promedioEstudiantes[]=new double[m];
		double promedioUnidad[]=new double[n];
		
		//Entrada de datos del array bidimensional promedios y logica del array promedioEstudiante
		for(int i=0;i<m;i++) {
			
			double sumaPromedio=0;
			System.out.println("--- Estudiante " + (i+1) + " ---");
			for(int j=0;j<n;j++) {
				
				System.out.print("Calificacion U" + (j+1) + " ");
				promedios[i][j]=entrada.nextDouble();
				if(promedios[i][j]>100) promedios[i][j]=100;
				if(promedios[i][j]<0) promedios[i][j]=0;
				sumaPromedio=sumaPromedio+promedios[i][j];
			}
			
			promedioEstudiantes[i]=sumaPromedio/n;
		}
		
		//Creacion de los arrays maximos y minimos
		double minimoUnidad[]=new double[n];
		double maximoUnidad[]=new double[n];
		
		//Logica del array promedioUnidad[]
		for(int x=0;x<n;x++) {
			
			maximoUnidad[x]=promedios[0][x];
			minimoUnidad[x]=promedios[0][x];
			double maximoInicio=promedios[0][x];
			double minimoInicio=promedios[0][x];
			double sumaUnidad=0;
			//Logica del array minimoUnidad[]
			//Logica del array maximoUnidad[]
			for(int y=0;y<m;y++) {
				
				sumaUnidad=sumaUnidad+promedios[y][x];
				if(promedios[y][x]<minimoInicio) {
					
					minimoInicio=promedios[y][x];
				}
				
				if(promedios[y][x]>maximoInicio) {
					
					maximoInicio=promedios[y][x];
				}
			}
			
			maximoUnidad[x]=maximoInicio;
			minimoUnidad[x]=minimoInicio;
            promedioUnidad[x]=sumaUnidad/m;	
		}
		
		//Logica del recuento de los aprobados y reprobados
		for(int e=0;e<m;e++) {
				
				if(promedioEstudiantes[e]>=51) aprobados++;
				if(promedioEstudiantes[e]<=50) reprobados++;
		}
		
		//Calculo con porcentaje de los aprobados y reprobados
		porcentajeAprobados=((double)(aprobados)/m)*100;
		porcentajeReprobados=((double)(reprobados)/m)*100;
		
		System.out.println("      ");
		System.out.println("Tabla de calificaciones");
		System.out.println("-------------------------------------");
		System.out.print("        ");
		
		//Se imprime la informacion del array bidimensional en formato de tabla 
		//Junto al promedio de cada Estudiante
		for(int i=0;i<n;i++) {
			
			System.out.print("U"+(i+1) + "      ");
		}
		System.out.println(" Promedio");
		
		for(int i=0;i<m;i++) {
			
			System.out.print("Est" + (i+1) + "   ");
			for(int j=0;j<n;j++) {
	
				if(promedios[i][j]==100) System.out.print(String.format(("%3.1f"), promedios[i][j]) + "  ");
				else System.out.print(String.format((" %3.1f"), promedios[i][j]) + "  ");
			}
			
			System.out.println("  " + String.format("%.2f", promedioEstudiantes[i]));
			System.out.println();
		}
		//Se imprimen el valor del promedio de cada unidad en formato de tabla
		System.out.println("-------------------------------------");
		System.out.print("Promedios:");
		for(int y=0;y<n;y++) System.out.print(String.format("%.2f",promedioUnidad[y]) + "   ");
		System.out.println();
		//Se imprimen los minimos y maximos
		System.out.print("Minimos: ");
		for(int w=0;w<n;w++) System.out.print(" " + minimoUnidad[w] + "   " );
		System.out.println();
		System.out.print("Maximos: ");
		for(int q=0;q<n;q++) System.out.print(" " + maximoUnidad[q] + "   ");
		System.out.println();
		//Se imprimen los aprobados y reprobados junto con sus porcentajes
		System.out.println("--------------------------------------");
		System.out.println("Aprobados: " + aprobados + " " + (String.format("%.2f",porcentajeAprobados)) + "%");
		System.out.println("Reprobados: " + reprobados + " " + (String.format("%.2f",porcentajeReprobados)) + "%");
		
		entrada.close();
	}
}
