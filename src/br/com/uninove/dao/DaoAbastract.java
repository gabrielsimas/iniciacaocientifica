package br.com.uninove.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class DaoAbastract<T> implements IDAO<T> {
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
	public abstract void insert(T orm);

	@Override
	public abstract void update(T orm);
	
	@Override
	public abstract T preencherORM(ResultSet resultSet) throws Exception;
	
	@Override
	public void preencherParametros(int[] orm, PreparedStatement ps) {
		try {
			int index = 0;
			for (int i : orm) {
				index++;
				ps.setInt(index, orm[index - 1]);
			}
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void delete(String where, Object[] valores) {
		String query = "DELETE * FROM " + this.table + where;
		try {
			PreparedStatement ps = con.prepareStatement(query);
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
		ResultSet resultset = this.listaResultSet(null,null);
		try {
			if (resultset.next()) {
				resultset.last();
				id = resultset.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return id + 1;
	}

	@Override
	public List<T> listaObjetos(String where, Object[] valores) {
		ResultSet resultset = this.listaResultSet(where, valores);
		List<T> lista = new ArrayList<>();

		try {
			while (resultset.next()) {
				   lista.add(preencherORM(listaResultSet(where, valores)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return lista;
	}

	@Override
	public ResultSet listaResultSet(String query, Object[] valores) {
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
}
