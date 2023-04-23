
package biblioteca.utilizadores;

public class Instituicao {
    
    private String nome;
    private String endereco;
    private int contacto;
    private String email;
    
    public Instituicao(){
        
    }

    public Instituicao(String nome, String endereco, int contacto, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.contacto = contacto;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
