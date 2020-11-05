public class CartaoDiaDosNamorados extends CartaoWeb{
    
    public CartaoDiaDosNamorados(String destinatario){
        this.setDestinatario(destinatario);
    }
    public String retornarMensagem(String remetente){
        String mensagem1 = "Querida ";
        String mensagem2 = ",\nFeliz dias dos Namorados!\nEspero que esse tenha sido o único cartão do dia dos namorados que tenha ganhado nessa data!\nDe todo meu coração, ";
        return mensagem1.concat(destinatario).concat(mensagem2).concat(remetente);
    }

    public String getDestinatario(){
        return this.destinatario;
    }

    public void setDestinatario(String destinatario){
        this.destinatario = destinatario;
    }
}
