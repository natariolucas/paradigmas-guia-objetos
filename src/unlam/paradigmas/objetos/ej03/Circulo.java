package unlam.paradigmas.objetos.ej03;

public class Circulo {
	
	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	// Radio
	
	public double obtenerRadio() {
		return this.radio;
	}
	
	public void cambiarRadio(double radio) {
		this.radio = radio;
	}
	
	// Diametro
	
	public double obtenerDiametro() {
		return radioADiametro(this.radio);
	}
	
	public void cambiarDiametro(double diametro) {
		this.radio = diametroARadio(diametro);
	}
	
	// Perimetro
	
	public double obtenerPerimetro() {
		return radioAPerimetro(this.radio);
	}
	
	public void cambiarPerimetro(double perimetro) {
		this.radio = perimetroARadio(perimetro);
	}
	
	// Area
	
	public double obtenerArea() {
		return radioAArea(this.radio);
	}
	
	public void cambiarArea(double area) {
		this.radio = areaARadio(area);
	}
	
	// Helpers
	
	private static double diametroARadio(double diametro) {
		return diametro/2;
	}
	
	private static double radioADiametro(double radio) {
		return 2 * radio;
	}
	
	private static double radioAPerimetro(double radio) {
		return 2 * Math.PI * radio;
	}
	
	private static double perimetroARadio(double perimetro) {
		return perimetro / (2 * Math.PI);
	}
	
	private static double radioAArea(double radio) {
		return Math.PI * Math.pow(radio, 2);
	}
	
	private static double areaARadio(double area) {
		return Math.sqrt(area / Math.PI);
	}

}
