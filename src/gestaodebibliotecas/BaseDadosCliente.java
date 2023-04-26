/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaodebibliotecas;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import utilizador.Cliente;

/**
 *
 * @author Dell
 */
public class BaseDadosCliente {
     Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    
    ArrayList<Cliente> list = new ArrayList<>();
// cadastrar clientes na base de dados    
    public void cadastrarCliente(Cliente c) {
        conn = new ClasseConexao().createDB();
        String sql = "INSERT INTO dbclientes (nome,idade,endereco,email,telefone) VALUES(?,?,?,?,?)";
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, c.getNome());
            pstm.setInt(2, c.getIdade());
            pstm.setString(3, c.getEndereco());
            pstm.setString(4, c.getEmail());
            pstm.setInt(5, c.getTelefone());

           
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            System.out.println("Erro aconteceu na classe BaseDadosCliente metodo cadastrarCliente " + erro.getMessage());
        }

    }
//listar os clientes
    public ArrayList<Cliente> ListarClientes() {
        conn = new ClasseConexao().createDB();
        String sql = "select * from dbclientes sort by nome";

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Cliente c1 = new Cliente();
                c1.setNome(rs.getString("nome"));
                c1.setIdade(rs.getInt("idade"));
                c1.setEndereco(rs.getString("endereco"));
                c1.setEmail(rs.getString("email"));
                c1.setTelefone(rs.getInt("telefone"));


                list.add(c1);

            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "BaseDadosCliente no metodo listar " + erro.getMessage());
        }
        return list;

    }
// pesquisar atraves do nome
    public Cliente PesquisarCliente(String nome) {
        conn = new ClasseConexao().createDB();
        try {
            String sql = "SELECT * FROM dbclientes WHERE nome = ?";
            Cliente c2 = new Cliente();
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,nome);
            rs = pstm.executeQuery();

            rs.first();
            c2.setNome("nome");
            c2.setIdade(rs.getInt("idade"));
            c2.setEndereco(rs.getString("Endereco"));
            c2.setEmail(rs.getString("email"));
            c2.setTelefone(rs.getInt("telefone"));

            
            return c2;

        } catch (Exception erro) {
            return null;
        }

    }
//deletar cliente da base de dados
    public void deleteLivros(Cliente nome) {
        conn = new ClasseConexao().createDB();
        try {
            String sql = "DELETE * FROM dbclientes WHERE nome = ?";
            Cliente c = new Cliente();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, "titulo");
            rs = pstm.executeQuery();

            pstm.setString(1, c.getNome());
            pstm.setInt(2, c.getIdade());
            pstm.setString(3, c.getEndereco());
            pstm.setString(4, c.getEmail());
            pstm.setInt(5, c.getTelefone());


            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar" + erro);

        }
    }
}
