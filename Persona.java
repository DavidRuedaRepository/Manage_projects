package es.ifp.programacion.ejercicio.uf5;

public abstract class Persona {
	
	//Atributos
	
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String DNI;
	
	
	
	//Constructores
	/**
	 * Contructor con 4 parámetros
	 * @param nombre de la persona
	 * @param ape1 apellido 1 de la persona
	 * @param ape2 apellido 2 de la persona
	 * @param DNI de la persona
	 */
	public Persona (String nombre, String ape1, String ape2, String DNI) {
		
		this.nombre=nombre;
		this.apellido1=ape1;
		this.apellido2=ape2;
		this.DNI=DNI;
	}
	
	
	
	//Métodos
	/**
	 * Método que retorna el nombre y podemos acceder desde fuera de la clase.
	 * @return el nombre de la persona.
	 */
	public String getNombre() {
	
	return nombre;
}


	/**
	 * Método que retorna el primer apellido de la persona
	 * @return the apellido1
	 */
	public String getApellido1() {
		return apellido1;
	}





	/**
	 * Método que retorna el segundo apellido de la persona.
	 * @return the apellido2
	 */
	public String getApellido2() {
		return apellido2;
	}




	/**
	 * Método que retorna el DNI de la persona.
	 * @return the dNI
	 */
	public String getDNI() {
		return DNI;
	}

	
	
	/**
	 * Método toString que sobreescribe los métodos get que nos retornan los datos de la persona.
	 */
	@Override
	public String toString() {
		
		return this.getNombre()
		+" "+this.getApellido1()
		+" "+this.getApellido2()+"\n"+
		"DNI: "+this.getDNI();
		
	}
	/**
	 * Definimos un método abstracto que convierte la clase en abstracta y obligamos a implementar en sus clases hijas.
	 * @return
	 */
	public abstract String rol();

	
}
