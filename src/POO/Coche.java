package POO;

public class Coche {
	
	public Coche() {
		
		ruedas=4;
		
		color="gris";
		
		pesoBase=1350.25;
		
		precioBase=15650.25;
		
		peso=pesoBase;
		
		precio=precioBase;
		
	}
	
	private double ancho;
	
	private double alto;
	
	private double peso;
	
	private double pesoBase;
	
	private String color;
	
	private int ruedas;

	private boolean climatizador;
	
	private boolean asientosCuero;
	
	private double precio;
	
	private double precioBase;
	
	public double getPesoBase() {
		return pesoBase;
	}

	public String isClimatizador() {
		
		if(climatizador) return "El coche incorpora climatizador";
		else return "El coche incorpora aire acondicionado";
	}

	public String isAsientosCuero() {
		
		if(asientosCuero) return "El coche tiene asientos de cuero";
		else return "El coche no tiene asientos de cuero";
	
	}

	public double getPrecio() {
		return precio;
	}

	public double getPrecioBase() {		
		return precioBase;
	}

	public void setPesoBase(double pesoBase) {
		this.pesoBase = pesoBase;
	}

	public void setClimatizador(String climatizador) {
		
		if(climatizador.equalsIgnoreCase("si")) this.climatizador=true;
		else this.climatizador=false;
		setPeso();
		setPrecio();
		
	}

	public void setAsientosCuero(String asientosCuero) {
		
		if(asientosCuero.equalsIgnoreCase("si")) this.asientosCuero=true;
		else this.asientosCuero=false;
		setPeso();
		setPrecio();
		
	}

	private void setPrecio() {

		if(climatizador) precioBase+=3259.20;
		if(asientosCuero) precioBase+=3500.20;
		
		precio=precioBase;
		
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public double getAncho() {
		return ancho;
	}

	public double getAlto() {
		return alto;
	}

	public double getPeso() {
		return peso;
	}

	public String getColor() {
		return color;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	private void setPeso() {
		
		if(asientosCuero) pesoBase+=50;
		
		if(climatizador) pesoBase+=70;
		
		peso=pesoBase;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	
	

}
