package cl.javanerds.modelo;

public class Visita {
	
	private int idVisita;
	
	private String descripcion;
	
	private ProfesionalCliente profesionalCliente;

	
	public Visita() {
		super();
	}


	public Visita(int idVisita, String descripcion, ProfesionalCliente profesionalCliente) {
		super();
		this.idVisita = idVisita;
		this.descripcion = descripcion;
		this.profesionalCliente = profesionalCliente;
	}


	public int getIdVisita() {
		return idVisita;
	}

	public void setIdVisita(int idVisita) {
		this.idVisita = idVisita;
	}

	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public ProfesionalCliente getProfesionalCliente() {
		return profesionalCliente;
	}

	public void setProfesionalCliente(ProfesionalCliente profesionalCliente) {
		this.profesionalCliente = profesionalCliente;
	}	

}
