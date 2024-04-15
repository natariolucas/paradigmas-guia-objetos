package unlam.paradigmas.objetos.ej06;

public class Cerradura {

	/**
	 * Una cerradura se bloquea una vez que llega a una cantida de fallos igual a la indicada al inicializarse
	 * Una cerradura bloqueada no se puede desbloquear
	 * Una cerradura bloqueada tambien se considera cerrada para la interfaz
	 * Una vez bloqueada la cerradura, si se sigue intentando abrir se continuan contando los fallos
	 * */
	
	private static int estadoAperturaAbierta = 1;
	private static int estadoAperturaCerrada = 0;
	private static int estadoAperturaBloqueada = 2;
	
	private int claveDeApertura;
	private int cantidadDeFallosConsecutivosQueLaBloquean;
	private int estadoApertura; /** Valores posibles: estadoAperturaAbierta | estadoAperturaCerrada | estadoAperturaBloqueada */
	private int aperturasExitosas;
	private int aperturasFallidas;
	private int fallosConsecutivosDeClave;

	/**
	 * pre: cantidadDeFallosConsecutivosQueLaBloquean es mayor a cero
	 * post: Inicializa la cerradura con clave y limite de fallos para bloquear. 
	 * 			Se inicializa cerrada.
	 */
	public Cerradura(int claveDeApertura, int cantidadDeFallosConsecutivosQueLaBloquean) {
		this.claveDeApertura = claveDeApertura;
		this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
		this.estadoApertura = estadoAperturaCerrada;
		this.aperturasExitosas = 0;
		this.aperturasFallidas = 0;
		this.fallosConsecutivosDeClave = 0;
	}
	
	/**
	 * pre: El estado de apertura es cerrada o bloqueada
	 * post: Si clave coincide con la clave de apertura inicializada, se actualiza el estado a abierta
	 * 			Devuelve true si se pudo abrir, false si no se pudo abrir por clave o bloqueo.
	 */
	public boolean abrir(int clave) {
		if (this.estadoApertura == estadoAperturaCerrada && clave == this.claveDeApertura) { // TODO: validar bloqueo 
			this.estadoApertura = estadoAperturaAbierta;
			this.aperturasExitosas++;
			this.fallosConsecutivosDeClave = 0;
			
			return true;
		}
		
		this.aperturasFallidas++;
		this.fallosConsecutivosDeClave++;
		if(this.fallosConsecutivosDeClave == this.cantidadDeFallosConsecutivosQueLaBloquean) {
			this.estadoApertura = estadoAperturaBloqueada;
		}
		
		
		return false;
	}
	
	/**
	 * pre: El estado de apertura es abierta o bloqueada
	 * post: Se actualiza el estado a cerrada si no está bloqueada la cerradura.
	 */
	public void cerrar() {
		if (this.estadoApertura == estadoAperturaAbierta) {
			this.estadoApertura = estadoAperturaCerrada; // TODO: validar bloqueo	
		}
	}
	
	/**
	 * post: Devuelve true solo si el estado de apertura es abierto
	 * 
	 */
	public boolean estaAbierta() {
		return this.estadoApertura == estadoAperturaAbierta;
	}
	
	/**
	 * post: Devuelve true si el estado de la cerradura es cerrado o bloqueado
	 * 
	 */
	public boolean estaCerrada() {
		return this.estadoApertura != estadoAperturaAbierta;
	}
	
	/**
	 * post: Devuelve true si el estado de la cerradura es bloqueada
	 * 
	 */
	public boolean fueBloqueada() {
		return this.estadoApertura == estadoAperturaBloqueada;
	}
	
	public int contarAperturasExitosas() {
		return this.aperturasExitosas;
	}
	
	public int contarAperturasFallidas() {
		return this.aperturasFallidas;
	}
	
}
