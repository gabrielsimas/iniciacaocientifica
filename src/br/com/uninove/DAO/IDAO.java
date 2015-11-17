package br.com.uninove.DAO;

import java.sql.ResultSet;

import com.mysql.jdbc.PreparedStatement;

public interface IDAO {
	public void insert(Object orm);
	public void update(Object orm);
	public void delete(String where, Object[] valores);
	
	public java.util.List<Object> listaObjetos(String where, Object[] valores);
	
	public ResultSet listaResultSet(String query, Object[] valores);
	
	public Object preencherORM(Object orm) throws Exception;
	
	public void preencherParametros(Object orm, PreparedStatement ps);
}
