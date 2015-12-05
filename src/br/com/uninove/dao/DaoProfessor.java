package br.com.uninove.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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
	public OrmProfessor preencherORM(ResultSet rs) throws Exception {
		OrmProfessor orm = new OrmProfessor();
		orm.setCodigo(rs.getInt("cod_professor"));
		orm.setNome(rs.getNString("nome"));
		orm.setEmail(rs.getNString("email"));
		return orm;
	}

	@Override
	public void preencherParametros(OrmProfessor orm, PreparedStatement ps) {
		try {
			ps.setString(1, orm.getNome());
			ps.setNString(2, orm.getEmail());
			ps.setInt(3, orm.getCodigo());
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
				query = "INSET INTO prof_disciplinas (cod_professor, cod_disciplina) VALUES (?,?)";
				ps = (PreparedStatement) this.con.prepareStatement(query);
				preencherParametros(new int[] {orm.getCodigo(),disciplina.getCod_disciplina()}, ps);
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
			
			this.table = "prof_disciplinas";
			this.delete("Where cod_professor = ?", new Object[] {orm.getCodigo()});
			
			for (OrmDisciplina disciplina : orm.getDisciplinas()) {
				query = "INSET INTO prof_disciplinas (cod_professor, cod_disciplina) VALUES (?,?)";
				ps = (PreparedStatement) this.con.prepareStatement(query);
				preencherParametros(new int[] {orm.getCodigo(),disciplina.getCod_disciplina()}, ps);
			}
		

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}