public class Relogio {
    private int hora, minuto, segundo;

    Tempo tempoAux = new Tempo();
    Tempo tempo1 = new Tempo(hora, minuto, segundo);
    Tempo tempo2 = new Tempo(hora, minuto);
    Tempo tempo3 = new Tempo(hora);
    Tempo tempo4 = new Tempo();
    Tempo tempo5 = new Tempo(tempoAux);

}
