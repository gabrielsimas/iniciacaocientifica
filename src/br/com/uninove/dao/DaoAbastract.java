package br.com.uninove.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public abstract class DaoAbastract implements IDAO {
	protected String table;
	protected Connection con;
	
	public  void close(){
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public abstract void insert(Object orm);

	@Override
	public abstract void update(Object orm);

	@Override
	public void delete(String where, Object[] valores) {
		String query = "DELETE * FROM " + this.table + where;
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(query);
			if (valores != null) {

				ps = new Conexao().where(ps, valores);

			}
			
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public int LastId(){
		int id = 0;
		ResultSet resultset = this.listaResultSet("ORDER BY cod_professor DESC limit 1", null);
		try {
			if (resultset.next()) {
				id = resultset.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return id + 1;
	}

	@Override
	public List<Object> listaObjetos(String where, Object[] valores) {

		ResultSet resultset = this.listaResultSet(where, valores);
		List<Object> lista = new ArrayList<Object>();

		try {

			while (resultset.next()) {
				lista.add(this.preencherORM(resultset));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return lista;
	}

	@Override
	public ResultSet listaResultSet(String where, Object[] valores) {
		String query = "SELECT * FROM " + this.table + " " + where;
		try {
			PreparedStatement ps =  con.prepareStatement(query);
			if (valores != null) {
				ps = new Conexao().where(ps, valores);
			}

			ResultSet list = ps.executeQuery();

			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public abstract Object preencherORM(Object orm) throws Exception;

	@Override
	public abstract void preencherParametros(Object orm, PreparedStatement ps);

}
