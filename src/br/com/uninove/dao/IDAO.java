package br.com.uninove.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public interface IDAO<T> {
	void insert(T orm);
	void update(T orm);
	void delete(String where, T[] valores);
	
	List<T> listaObjetos(String where, Object[] valores);
	
	ResultSet listaResultSet(String query, Object[] valores);
	
	T preencherORM(ResultSet resultSet) throws Exception;
	
	void preencherParametros(T orm, PreparedStatement ps);
	
	void preencherParametros(int[] orm, PreparedStatement ps);
}
