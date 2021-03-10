package models.DataPgn;

public class ECO {

    public String getEco(String pgn) {

        String eco;
        int chaveiniciodoeco = pgn.indexOf("[ECO ");

        if (chaveiniciodoeco == -1) {
            
            eco = "ND";
        
        } else {

            int posicaoinicialdoeco = chaveiniciodoeco + 6;

            String txtsemeco = pgn.substring(posicaoinicialdoeco);

            int chavefinaldoeco = txtsemeco.indexOf("]");
            int posicaofinaldoeco = posicaoinicialdoeco + chavefinaldoeco - 1;

            eco = pgn.substring(posicaoinicialdoeco, posicaofinaldoeco);

            if (eco.equals("")) {
                
                eco = "ND";
                
            } else {
                
                eco = eco.replace(".", "/");
                eco = eco.replace("/ ", "/");
                
            }

        }

        return eco;
    }
}
