package br.com.uninove.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.com.uninove.pojo.OrmProfessor;

public class DaoProfessor extends DaoAbastract<OrmProfessor> {

	public DaoProfessor() {
		this.table = "professores";
		try {
			this.con = new Conexao().conecta();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<ResultSet> listaObjetos(String where, OrmProfessor[] valores) {
		return null;
	}

	@Override
	public void insert(OrmProfessor orm) {
	}

	@Override
	public void update(OrmProfessor professor) {
		try {

			String query = "UPDATE  professores SET nome = ?, email = ? WHERE cod_professor = ?";
			PreparedStatement ps = (PreparedStatement) this.con.prepareStatement(query);
			preencherParametros(professor, ps);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public ResultSet preencherORM(ResultSet rs) throws Exception {
		OrmProfessor professor = new OrmProfessor();
		professor.setCodigo(rs.getInt("cod_professor"));
		professor.setNome(rs.getNString("nome"));
		professor.setEmail(rs.getNString("email"));
		return rs;
	}

	@Override
	public void preencherParametros(OrmProfessor professor, PreparedStatement ps) {
		try {
			ps.setString(1, professor.getNome());
			ps.setNString(2, professor.getEmail());
			ps.setInt(3, professor.getCodigo());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}