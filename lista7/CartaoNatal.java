public class CartaoNatal extends CartaoWeb {
    
    //Construtores
    public CartaoNatal(String destinatario){
        setDestinatario(destinatario);
    }

    public String retornarMensagem(String remetente){
        String mensagem1 = "Feliz natal, ";
        String mensagem2 = ".\nBoas festas, alegria e properidade,\n";
        return mensagem1.concat(getDestinatario().concat(mensagem2).concat(remetente));
    }

    public void setDestinatario(String destinatario){
        this.destinatario = destinatario;
    }

    public String getDestinatario(){
        return this.destinatario;
    }

    
}
