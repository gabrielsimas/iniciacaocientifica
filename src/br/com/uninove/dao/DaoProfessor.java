package br.com.uninove.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import br.com.uninove.pojo.OrmDisciplina;
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
	
	public void preencherParametros(OrmDisciplina professor, PreparedStatement ps) {
		try {
			ps.setString(1, professor.getDisciplina());
			ps.setInt(2, professor.getCod_disciplina());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void insert(OrmProfessor orm) {
		try {
			orm.setCodigo(this.LastId());
			String query = "INSET INTO professores (nome, email, cod_professor) VALUES (?,?,?)";
			PreparedStatement ps = (PreparedStatement) this.con.prepareStatement(query);
			preencherParametros(orm, ps);
			
			for (OrmDisciplina disciplina : orm.getDisciplinas()) {
				query = "INSET INTO disciplinas (disciplina, cod_disciplina) VALUES (?,?)";
				ps = (PreparedStatement) this.con.prepareStatement(query);
				preencherParametros(orm, ps);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(OrmProfessor orm) {
		try {

			String query = "UPDATE  professores SET nome = ?, email = ? WHERE cod_professor = ?";
			PreparedStatement ps = (PreparedStatement) this.con.prepareStatement(query);
			preencherParametros(orm, ps);
			
		

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}