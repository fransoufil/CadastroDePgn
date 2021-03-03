package models.DataPgn;

public class Round {

    public String getRound(String pgn) {

        String round;
        int chaveiniciodoround = pgn.indexOf("[Round ");

        if (chaveiniciodoround == -1) {
            
            round = "ND";
        
        } else {

            int posicaoinicialdoround = chaveiniciodoround + 8;

            String txtsemround = pgn.substring(posicaoinicialdoround);

            int chavefinaldoround = txtsemround.indexOf("]");
            int posicaofinaldoround = posicaoinicialdoround + chavefinaldoround - 1;

            round = pgn.substring(posicaoinicialdoround, posicaofinaldoround);

            if (round.equals("")) {
                
                round = "ND";
                
            } else {
                
                round = round.replace(".", "/");
                round = round.replace("/ ", "/");
                
            }

        }

        return round;
    }
}
