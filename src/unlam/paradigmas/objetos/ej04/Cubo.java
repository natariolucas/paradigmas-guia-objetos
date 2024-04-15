package unlam.paradigmas.objetos.ej04;

public class Cubo {

	private double lado; // Aristas
	
    /**
     * pre : longitudLado es un valor mayor a 0.
     * post: inicializa el cubo a partir de la longitud de lado dada
     */
	
    public Cubo (double longitudLado) {
    	this.lado = longitudLado;
    }

    /**
     * post: devuelve la longitud de todos los lados del cubo
     */
    public double obtenerLado() {
    	return this.lado;
    }
    
    /**
     * pre : longitudLado es un valor mayor a 0.
     * post: cambia la longitud de todos los lados del cubo
     */
    public void cambiarLado(double longitudLado) {
    	this.lado = longitudLado;
    }
    
    /**
     * post: devuelve el área de la superficie de las caras del cubo
     */
    public double obtenerAreaCara() {
    	return ladoAAreaCara(this.lado);
    }
    
    /**
     * pre: areaCara es un valor mayor a 0.
     * post: cambia el área de las caras del cubo
     */
    public void cambiarAreaCara(double areaCara) {
    	this.lado = areaCaraALado(areaCara);
    }

    /**
     * post: devuelve el volumen que encierra el cubo
     */
    public double obtenerVolumen() {
    	return ladoAVolumen(this.lado);
    }

    /**
     * pre: volumen es un valor mayor a 0.
     * post: cambia el volumen del cubo
     */
    public void cambiarVolumen(double volumen) {
    	this.lado = volumenALado(volumen);
    }
    
    // helpers 
    
    private static double ladoAAreaCara(double lado) {
    	return Math.pow(lado, 2);
    }
    
    private static double areaCaraALado(double areaCara) {
    	return Math.sqrt(areaCara);
    }
    
    private static double ladoAVolumen(double lado) {
    	return Math.pow(lado, 3);
    }
    
    private static double volumenALado(double volumen) {
    	return Math.cbrt(volumen);
    }
    
}
