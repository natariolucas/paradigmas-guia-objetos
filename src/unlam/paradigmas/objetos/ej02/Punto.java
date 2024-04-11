package unlam.paradigmas.objetos.ej02;

public class Punto {

	private double x;
	private double y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double obtenerX() {
		return this.x;
	};

	public double obtenerY() {
		return this.y;
	};

	public void cambiarX(double nuevoX) {
		this.x = nuevoX;
	};

	public void cambiarY(double nuevoY) {
		this.y = nuevoY;
	};

	public boolean estaSobreEjeX() {
		return this.y == 0;
	};

	public boolean estaSobreEjeY() {
		return this.x == 0;
	};

	public boolean esElOrigen() {
		return this.y == 0 && this.x == 0;
	}

	public double distanciaAlOrigen() {
		return this.distanciaAotroPunto(new Punto(0,0));
	}

	public double distanciaAotroPunto(Punto otro) {
		double distanciaX = Math.pow(this.x - otro.x, 2);
		double distanciaY = Math.pow(this.y - otro.y, 2);

		return Math.sqrt(Math.abs(distanciaX + distanciaY));
	}
}
