public class CadastroClientes {
    
    DadosPessoais pessoa;

    public CadastroClientes(){
        pessoa = new DadosPessoais();
    }

    public void cadastrarEmail(String nome, String email){
        if(email.indexOf("@") > 2 && email.indexOf(".") != -1){
            this.pessoa.setDadosPessoais(nome, email);
        }else{
            System.out.println("Modelo de email invalido..");
        }
    }

    

}
