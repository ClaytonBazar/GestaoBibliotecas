
package utilizador;

public class Cliente {
    
    private String nome;
    private int idade;
    private String endereco;
    private int telefone;
    private String email;
    
    public Cliente(){
        
    }

    public Cliente(String nome, int idade, String endereco, int contacto, String email) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = contacto;
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

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
