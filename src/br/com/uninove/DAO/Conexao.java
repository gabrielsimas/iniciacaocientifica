package br.com.uninove.DAO;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.MySQLConnection;
import com.mysql.jdbc.PreparedStatement;

public  class Conexao {
	final private String driver = "com.mysql.jdbc.Driver";
    final private String url = "jdbc:mysql://localhost/alocacao_de_prof";
    final private String usuario = "root";
    final private String senha = "root";
	private MySQLConnection conexao;
    public ResultSet resultset;

    public Connection conecta() throws Exception
    {
        try
        {
            Class.forName(driver);
            conexao = (MySQLConnection) DriverManager.getConnection(url, usuario, senha);
//            JOptionPane.showMessageDialog(null, "Banco de Dados Conectado!");
        }
        catch(ClassNotFoundException Driver)
        {
//            JOptionPane.showMessageDialog(null, "Driver não localizado: " + Driver);
        	 throw new Exception("O drive não foi localizado");
        }
        catch(SQLException Fonte)
        {
//            JOptionPane.showMessageDialog(null, "Erro na conexão\n com a fonte de dados: \n" + Fonte);
        	throw new Exception("Erro na conexão");
        }
        return conexao;
    }
    
    
    public PreparedStatement where(PreparedStatement ps, Object[] valores) throws Exception{
    	
    	for (int i = 0; i < valores.length; i++) {
			
				ps.setObject(i+1, valores[i]);
		}
    	return ps;
    }
}
