package br.com.uninove.iniciacaocientifica.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public abstract class ConnectionFactory {
	
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://locahost/teste";
	private static final String USUARIO = "root";
	private static final String SENHA = "root";
	private static Connection conexao;

    public static Connection getConnection() {
        try{
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
        	Class.forName(DRIVER);
            JOptionPane.showMessageDialog(null, "Banco de Dados Conectado!");
            return conexao;
        }
        catch(ClassNotFoundException Driver){
            JOptionPane.showMessageDialog(null, "Driver nao localizado: " + Driver);
            throw new RuntimeException();
        }
        catch(SQLException Fonte){
            JOptionPane.showMessageDialog(null, "Erro na conexao\n com a fonte de dados: \n" + Fonte);
            throw new RuntimeException();
        }
    }
}
