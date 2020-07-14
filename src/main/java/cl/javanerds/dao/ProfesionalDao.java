package cl.javanerds.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import cl.javanerds.modelo.Profesional;

public class ProfesionalDao {
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public List<Profesional> getEvaluaciones() {
		return template.query("select * from Administrador", new RowMapper<Profesional>() {
			public Profesional mapRow(ResultSet rs, int row) throws SQLException{
				Profesional pro = new Profesional();
				pro.setIdProfesional(rs.getInt(1));
				pro.setUsuario(rs.getString(2));
				pro.setPassword(rs.getString(3));
				return pro;
			}			
			
		});
	}
}
