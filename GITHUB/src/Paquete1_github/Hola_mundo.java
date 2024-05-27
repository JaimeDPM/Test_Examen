package Paquete1_github;
//Primera linea de comentario!
/**
 * @author jdepa
 * @version 27/05/2024
 */

public class Hola_mundo {

	/**
	 * valores de ejemplo
	 */
	String name;
	int codigo;
	
	/**
	 * @param name string ejemplo
	 * @param codigo int codigo
	 */
	public Hola_mundo(String name, int codigo) {
		
		super();
		this.name = name;
		this.codigo = codigo;
	}

	/**
	 * 
	 * @return valor nombre
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name setter de name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return valor codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * 
	 * @param codigo setter de codigo
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	
	@Override
	public String toString() {
		return "Hola_mundo [name=" + name + ", codigo=" + codigo + "]";
	}
	
	
	
}
