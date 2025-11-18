package Ejercicios_D;

public class usoVehiculos {

	public static void main(String[] args) {
		
		Vehiculos[] vehiculos=new Vehiculos[3];
		
		vehiculos[0]=new Coche("ABC123", "Toyota", 2018);
		vehiculos[1]=new Motocicleta("ZXY987", "Honda", 2011);
		vehiculos[2]=new Camion("MNO567", "Caterpillar", 2000, 5);
	
		for(Vehiculos v: vehiculos) {
			
			System.out.println("El vehivulo con la placa: " + v.getPlaca() + " de la marca: " + v.getMarca() 
			+ ", del agno: " + v.getAgno() + " tiene una tarifa por el parqueo de: " + v.calcularTarifaEstacionamiento(5));
		}
	
	}
}

abstract class Vehiculos{
	
	private String placa;
	private String marca;
	private int agno;
	
	public Vehiculos(String placa, String marca, int agno) {
		
		this.placa=placa;
		this.marca=marca;
		this.agno=agno;
	}
	
	public String getPlaca() {
		
		return placa;
	}
	
	public String getMarca() {
		
		return marca;
	}
	
	public int getAgno() {
		
		return agno;
	}
	
	public abstract double calcularTarifaEstacionamiento(int horas);
}

class Coche extends Vehiculos{
	
	public Coche(String placa, String marca, int agno) {
		
		super(placa, marca, agno);
	}

	public double calcularTarifaEstacionamiento(int horas) {
		
		double tarifa=2;
		
		if(getAgno()>=2018) {
			
			tarifa+=0.5;
		}
			
		return tarifa=tarifa*horas;
		
	}
}

class Motocicleta extends Vehiculos{
	
	public Motocicleta(String placa, String marca, int agno) {
		
		super(placa, marca, agno);
	}
	
	public double calcularTarifaEstacionamiento(int horas) {
		
		double tarifa=1;
		
		return tarifa=tarifa*horas;
	}
}

class Camion extends Vehiculos{
	
	private int pesoToneladas;
	
	
	public Camion(String placa, String marca, int agno, int pesoToneladas) {
		
		super(placa, marca, agno);
		
		this.pesoToneladas=pesoToneladas;
	}
	
	public int getPesoToneladas() {
		
		return pesoToneladas;
	}
	
	public double calcularTarifaEstacionamiento(int horas) {
		
		double tarifa=3+(0.5*getPesoToneladas());
		
		return tarifa=tarifa*horas;
	}
	
	
}

