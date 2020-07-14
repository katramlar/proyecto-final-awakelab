package cl.javanerds.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import cl.javanerds.modelo.Cliente;

public class ClienteDao {
	
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public List<Cliente> getEvaluaciones() {
		return template.query("select * from Cliente", new RowMapper<Cliente>() {
			public Cliente mapRow(ResultSet rs, int row) throws SQLException{
				Cliente cliente = new Cliente();
				cliente.setIdCliente(rs.getInt(1));
				cliente.setRut(rs.getString(2));
				cliente.setNombre(rs.getString(3));
				return cliente;
			}			
			
		});
		
	}
}
