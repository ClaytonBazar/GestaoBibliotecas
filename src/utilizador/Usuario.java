/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilizador;

/**
 *
 * @author Dioneria Matavele
 */
public class Usuario {

    private String usuario;
    private int telefone;
    private String login;
    private int senha;

    public Usuario( String usuario, int telefone, String login, int senha) {

        this.usuario = usuario;
        this.telefone = telefone;
        this.login = login;
        this.senha = senha;
    }



    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
}

