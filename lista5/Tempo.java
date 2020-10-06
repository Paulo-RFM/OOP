public class Tempo{

   private int hora, minuto, segundo;
    
   //Construtores
    public Tempo(int hora, int minuto, int segundo){
        this.setHora(hora);
        this.setMinuto(minuto);
        this.setSegundo(segundo);
    }

    public Tempo(){
        
    }

    public Tempo(int hora){
        this.setHora(hora);
    }

    public Tempo(int hora, int minuto){
        this.setHora(hora);
        this.setMinuto(minuto);
    }


    public Tempo(Tempo tempo){
        this.setHora(tempo.hora);
        this.setMinuto(tempo.minuto);
        this.setSegundo(tempo.segundo);   
    }


    //Metodos get 
    public int getHora(){
        return this.hora;
    }

    public int getMinuto(){
        return this.minuto;
    }
    
    public int getSegundo(){
        return this.segundo;
    }


    //Metodos Set
    public void setHora(int hora){
       if(hora >=0 && hora <= 24){
           this.hora = hora;
       }
    }

    public void setMinuto(int minuto){
        if(minuto >=0 && minuto <= 60){
            this.minuto = minuto;
        }
    }
   
    public void setSegundo(int segundo){
        if(segundo >= 0 && segundo <= 60){
            this.segundo = segundo;
        }
    }


      @Override
      public String toString() {
          return String.format("Hora: %s:%s:%s", this.getHora(), this.getMinuto(), this.getSegundo());
      }
    
}