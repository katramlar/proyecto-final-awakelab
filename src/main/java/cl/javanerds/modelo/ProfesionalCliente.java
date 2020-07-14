package cl.javanerds.modelo;

public class ProfesionalCliente {

	private int idRelacion;
	
	private Cliente cliente;
	
	private Profesional profesional;	

	public ProfesionalCliente() {
		super();
	}

	public ProfesionalCliente(int idRelacion, Cliente cliente, Profesional profesional) {
		super();
		this.idRelacion = idRelacion;
		this.cliente = cliente;
		this.profesional = profesional;
	}

	public int getIdRelacion() {
		return idRelacion;
	}

	public void setIdRelacion(int idRelacion) {
		this.idRelacion = idRelacion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Profesional getProfesional() {
		return profesional;
	}

	public void setProfesional(Profesional profesional) {
		this.profesional = profesional;
	}
	
}
