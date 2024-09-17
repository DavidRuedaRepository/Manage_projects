package es.ifp.programacion.ejercicio.uf5;

import java.time.LocalDate; //Importo la clase LocalDate para imprimir la fecha actual.
import java.util.ArrayList;

/**
 * @author David Rueda
 * Clase proyecto que define el objeto Proyecto mediante sus atributos particulares, contructores y métodos.
 * 
 * Elección de ArrayList por facilidad de uso y aunque no esté sincronizada(que dos métodos accedan al mismo tiempo a sus datos)
 * para este caso no es necesario. Además en caso de añadir varios elementos el tiempo de proceso será el mismo sin ser exponencial.
 */

public class Proyecto {


	//Atributos
	private String idProyecto;
	private String nombrePro;
	private String descripcionPro;



	// 	Creo dos Arraylist.
	//Este primero incluirán datos de tipo JefeProyecto y lo defino aquí.
	ArrayList<JefeProyecto> listaJefeProyecto = new ArrayList<JefeProyecto>();
	//Este segundo listado almacenará datos de tipo Cliente.
	ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();


	//Constructores
	/**
	 *Constructor de la clase Proyecto con 5 parámetros.
	 * @param idProyecto Identificador del proyecto.
	 * @param nombrePro Nombre del proyecto.
	 * @param descripcionPro Descripción del proyecto.
	 * @param CLI Por composición definimos este constructor con los atributos de la clase Cliente.
	 * @param JP Por composición definimos este constructor con los atributos de la clase JefeProyecto
	 */
	public Proyecto(String idProyecto, String nombrePro, String descripcionPro, Cliente CLI, JefeProyecto JP) {
		this.idProyecto=idProyecto;
		this.nombrePro=nombrePro;
		this.descripcionPro=descripcionPro;

		//Se agrega el objeto CLI a listaCliente) del proyecto.
		this.listaClientes.add(CLI);
		//Se agrega el objeto CLI a listaCliente) del proyecto.
		this.listaJefeProyecto.add(JP);

	}

	//Métodos

	/**
	 * Método que permite acceder desde otra clase al identificador del proyecto ya que es un atributo privado.
	 * @return Retorna el identificador del proyecto.
	 */
	public String getIdProyecto() {
		return idProyecto;
	}


	/**
	 * Método que permite modificar el identificador del proyecto.
	 * @param definimos que el identificador del proyecto será modificado mediante el atributo nueboProyecto.
	 */
	public void setIdProyecto(String nuevoidProyecto) {
		this.idProyecto = nuevoidProyecto;
	}


	/**
	 * Método que permite acceder desde otra clase al atributo nombre proyecto.
	 * @return Retorna el nombre del proyecto.
	 */
	public String getNombrePro() {
		return nombrePro;
	}


	/**
	 * Método que permite modificar el nombre del proyecto.
	 * @param nuevoNombrePro será el nuevo nombre del proyecto.
	 */
	public void setNombrePro(String nuevoNombrePro) {
		this.nombrePro = nuevoNombrePro;
	}


	/**
	 * Método que permite acceder desde otra clase la descripción del proyecto.
	 * @return retorna la descripción del proyecto.
	 */
	public String getDescripcionPro() {
		return descripcionPro;
	}


	/**
	 * Método que permite modificar la descripción del proyecto
	 * @param buevoDescripcionPro será la nueva descripción del proyecto.
	 */
	public void setDescripcionPro(String nuevoDescripcionPro) {
		this.descripcionPro = nuevoDescripcionPro;
	}




	/**
	 *Método que permite acceder a los datos del cliente desde otra clase.
	 * @return retorna datos del cliente a la lista de clientes.
	 */
	public ArrayList<Cliente> getlistaClientes() {
		return listaClientes;
	}


	/**
	 *  Método que permite agregar un nuevo cliente a la lista de clientes
	 * @param nuevoCLI almacenará los nuevos datos.
	 */
	public void nuevoCLI(Cliente nuevoCLI) {
		this.listaClientes.add(nuevoCLI);
	}


	/**
	 *  Método que permite acceder a los datos de JefeProyecto desde otra clase
	 * @return retorna datos del jefe de proyecto a la lista de jefes de proyecto.
	 */
	public ArrayList<JefeProyecto> getlistaJefeProyecto() {
		return listaJefeProyecto;
	}


	/**
	 * Método que permite agregar un nuevo jefe de priyecto a la lista de jefes de proyecto.
	 * @param jP almacenará los nuevos datos.
	 */
	public void nuevoJP(JefeProyecto nuevoJP) {
		this.listaJefeProyecto.add(nuevoJP);
	}

	/**
	 * Método toString que sobreescribe los datos del proyecto formateados como le indicamos en este método.
	 */
	@Override
	public String toString() {
		//En el String proyecto almacenamos lo que se imprimiremos en consola sobre la clase proyecto.
		//Donde se incluyen datos del proyecto, datos de clientes traidos con el get de la lista de cliente.
		//y datos de los jefes de proyecto traídos con los get de la lista de jefes de proyecto.
		String proyecto= "=============================================\n"+
				"                    PROYECTO                 \n"+
				"=============================================\n"+
				"ID proyecto: "+this.idProyecto+"\n"
				+"Nombre Proyecto: "+ this.nombrePro+"\n"
				+"Descripción Proyecto: "+ this.descripcionPro+"\n"
				+"Fecha de Inicio: " + LocalDate.now()+"\n\n" 
				+"=============================================\n"
				+"                 DATOS CLIENTES               \n"
				+"=============================================\n";


		//Bucle for para recorrer la lista de clientes

		for (int i=0;i<this.getlistaClientes().size();i++) {
			//En cada recorrido, se imprimen los datos del cliente almacenados en proyecto
			proyecto+="Cliente: "+this.getlistaClientes().get(i).toString()+"\n";

		}

		proyecto+="=============================================\n"
				+"          DATOS JEFES DE PROYECTO            \n"
				+"=============================================\n";

		//Bucle for para recorrer la lista de clientes

		for (int i=0;i<this.getlistaJefeProyecto().size();i++) {
			//En cada recorrido, se imprimen los datos del jefe de proyecto almacenados en proyecto
			proyecto+= this.getlistaJefeProyecto().get(i).toString()+"\n";
		}

		//Retornamos la cadena o String proyecto.
		return proyecto;


	}








}
