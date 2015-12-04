package br.com.uninove.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.uninove.pojo.OrmDisciplina;

public class DaoDisciplinas extends DaoAbastract<OrmDisciplina> {
	
	public DaoDisciplinas() {
		this.table = "disciplinas";
		try {
			this.con = new Conexao().conecta();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public ResultSet preencherORM(ResultSet rs) throws Exception {
		OrmDisciplina orm = new OrmDisciplina();
		orm.setCod_disciplina(rs.getInt("cod_disciplina"));
		orm.setDisciplina(rs.getNString("disciplina"));
		return rs;
	}

	@Override
	public void preencherParametros(OrmDisciplina orm, PreparedStatement ps) {
		try {
			ps.setNString(1, orm.getDisciplina());
			ps.setInt(2, orm.getCod_disciplina());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void insert(OrmDisciplina orm) {
		try {

			String query = "INSET INTO disciplinas (disciplina, cod_disciplina) VALUES (?,?)";
			PreparedStatement ps = (PreparedStatement) this.con.prepareStatement(query);
			preencherParametros(orm, ps);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(OrmDisciplina orm) {
		try {

			String query = "UPDATE  disciplinas SET disciplina = ? WHERE cod_disciplina = ?";
			PreparedStatement ps = (PreparedStatement) this.con.prepareStatement(query);
			preencherParametros(orm, ps);

		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

}
