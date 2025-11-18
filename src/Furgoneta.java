
public class Furgoneta extends Coche {

	private int capacidadCarga;
	
	private int plazasExtra;
	
	public Furgoneta(int plazasExtra, int capacidadCarga) {
		
		super(); //llama al constructor de la clase padre :(
		
		this.plazasExtra=plazasExtra;
		
		this.capacidadCarga=capacidadCarga;
		
	}
	
	public String dimeDatosFurgoneta() {
		
		return "La capacidad de carga es de: " + capacidadCarga + " y la plaza extra son de: " + plazasExtra;
	}
}
