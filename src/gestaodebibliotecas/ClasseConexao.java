/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaodebibliotecas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;


public class ClasseConexao {

    // mettodo reaponsavel para estabelecer a conexao com o banco de dados 
    public static Connection conector() {
        Connection conexao = null;
        // A linha abaixo chama o driver
        String driver = "com.mysql.jdbc.Driver";
        // Armazenando informacoes referentes ao banco de dados
        String url = "jdbc:mysql://localhost:3306/databasePetitis";
        String user = "root";
        String password = "Pettis3";
        // Estabelecendo a conexao com o banco de dados
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            
            return null;
        }
    }

}

