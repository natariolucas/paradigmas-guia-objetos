package unlam.paradigmas.objetos.ej05;

public class TarjetaBaja {

	private static double costoViajeColectivo = 39.59;
	private static double costoViajeSubte = 34.50;

	private double saldo;
	private int viajesEnColectivo;
	private int viajesEnSubte;

	/**
	 * post: saldo de la Tarjeta en saldoInicial.
	 */
	public TarjetaBaja(double saldoInicial) {
		this.saldo = saldoInicial;
		this.viajesEnColectivo = 0;
		this.viajesEnSubte = 0;
	}

	/**
	 * post: devuelve el saldo actual de la Tarjeta
	 */
	public double obtenerSaldo() {
		return this.saldo;
	}

	/**
	 * post: agrega el monto al saldo de la Tarjeta.
	 */
	public void cargar(double monto) {
		if (monto > 0) { // No se permite cargar saldo negativo
			this.saldo += monto;
		}
	}

	/**
	 * pre : saldo suficiente. post: utiliza 39.59 del saldo para un viaje en
	 * colectivo.
	 */
	public void pagarViajeEnColectivo() {
		this.saldo -= costoViajeColectivo;
		this.viajesEnColectivo++;
	}

	/**
	 * pre : saldo suficiente. post: utiliza 34.50 del saldo para un viaje en subte.
	 */
	public void pagarViajeEnSubte() {
		this.saldo -= costoViajeSubte;
		this.viajesEnSubte++;
	}

	/**
	 * post: devuelve la cantidad de viajes realizados.
	 */
	public int contarViajes() {
		return this.viajesEnColectivo + this.viajesEnSubte;
	}

	/**
	 * post: devuelve la cantidad de viajes en colectivo.
	 */
	public int contarViajesEnColectivo() {
		return this.viajesEnColectivo;
	}

	/**
	 * post: devuelve la cantidad de viajes en subte.
	 */
	public int contarViajesEnSubte() {
		return this.viajesEnSubte;
	}

}
