package model.DataPgn;

public class SequenciaInicial {

    String inicioabertura = "1. ", finalabertura = "7.";
    int posicaoinicialdaabertura, posicaofinaldaabertura;

    public String getSequenciainicial(String pgn) {

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
        return pgn.substring(posicaoinicialdaabertura, posicaofinaldaabertura).replace("  ", " ");
    }

}
