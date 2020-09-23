public class Data {
   private int dia, ano;
   private String mes;

    public Data(int dia, String mes, int ano) {
        this.dia = dia;
        this.ano = ano;
        this.mes = mes;
    }

    public Data(){

    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

}
