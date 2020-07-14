package cl.javanerds.modelo;

public class Cliente {

	private int idCliente;
	private String rut;
	private String nombre;
	
		
	public Cliente() {
		super();
	}



	public Cliente(int idCliente, String rut, String nombre) {
		super();
		this.idCliente = idCliente;
		this.rut = rut;
		this.nombre = nombre;
	}



	public int getIdCliente() {
		return idCliente;
	}



	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}



	public String getRut() {
		return rut;
	}



	public void setRut(String rut) {
		this.rut = rut;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
