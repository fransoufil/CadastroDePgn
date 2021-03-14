package models.DataPgn;

public class Opening {

    public String getOpening(String pgn) {

        String opening;
        
        int chaveiniciodoopening = pgn.indexOf("[Opening ");

        if (chaveiniciodoopening == -1) {
            
            opening = "ND";
        
        } else {

            int posicaoinicialdoopening = chaveiniciodoopening + 7;

            String txtsemopening = pgn.substring(posicaoinicialdoopening);

            int chavefinaldoopening = txtsemopening.indexOf("]");
            int posicaofinaldoopening = posicaoinicialdoopening + chavefinaldoopening - 1;

            opening = pgn.substring(posicaoinicialdoopening, posicaofinaldoopening);

            if (opening.equals("")) {
                
                opening = "ND";
                
            } else {
                
                opening = opening.replace(".", "/");
                opening = opening.replace("/ ", "/");
                
            }

        }

        return opening;
    }
}
