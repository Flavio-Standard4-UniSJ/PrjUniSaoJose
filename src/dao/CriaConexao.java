package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CriaConexao {
    public static Connection getConexao()throws SQLException{
        try{
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection("jdbc:postgresql:aplicacao_imc", "postgres", "aulatads");
        }catch(ClassNotFoundException e){
            throw new SQLException(e.getMessage());
        }
    }
}
