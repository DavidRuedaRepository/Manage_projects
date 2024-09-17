package es.ifp.programacion.ejercicio.uf5;
/**
 * Clase que usamos para controlar la excepción del número de empleado en la clase jefe de proyecto.
 */
public class MensajeNumEmpleadoException extends Exception {
	
	
	/**
	 * Constructor de la clase MensajeNumEmpleadoException
	 * @param msg mensaje que mostrará la excepción.
	 */
	public MensajeNumEmpleadoException (String msg) {
		super (msg);
	}

}
