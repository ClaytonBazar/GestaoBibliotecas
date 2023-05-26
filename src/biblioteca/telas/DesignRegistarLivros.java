/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package biblioteca.telas;

import Livro.Livros;
import gestaodebibliotecas.BaseDeDadosLivro;
import java.awt.Graphics;
import java.io.File;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import java.sql.*;
import gestaodebibliotecas.ClasseConexao;
import javax.swing.JOptionPane;

public class DesignRegistarLivros extends javax.swing.JPanel {

    Connection conexao = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;
    BufferedImage imagemFundo;

    /**
     * Creates new form RegistarLivros
     */
    public DesignRegistarLivros() {
        initComponents();
        conexao = ClasseConexao.conector();

        try {
            this.imagemFundo = ImageIO.read(new File("C:\\Users\\Dioneria Matavele\\Pictures\\telaas\\Registar.png"));

        } catch (IOException ex) {
            Logger.getLogger(DesignLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void adicionar() {
        String sql = "insert into tbLivro(titulo, genero, anoPublicacao, autor, precoEmprestimo, quantEstoque) values(?,?,?,?,?,?)";
        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, txtTitulo.getText());
            pstm.setString(2, txtGenero.getSelectedItem().toString());
            pstm.setString(3, txtAnoPublicacao.getText());
            pstm.setString(4, txtAutor.getText());
            pstm.setString(5, txtPreco.getText());
            pstm.setString(6, txtQuantidade.getText());
             JOptionPane.showConfirmDialog(null, "Registado com Sucesso");

            pstm.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no registo");
        }
    }
    public void remover(){
         String sql = "delete from tbLivro(titulo, genero, anoPublicacao, autor, precoEmprestimo, quantEstoque) values(?,?,?,?,?,?)";
        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, txtTitulo.getText());
            pstm.setString(2, txtGenero.getSelectedItem().toString());
            pstm.setString(3, txtAnoPublicacao.getText());
            pstm.setString(4, txtAutor.getText());
            pstm.setString(5, txtPreco.getText());
            pstm.setString(6, txtQuantidade.getText());
            

            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null,"Removido com sucesso.","Sucesso",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ouve um erro na remocao.","Erro",JOptionPane.INFORMATION_MESSAGE);
        }
      
        
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(imagemFundo.getScaledInstance(550, 500, 0), 0, 0, null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        lblAnop = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();
        lblQuant = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        txtGenero = new javax.swing.JComboBox<>();
        txtTitulo = new javax.swing.JTextField();
        txtAnoPublicacao = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();

        jButton1.setBackground(new java.awt.Color(255, 145, 77));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 145, 77));
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Salvar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Titulo");

        lblGenero.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblGenero.setForeground(new java.awt.Color(255, 255, 255));
        lblGenero.setText("Genero");

        lblAnop.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblAnop.setForeground(new java.awt.Color(255, 255, 255));
        lblAnop.setText("Ano de Publicacao");

        lblAutor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblAutor.setForeground(new java.awt.Color(255, 255, 255));
        lblAutor.setText("Autor");

        lblPreco.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPreco.setForeground(new java.awt.Color(255, 255, 255));
        lblPreco.setText("Preco");

        lblQuant.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblQuant.setForeground(new java.awt.Color(255, 255, 255));
        lblQuant.setText("Quantidade");

        txtAutor.setBackground(new java.awt.Color(247, 196, 164));

        txtGenero.setBackground(new java.awt.Color(247, 196, 164));
        txtGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Romance", "Accao e Aventura", "Terror", "Biografia" }));

        txtTitulo.setBackground(new java.awt.Color(247, 196, 164));

        txtAnoPublicacao.setBackground(new java.awt.Color(247, 196, 164));

        txtPreco.setBackground(new java.awt.Color(247, 196, 164));

        txtQuantidade.setBackground(new java.awt.Color(247, 196, 164));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAutor)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGenero)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAnoPublicacao)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAnop)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblQuant)
                                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPreco))
                                .addGap(0, 7, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(214, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnop)
                    .addComponent(lblTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnoPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGenero, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPreco, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addComponent(lblAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lblQuant)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1))))
                .addGap(55, 55, 55))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        adicionar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new MenuAdmin().setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lblAnop;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblQuant;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtAnoPublicacao;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JComboBox<String> txtGenero;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}