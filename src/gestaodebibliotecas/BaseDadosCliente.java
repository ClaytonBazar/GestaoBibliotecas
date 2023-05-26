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
import utilizador.Usuario;


public class BaseDadosCliente {

    Connection conexao;
    PreparedStatement pstm;
    ResultSet rs;

    ArrayList<Cliente> list = new ArrayList<>();
// cadastrar clientes na base de dados    

    public void cadastrarCliente(Cliente c) {
        conexao = new ClasseConexao().conector();
        String sql = "INSERT INTO tbclientes (nomecli, enderecocli,telefonecli ,emailcli, idadecli,senhacli) VALUES(?,?,?,?,?)";
        try {
            pstm = conexao.prepareStatement(sql);
            
            pstm.setString(1, c.getNome());           
            pstm.setString(2, c.getEndereco());
            pstm.setString(3, c.getEmail());
            pstm.setInt(4, c.getTelefone());
            pstm.setInt(5, c.getIdade());
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            System.out.println("Erro aconteceu na classe BaseDadosCliente metodo cadastrarCliente " + erro.getMessage());
        }

    }
    
  // cadastrar clientes na base de dados    

    public void cadastrarUsuario(Usuario u) {
        conexao = new ClasseConexao().conector();
        String sql = "INSERT INTO tbusuarios (usuario, telefone,login,senha) VALUES(?,?,?,?)";
        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, u.getUsuario());
            pstm.setInt(2, u.getTelefone());
            pstm.setString(3, u.getLogin());
            pstm.setInt(4, u.getSenha());

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            System.out.println("Erro aconteceu na classe BaseDadosCliente metodo cadastrarCliente " + erro.getMessage());
        }
    }  
    
    
//listar os clientes

    public ArrayList<Cliente> ListarClientes() {
        conexao = new ClasseConexao().conector();
        String sql = "select * from tbclientes";

        try {
            pstm = conexao.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Cliente c1 = new Cliente();
                c1.setNome(rs.getString("nomecli"));
                c1.setEndereco(rs.getString("enderecocli"));
                c1.setEmail(rs.getString("emailcli"));
                c1.setTelefone(rs.getInt("telefonecli"));
                c1.setIdade(rs.getInt("idadecli"));
                list.add(c1);

            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "BaseDadosCliente no metodo listar " + erro.getMessage());
        }
        return list;

    }
// pesquisar atraves do nome

    public Cliente PesquisarCliente(String nome) {
        conexao = new ClasseConexao().conector();
        try {
            String sql = "SELECT * FROM dbclientes WHERE nome = ?";
            Cliente c2 = new Cliente();

            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, nome);
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
        conexao = new ClasseConexao().conector();
        try {
            String sql = "DELETE * FROM dbclientes WHERE nome = ?";
            Cliente c = new Cliente();
            pstm = conexao.prepareStatement(sql);
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

