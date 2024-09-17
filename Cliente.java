package es.ifp.programacion.ejercicio.uf5;

public class Cliente extends Persona {
	
	/**
	 * Clase Cliente que hereda de la clase Perosna donde se incluyen los datos de tipo String Nombre, apellidos y DNI.
	 */
	
	//Atriutos
	
	
	private String idCliente; //Encapsulamiento, definimos los atributos con visibilidad privada para ofrecer más seguridad a nuestro código y como buena práctica.
	

	
	//Constructores
	/**
	 * Constructor con 5 parámetros de la clase Cliente.
	 * @param nombre del cliente
	 * @param primer apellido del cliente.
	 * @param apellido2 segundo apellido del cliente.
	 * @param DNI del cliente.
	 * @param idCliente identificador del cliente.
	 */
	public Cliente (String nombre, String apellido1, String apellido2, String DNI, String idCliente) {
		
		super (nombre, apellido1, apellido2, DNI); //la palabra reservada super llamamos al constructor de la clase padre(Persona)
		this.idCliente=idCliente;//con this hacemos referencia a que es el atributo de esta clase ya que recibe el mismo nombre que el parámetro del constructor.
		
	}
	
	//Métodos
	/**
	 * Método que nos permite recoger el identificador del cliente ya que es un atributo privado.
	 * @return retorna el identificador del cliente.
	 */
	public String getidCliente() {
		return idCliente;
	}
	/**
	 * Método que nos permite modificar por encapsulamiento el identificador del cliente.
	 * @param nuevoIdCliente
	 */
	public void setidCliente(String nuevoIdCliente) {
		this.idCliente=nuevoIdCliente;
	}

	/**
	 * Método toString que sobreescribe los datos.
	 */
	@Override 
	public String toString() {
		return super.toString()+"\n"+ //Llamada al método toString de la superclase Persona.
				"Identificación de cliente: "+this.getidCliente()+"\n" //Llamada al método get de la clase.
				+"Rol que ocupa: "+this.rol()+"\n";
		
	}
	
	/**
	 * Método que se añade en obligado cumplimiento ya que la clase abstracta persona nos obliga a definir e implementamos con el nombre CLI para identificar el rol de cliente.
	 */
	public String rol() {
		return "CLI";
	
	}
	
}
	
	
