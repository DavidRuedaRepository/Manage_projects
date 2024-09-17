package es.ifp.programacion.ejercicio.uf5;

/**
 * - Resolución del ejercicio: Igual que el de la UF4 incorporando más clientes y utilizando arrayList para listarlos.
 * Los recorremos para después llamar al método toString en cada iteración e imprimirlos en consola.
 * 
 * Controlamos el posible error en el número de empleado del jefe de proyecto con un try catch que para el programa e imprime un mensaje
 * sabiendo cual es el error a corregir.
 */

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			/**
			 * Objeto Ana de tipo JefeProyecto que instancio mediante el uso de su contructor.
			 */
			JefeProyecto Ana = new JefeProyecto("Ana","Pérez","Pérez", "99887766D",5);

			/**
			 * Objeto Juan de tipo JefeProyecto que instancio mediante el uso de su contructor.
			 */
			JefeProyecto Juan = new JefeProyecto("Juan","Suarez","Suarez", "123456789E",32); 

			/**
			 * Objeto Alberto de tipo Cliente que instancio a través de su contructor.
			 */
			Cliente Alberto = new Cliente("Alberto", "Suarez", "Suarez", "55667788E", "67D");
			
			/**
			 * Objeto Maria de tipo Cliente que instancio a través de su contructor.
			 */
			Cliente Maria = new Cliente("Maria", "Núñez", "Núñez", "99774433D", "23A");

			/**
			 * Objeto proyecto de tipo Proyecto que instancio a través de su contructor.
			 */
			Proyecto proyecto = new Proyecto("34", "Banca móvil BBVA", "Módulos para Banca Móvil BBVA",Alberto,Ana);
			
			
			//Añadimos nuevo cliente a la lista de clientes del proyecto.
			proyecto.nuevoCLI(Maria);
			//Añadimos nuevo jefe de proyecto a la lista de jefes de proyecto del proyecto.
			proyecto.nuevoJP(Juan);



			// Imprime el método sobrescribiendo toString de la clase proyecto con los datos del proyecto.
			System.out.println(proyecto.toString());


		} catch (MensajeNumEmpleadoException e) {

			//Controlamos el error del número de empleado del jefe de proyecto.
			System.out.println("Error: "+e.getMessage());
		}
	}

}




