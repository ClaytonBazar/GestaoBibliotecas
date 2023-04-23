
package biblioteca.utilizadores;

public class Cliente {
    
    private String nome;
    private int idade;
    private String endereco;
    private int contacto;
    private String email;
    
    public Cliente(){
        
    }

    public Cliente(String nome, int idade, String endereco, int contacto, String email) {
        this.nome = nome;
        this.idade = idade;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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
