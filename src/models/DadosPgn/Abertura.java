package models.DadosPgn;

public class Abertura {

    public String getAbertura(String sequenciainicial) {

        String sequenciadeabertura = "";

        sequenciadeabertura = sequenciainicial.substring(0, 6);

        return sequenciadeabertura;
    }
}
