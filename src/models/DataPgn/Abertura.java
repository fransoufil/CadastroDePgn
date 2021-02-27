package models.DataPgn;

public class Abertura {

    public String getAbertura(String sequenciainicial) {

        String sequenciadeabertura;

        sequenciadeabertura = sequenciainicial.substring(0, 9);

        return sequenciadeabertura;
       
    }
}
