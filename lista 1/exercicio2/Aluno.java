
public class Aluno implements Comparable{

    private String nome;
    private double nota;

    public Aluno(String nome, Double nota) {
        this.setNome(nome);
        this.setNota(nota);
    }

    public Aluno(){
        
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Object o){
        Aluno x = (Aluno) o;
        if(this.nota > x.nota){
            return 1;
        }else{
            if(this.nota < x.nota){
                return -1;
            }else{
                return 0;
            }
        }
    }

}
