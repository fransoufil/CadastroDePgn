package models.DataPgn;

public class BlackElo {

    public String getBlackElo(String pgn) {

        String blackelo;
        
        int chaveiniciodoblackelo = pgn.indexOf("[BlackElo ");

        if (chaveiniciodoblackelo == -1) {
            
            blackelo = "ND";
        
        } else {

            int posicaoinicialdoblackelo = chaveiniciodoblackelo + 11;

            String txtsemblackelo = pgn.substring(posicaoinicialdoblackelo);

            int chavefinaldoblackelo = txtsemblackelo.indexOf("]");
            int posicaofinaldoblackelo = posicaoinicialdoblackelo + chavefinaldoblackelo - 1;

            blackelo = pgn.substring(posicaoinicialdoblackelo, posicaofinaldoblackelo);

            if (blackelo.equals("")) {
                
                blackelo = "ND";
                
            } else {
                
                blackelo = blackelo.replace(".", "/");
                blackelo = blackelo.replace("/ ", "/");
                
            }

        }

        return blackelo;
    }
}
