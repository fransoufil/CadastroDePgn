package models.DataPgn;

public class Round {

    String Round, txtsemRound;
    int chaveiniciodoRound, posicaoinicialdoRound, chavefinaldoRound, posicaofinaldoRound;
    
    public String getRound(String pgn) {
        
        Round = "[Round ";
        
        chaveiniciodoRound = pgn.indexOf(Round);

        if (chaveiniciodoRound == -1) {
            Round = "ND";
        } else {
            posicaoinicialdoRound = chaveiniciodoRound + (Round.length() + 1);
            txtsemRound = pgn.substring(posicaoinicialdoRound);
            chavefinaldoRound = txtsemRound.indexOf("]");
            posicaofinaldoRound = posicaoinicialdoRound + chavefinaldoRound - 1;
            Round = pgn.substring(posicaoinicialdoRound, posicaofinaldoRound);

            if (Round.equals("")) {                
                Round = "ND";
            } else {
                Round = Round.replace(".", "/");
                Round = Round.replace("/ ", "/");
            }
        }
        return Round;
    }
}
