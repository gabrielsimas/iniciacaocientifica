package DAO;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

abstract public  class Conexao {
	final private String driver = "com.mysql.jdbc.Driver";
    final private String url = "jdbc:mysql://locahost/teste";
    final private String usuario = "root";
    final private String senha = "root";
    @SuppressWarnings("unused")
	private Connection conexao;
    public Statement statement;	
    public ResultSet resultset;

    public boolean conecta()
    {
        boolean result = true;
        try
        {
            Class.forName(driver);
            conexao = (Connection) DriverManager.getConnection(url, usuario, senha);
            JOptionPane.showMessageDialog(null, "Banco de Dados Conectado!");
        }
        catch(ClassNotFoundException Driver)
        {
            JOptionPane.showMessageDialog(null, "Driver não localizado: " + Driver);
            result = false;
        }
        catch(SQLException Fonte)
        {
            JOptionPane.showMessageDialog(null, "Erro na conexão\n com a fonte de dados: \n" + Fonte);
            result = false;
        }
        return result;
    }
}
