package cl.javanerds.modelo;

public class Profesional {
	
	private int idProfesional;
	
	private String usuario;
	
	private String password;

	
	public Profesional() {
		super();
	}

	public Profesional(int idProfesional, String usuario, String password) {
		super();
		this.idProfesional = idProfesional;
		this.usuario = usuario;
		this.password = password;
	}

	public int getIdProfesional() {
		return idProfesional;
	}

	public void setIdProfesional(int idProfesional) {
		this.idProfesional = idProfesional;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
		

}
