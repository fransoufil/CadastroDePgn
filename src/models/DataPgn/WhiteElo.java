package models.DataPgn;

public class WhiteElo {

    String WhiteElo, txtsemWhiteElo;
    int chaveiniciodoWhiteElo, posicaoinicialdoWhiteElo, chavefinaldoWhiteElo, posicaofinaldoWhiteElo;
    
    public String getWhiteElo(String pgn) {
        
        WhiteElo = "[WhiteElo ";
        
        chaveiniciodoWhiteElo = pgn.indexOf(WhiteElo);

        if (chaveiniciodoWhiteElo == -1) {
            WhiteElo = "ND";
        } else {
            posicaoinicialdoWhiteElo = chaveiniciodoWhiteElo + (WhiteElo.length() + 1);
            txtsemWhiteElo = pgn.substring(posicaoinicialdoWhiteElo);
            chavefinaldoWhiteElo = txtsemWhiteElo.indexOf("]");
            posicaofinaldoWhiteElo = posicaoinicialdoWhiteElo + chavefinaldoWhiteElo - 1;
            WhiteElo = pgn.substring(posicaoinicialdoWhiteElo, posicaofinaldoWhiteElo);

            if (WhiteElo.equals("")) {                
                WhiteElo = "ND";
            } else {
                WhiteElo = WhiteElo.replace(".", "/");
                WhiteElo = WhiteElo.replace("/ ", "/");
            }
        }
        return WhiteElo;
    }
}
