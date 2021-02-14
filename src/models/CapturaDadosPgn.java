package models;

public class CapturaDadosPgn {

    String sequenciaInicial(String pgn, String cordaspecas) {

        String inicioabertura = "1. ";
        String finalabertura = "7.";
        String sequenciainicial = "1.";

        int posicaoinicialdaabertura;
        int posicaofinaldaabertura;

        posicaoinicialdaabertura = pgn.indexOf(inicioabertura);
        posicaofinaldaabertura = pgn.indexOf(finalabertura);
        
        if (posicaoinicialdaabertura > posicaofinaldaabertura) {
            finalabertura = "6.";
            posicaofinaldaabertura = pgn.indexOf(finalabertura);
        }
        
        if (posicaoinicialdaabertura > posicaofinaldaabertura) {
            finalabertura = "5.";
            posicaofinaldaabertura = pgn.indexOf(finalabertura);
        }
        
        if (posicaoinicialdaabertura > posicaofinaldaabertura) {
            finalabertura = "4.";
            posicaofinaldaabertura = pgn.indexOf(finalabertura);
        }
        
        if (posicaoinicialdaabertura > posicaofinaldaabertura) {
            finalabertura = "3.";
            posicaofinaldaabertura = pgn.indexOf(finalabertura);
        }
        
        if (posicaoinicialdaabertura > posicaofinaldaabertura) {
            finalabertura = "2.";
            posicaofinaldaabertura = pgn.indexOf(finalabertura);
        }
        
        sequenciainicial = pgn.substring(posicaoinicialdaabertura, posicaofinaldaabertura).replace("  ", " ");

        return sequenciainicial;
    }

}
