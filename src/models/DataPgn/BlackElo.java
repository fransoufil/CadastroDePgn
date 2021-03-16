package models.DataPgn;

public class BlackElo {

    String BlackElo, txtsemBlackElo;
    int chaveiniciodoBlackElo, posicaoinicialdoBlackElo, chavefinaldoBlackElo, posicaofinaldoBlackElo;
    
    public String getBlackElo(String pgn) {
        
        BlackElo = "[BlackElo ";
        
        chaveiniciodoBlackElo = pgn.indexOf(BlackElo);

        if (chaveiniciodoBlackElo == -1) {
            BlackElo = "ND";
        } else {
            posicaoinicialdoBlackElo = chaveiniciodoBlackElo + (BlackElo.length() + 1);
            txtsemBlackElo = pgn.substring(posicaoinicialdoBlackElo);
            chavefinaldoBlackElo = txtsemBlackElo.indexOf("]");
            posicaofinaldoBlackElo = posicaoinicialdoBlackElo + chavefinaldoBlackElo - 1;
            BlackElo = pgn.substring(posicaoinicialdoBlackElo, posicaofinaldoBlackElo);

            if (BlackElo.equals("")) {                
                BlackElo = "ND";
            } else {
                BlackElo = BlackElo.replace(".", "/");
                BlackElo = BlackElo.replace("/ ", "/");
            }
        }
        return BlackElo;
    }
}
