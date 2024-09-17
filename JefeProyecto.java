package es.ifp.programacion.ejercicio.uf5;


public class JefeProyecto extends Persona {

	//Clase Cliente que hereda de la clase Perosna donde se incluyen los datos de tipo String Nombre, apellidos y DNI.

	//Atributos
	private int numEmpleado;



	//Constructores


	/**
	 * Constructor de la clase JefeProyecto con 5 parámetros.
	 * @param nombre nombre del jefe de royecto
	 * @param apellido1 apellido 1 del jefe de proyectos
	 * @param apellido2 apellido 2 del jefe de proyecto.
	 * @param DNI DNI del jefe de proyecto
	 * @param numEmpleado número de empleado de jefe de proyecto.
	 * @throws MensajeNumEmpleadoException Excepción que utilizamos en caso de que el número de emlpeado con esté entre 1 y 100.
	 */

	/**
	 * Constructor con 5 parámetros de la clase Jefe proyecto.
	 * @param nombre
	 * @param apellido1
	 * @param apellido2
	 * @param DNI
	 * @param numEmpleado
	 * @throws MensajeNumEmpleadoException Excepción
	 */
	public JefeProyecto (String nombre, String apellido1, String apellido2, String DNI, int numEmpleado) throws MensajeNumEmpleadoException {

		super (nombre, apellido1, apellido2, DNI);

		// Llamamos a la función setnumEmpleado en vez de dar valor a la variable aquí, para no duplicar código.
		this.setnumEmpleado(numEmpleado);

	}


	//Métodos
	/**
	 * Método que permite acceder al atributo numEmpleado desde otra clase.
	 * @return retorna el número de empleado
	 */
	public int getnumEmpleado() {
		return numEmpleado;
	}

	/**
	 * Método que permite la modificación del número de empleado.
	 * @param nuevoNumEmpleado guarda el nuevo dato del número del empleado.
	 * @throws MensajeNumEmpleadoException Excepción que utilizamos en caso de que el número de emlpeado con esté entre 1 y 100.
	 */
	public void setnumEmpleado(int nuevoNumEmpleado) throws MensajeNumEmpleadoException  {
		if (nuevoNumEmpleado <1 || nuevoNumEmpleado >100) {
			throw new MensajeNumEmpleadoException("El Número de Empleado del Jefe de Proyecto "+getNombre()+" debe ser un número entre 1 y 100.");
		}
		this.numEmpleado=nuevoNumEmpleado;
	}



	/**
	 * Método toString que sobreescribe y formatea los datos.
	 */
	@Override
	public String toString() {

		return "Jefe de Proyecto: " + super.toString() + "\n"
				+ "Número de empleado: " + this.getnumEmpleado() + "\n"
				+ "Rol que ocupa: " + this.rol() + "\n";

	}

/**
 * Método de obligada implementación por la imposición en la clase padre Persona.
 * @return el rol que ocupa, en este caso Jefe de proyecto.
 */
	public String rol() {
		return "JP";

	}



}
