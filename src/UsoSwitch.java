import java.util.Scanner;

public class UsoSwitch {
	
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce el Nro de mes, por favor");
		
		int numero_mes=entrada.nextInt();
		
		/* Condicional switch (nos sirve para evaluar rangos de valores fijos
		 * en cambio if y else destaca mas en valores con rangos)
		 */
		switch (numero_mes) {
		
		case 1:
			System.out.println("Enero");
			break;
		case 2:
			System.out.println("Febrero");
			break;
		case 3:
			System.out.println("Marzo");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Mayo");
			break;
		case 6:
			System.out.println("Junio");
			break;
		case 7:
			System.out.println("Julio");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Septiembre");
			break;
		case 10:
			System.out.println("Octubre");
			break;
		case 11:
			System.out.println("Noviembre");
			break;
		case 12:
			System.out.println("Diciembre");
			break;
		default:
			System.out.println("Nro de mes incorrecto");
		
		}
		entrada.close();
		
	}
}
