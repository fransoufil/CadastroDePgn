package models.DadosPgn;

public class Abertura {

    String abertura(String sequenciainicial) {

        String sequenciadeabertura = "";

        sequenciadeabertura = sequenciainicial.substring(0, 6);

        return sequenciadeabertura;
    }
}
