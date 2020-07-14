package cl.javanerds.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import cl.javanerds.modelo.Administrador;


public class AdminDao {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public List<Administrador> getEvaluaciones() {
		return template.query("select * from Administrador", new RowMapper<Administrador>() {
			public Administrador mapRow(ResultSet rs, int row) throws SQLException{
				Administrador admin = new Administrador();
				admin.setIdAdmin(rs.getInt(1));
				admin.setUsuario(rs.getString(2));
				admin.setPassword(rs.getString(3));
				return admin;
			}			
			
		});
	
	}
}
