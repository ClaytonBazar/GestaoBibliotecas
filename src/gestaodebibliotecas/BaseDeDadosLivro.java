/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaodebibliotecas;

import Livro.Livros;
import java.sql.Connection;
import java.sql.Date;
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
public class BaseDeDadosLivro {
     Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Livros> lista = new ArrayList<>();
    ArrayList<Cliente> list = new ArrayList<>();
//cadastrar livros   
    public void cadastrarLivros(Livros l) {
        conn = new ClasseConexao().createDB();
        String sql = "INSERT INTO livro(tituto,autor,genero,PrecoEmprestimo,QuantEstoque,anoLancamento,dataEntrega) VALUES(?,?,?,?,?,?,?)";
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, l.getTitulo());
            pstm.setString(2, l.getAutor());
            pstm.setString(3, l.getGenero());
            pstm.setDouble(4, l.getPrecoEmprestimo());
            pstm.setInt(5, l.getQuantEstoque());
            pstm.setInt(6, l.getAnoPublicacao());
            pstm.setDate(7, (Date) l.getDataEntrega());
           
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            System.out.println("Erro aconteceu na classe PacienteBaseDados metodo cadastrardados " + erro.getMessage());
        }

    }
//listar livros organizados pelo genero
    public ArrayList<Livros> ListarLivros() {
        conn = new ClasseConexao().createDB();
        String sql = "select * from livro sort by genero";

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Livros l4 = new Livros();
                l4.setTitulo(rs.getString("titulo"));
                l4.setAutor(rs.getString("autor"));
                l4.setGenero(rs.getString("genero"));
                l4.setPrecoEmprestimo(rs.getDouble("precoEmprestimo"));
                l4.setQuantEstoque(rs.getInt("quantEstoque"));
                l4.setAnoPublicacao(rs.getInt("anoPublicacao"));
                l4.setDataEntrega(rs.getDate("dataEntrega"));

                lista.add(l4);

            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "BaseDados no metodo listar " + erro.getMessage());
        }
        return lista;

    }

// deletar livros
    public void deleteLivros(Livros bi) {
        conn = new ClasseConexao().createDB();
        try {
            String sql = "DELETE * FROM livro WHERE titulo = ?";
            Livros p = new Livros();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, "titulo");
            rs = pstm.executeQuery();

            pstm.setString(1, p.getTitulo());
            pstm.setString(2, p.getAutor());
            pstm.setString(3, p.getGenero());
            pstm.setDouble(4, p.getPrecoEmprestimo());
            pstm.setInt(5, p.getQuantEstoque());
            pstm.setInt(6, p.getAnoPublicacao());
            pstm.setDate(7,(Date) p.getDataEntrega());

            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar" + erro);

        }

    }
//Listar Livros Disponiveis
    public ArrayList<Livros> ListarLivrosDis() {
        conn = new ClasseConexao().createDB();
        String sql = "select * from livro Where disponibilidade = sim";

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Livros l1 = new Livros();
                l1.setTitulo(rs.getString("titulo"));
                l1.setAutor(rs.getString("autor"));
                l1.setGenero(rs.getString("genero"));
                l1.setPrecoEmprestimo(rs.getDouble("precoEmprestimo"));
                l1.setQuantEstoque(rs.getInt("quantEstoque"));
                l1.setAnoPublicacao(rs.getInt("anoLancamento"));
                l1.setDataEntrega(rs.getDate("dataEntrega"));

                lista.add(l1);

            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PacienteBaseDados no metodo pesquisarDados " + erro.getMessage());
        }
        return lista;

    }
    
// Filtros de pesquisa de dados
    
    // pesquisar livros com titulo
    public Livros PesquisarLivrosT(String titulo) {
        conn = new ClasseConexao().createDB();
        try {
            String sql = "SELECT * FROM livro WHERE titulo = ?";
            Livros l = new Livros();
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, titulo);
            rs = pstm.executeQuery();

            rs.first();
            l.setTitulo("titulo");
            l.setAutor(rs.getString("autor"));
            l.setGenero(rs.getString("genero"));
            l.setPrecoEmprestimo(rs.getDouble("precoEmpresto"));
            l.setAnoPublicacao(rs.getInt("anoPublicacao"));
            l.setQuantEstoque(rs.getInt("quantEstoque"));
            l.setDataEntrega(rs.getDate("dataEntrega"));
            
            return l;

        } catch (Exception erro) {
            return null;
        }

    }
    
    // pesquisar livros com autor
    public Livros PesquisarLivrosA(String autor) {
        conn = new ClasseConexao().createDB();
        try {
            String sql = "SELECT * FROM livro WHERE autor = ?";
            Livros l = new Livros();
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, autor);
            rs = pstm.executeQuery();

            rs.first();
            l.setTitulo("titulo");
            l.setAutor(rs.getString("autor"));
            l.setGenero(rs.getString("genero"));
            l.setPrecoEmprestimo(rs.getDouble("precoEmpresto"));
            l.setAnoPublicacao(rs.getInt("anoPublicacao"));
            l.setQuantEstoque(rs.getInt("quantEstoque"));
            l.setDataEntrega(rs.getDate("dataEntrega"));
            
            return l;

        } catch (Exception erro) {
            return null;
        }

    }
    
    // pesquisar livros com genero
    public Livros PesquisarLivrosG(String genero) {
        conn = new ClasseConexao().createDB();
        try {
            String sql = "SELECT * FROM livro WHERE genero = ?";
            Livros l = new Livros();
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, genero);
            rs = pstm.executeQuery();

            rs.first();
            l.setTitulo("titulo");
            l.setAutor(rs.getString("autor"));
            l.setGenero(rs.getString("genero"));
            l.setPrecoEmprestimo(rs.getDouble("precoEmpresto"));
            l.setAnoPublicacao(rs.getInt("anoPublicacao"));
            l.setQuantEstoque(rs.getInt("quantEstoque"));
            l.setDataEntrega(rs.getDate("dataEntrega"));
            
            return l;

        } catch (Exception erro) {
            return null;
        }

    }
    
    // pesquisar livros com ano
    public Livros PesquisarLivrosA(int ano) {
        conn = new ClasseConexao().createDB();
        try {
            String sql = "SELECT * FROM livro WHERE ano = ?";
            Livros l = new Livros();
            
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, ano);
            rs = pstm.executeQuery();

            rs.first();
            l.setTitulo("titulo");
            l.setAutor(rs.getString("autor"));
            l.setGenero(rs.getString("genero"));
            l.setPrecoEmprestimo(rs.getDouble("precoEmpresto"));
            l.setAnoPublicacao(rs.getInt("anoPublicacao"));
            l.setQuantEstoque(rs.getInt("quantEstoque"));
            l.setDataEntrega(rs.getDate("dataEntrega"));
            
            return l;

        } catch (Exception erro) {
            return null;
        }

    }
}
