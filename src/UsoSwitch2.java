import java.util.Scanner;

public class UsoSwitch2 {

	public static void main(String[] args) {
		
	Scanner entrada=new Scanner(System.in);
	
	System.out.println("Introduce el nombre del dia");
	
	String dia_semana= entrada.nextLine();
	
	/* Switch case nuevas funciones desde la version Java 14
	 * Compara valores exactos
	 * Ejecutar varias acciones
	 * se puede guardar en un String el switch para usarlo mas adelante :D
	 */
	String resultado=switch(dia_semana) {
	
	case "Lunes", "Martes", "Miercoles", "Jueves", "Vierner"->"Laborable";
	
	case "Sabado", "Domingo"-> "Festivo";
	
	default->{
		System.out.println("Procesando...");
		yield "Dia no valido";
	}
	
	};
	
	System.out.println(resultado);
	
	entrada.close();
	
	}
}
