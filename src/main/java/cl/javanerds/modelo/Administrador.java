package cl.javanerds.modelo;

public class Administrador {
	
	private int idAdmin;
	private String usuario;
	private String password;
	
	public Administrador() {
		super();
	}
	public Administrador(int idAdmin, String usuario, String password) {
		super();
		this.idAdmin = idAdmin;
		this.usuario = usuario;
		this.password = password;
	}
	public int getIdAdmin() {
		return idAdmin;
	}
	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
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
