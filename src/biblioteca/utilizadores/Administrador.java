/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.utilizadores;

public class Administrador {

    private String nomeAdmin;
    private String senhaAdmin;

    public Administrador() {

    }

    public Administrador(String nomeAdmin, String senhaAdmin) {
        this.nomeAdmin = nomeAdmin;
        this.senhaAdmin = senhaAdmin;
    }

    public String getNomeAdmin() {
        return nomeAdmin;
    }

    public void setNomeAdmin(String nomeAdmin) {
        this.nomeAdmin = nomeAdmin;
    }

    public String getSenhaAdmin() {
        return senhaAdmin;
    }

    public void setSenhaAdmin(String senhaAdmin) {
        this.senhaAdmin = senhaAdmin;
    }

}
