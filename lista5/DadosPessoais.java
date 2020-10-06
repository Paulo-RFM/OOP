//2)Crie e implemente em Java uma classe que contenha três métodos sobrecarregados

public class DadosPessoais {
    
     private String nome, endereco, bairro, cidade, email;

    public void setDadosPessoais(String nome, String endereco, String bairro, String cidade){
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setBairro(bairro);
        this.setCidade(cidade);
    }

    public void setDadosPessoais(String nome, String endereco, String bairro){
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setBairro(bairro);
    }

    public void setDadosPessoais(String nome, String email){
        this.setNome(nome);
        this.setEmail(email);
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

}
