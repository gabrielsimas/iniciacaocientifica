package br.com.uninove.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.com.uninove.pojo.OrmDisciplina;
import br.com.uninove.pojo.OrmProfessor;

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
	public OrmDisciplina preencherORM(ResultSet rs) throws Exception {
		OrmDisciplina orm = new OrmDisciplina();
		orm.setCod_disciplina(rs.getInt("cod_disciplina"));
		orm.setDisciplina(rs.getNString("disciplina"));
		
		ResultSet listaResultSet = this.listaResultSet("select cod_professor from prof_disciplinas where  "
				+ "cod_disciplina = ?", new Object[] { orm.getCod_disciplina()});
		String ids = "(0,";
		while (listaResultSet.next()) {
			ids += listaResultSet.getInt(0);
		}
		
		ids += ")";
		
		List<OrmProfessor> professores = new DaoProfessor().listaObjetos(" Where cod_professor in " + ids, null);
		orm.setProfessores(professores);
		return orm;
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

			for (OrmProfessor professor : orm.getProfessores()) {
				query = "INSET INTO prof_disciplinas (cod_disciplina, cod_professor ) VALUES (?,?)";
				ps = (PreparedStatement) this.con.prepareStatement(query);
				preencherParametros(new int[] { orm.getCod_disciplina(), professor.getCodigo() }, ps);
			}

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
			
			this.table = "prof_disciplinas";
			this.delete("Where cod_disciplina = ?", new Object[] {orm.getCod_disciplina()});			
			
			for (OrmProfessor professor : orm.getProfessores()) {
				query = "INSET INTO prof_disciplinas (cod_disciplina, cod_professor ) VALUES (?,?)";
				ps = (PreparedStatement) this.con.prepareStatement(query);
				preencherParametros(new int[] { orm.getCod_disciplina(), professor.getCodigo() }, ps);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
