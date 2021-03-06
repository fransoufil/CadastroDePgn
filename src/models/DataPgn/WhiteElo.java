package models.DataPgn;

public class WhiteElo {

    public String getWhiteElo(String pgn) {

        String whiteelo;
        
        int chaveiniciodowhiteelo = pgn.indexOf("[Termination ");

        if (chaveiniciodowhiteelo == -1) {
            
            whiteelo = "ND";
        
        } else {

            int posicaoinicialdowhiteelo = chaveiniciodowhiteelo + 11;

            String txtsemwhiteelo = pgn.substring(posicaoinicialdowhiteelo);

            int chavefinaldowhiteelo = txtsemwhiteelo.indexOf("]");
            int posicaofinaldowhiteelo = posicaoinicialdowhiteelo + chavefinaldowhiteelo - 1;

            whiteelo = pgn.substring(posicaoinicialdowhiteelo, posicaofinaldowhiteelo);

            if (whiteelo.equals("")) {
                
                whiteelo = "ND";
                
            } else {
                
                whiteelo = whiteelo.replace(".", "/");
                whiteelo = whiteelo.replace("/ ", "/");
                
            }

        }

        return whiteelo;
    }
}
