package br.com.uninove.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.MySQLConnection;
import com.mysql.jdbc.PreparedStatement;

import br.com.uninove.pojo.OrmProfessor;

public class DaoProfessor extends DaoAbastract {

	public DaoProfessor() {
		this.table = "professores";
		try {
			this.con = (MySQLConnection) new Conexao().conecta();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void insert(Object orm) {
		try {

			OrmProfessor professor = (OrmProfessor) orm;
			professor.setCodigo(LastId());
			String query = "INSERT INTO professores(nome, email, cod_professor) VALUES (?,?,?)";
			PreparedStatement ps = (PreparedStatement) this.con.prepareStatement(query);
			preencherParametros(professor, ps);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void update(Object orm) {
		try {

			OrmProfessor professor = (OrmProfessor) orm;
			String query = "UPDATE  professores SET nome = ?, email = ? WHERE cod_professor = ?";
			PreparedStatement ps = (PreparedStatement) this.con.prepareStatement(query);
			preencherParametros(professor, ps);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public Object preencherORM(Object orm) throws Exception {
		ResultSet rs = (ResultSet) orm;
		OrmProfessor professor = new OrmProfessor();
		professor.setCodigo(rs.getInt("cod_professor"));
		professor.setNome(rs.getNString("nome"));
		professor.setEmail(rs.getNString("email"));

		return professor;
	}

	@Override
	public void preencherParametros(Object orm, PreparedStatement ps) {
		try {

			OrmProfessor professor = (OrmProfessor) orm;
			ps.setString(1, professor.getNome());
			ps.setNString(2, professor.getEmail());
			ps.setInt(3, professor.getCodigo());

			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
