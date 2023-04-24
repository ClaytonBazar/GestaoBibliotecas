/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaodebibliotecas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dell
 */
public class ClasseConexao {
       public  Connection createDB(){
       Connection conn = null;
       try{
           System.out.println("Criando conexao...");
           String url = "jdbc:mysql://localhost:3306/projecto?user=root&password=<3/clay70N";
           conn=DriverManager.getConnection(url);
           System.out.println("Conexao criada");
           
       }catch(SQLException erro){
           System.out.println("Problema na ClasseConexao"+erro.getMessage());
       }
       return conn;
   } 
   
}
