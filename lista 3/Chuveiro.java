import java.nio.channels.ReadPendingException;

public class Chuveiro{
    
    private int voltagem;
    private boolean ligado;
    private boolean chuveiroCheio;
    private String clima;

    public Chuveiro(){

    }

    public Chuveiro(int voltagem){
        this.voltagem = voltagem;
    }

    public Chuveiro(String clima){
        this.clima = clima;
    }

    public Chuveiro(boolean chuveiroCheio){
        this.chuveiroCheio = chuveiroCheio;
    }

    public Chuveiro(int voltagem, boolean ligado, boolean chuveiroCheio, String clima){
        this.voltagem = voltagem;
        this.ligado = ligado;
        this.chuveiroCheio = chuveiroCheio;
        this.clima = clima;
    }

}