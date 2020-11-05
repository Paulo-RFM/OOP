public class CartaoAniversario extends CartaoWeb {

    //construtores
    public CartaoAniversario(String destinatario){
        this.setDestinatario(destinatario);
    }

    //metodos
    public String retornarMensagem(String remetente){
        String mensagem1 = "Parabéns!!!\nFeliz aniversário, ";
        String mensagem2 = ". Com muito carinho, \n";
        return mensagem1.concat(getDestinatario()).concat(mensagem2).concat(remetente);
    }

    public void setDestinatario(String destinatario){
        this.destinatario = destinatario;
    }

    public String getDestinatario(){
        return this.destinatario;
    }

}
