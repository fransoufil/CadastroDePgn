
package models.DataPgn;

public class White {
    
    public String getWhite(String pgn){
        
        String white = "";
        
        int chaveiniciodowhite = pgn.indexOf("[White ");

        if (chaveiniciodowhite == -1) {
            
            white = "ND";
        
        } else {

            int posicaoinicialdowhite = chaveiniciodowhite + 8;

            String txtsemwhite = pgn.substring(posicaoinicialdowhite);

            int chavefinaldowhite = txtsemwhite.indexOf("]");
            int posicaofinaldowhite = posicaoinicialdowhite + chavefinaldowhite - 1;

            white = pgn.substring(posicaoinicialdowhite, posicaofinaldowhite);

            if (white.equals("")) {
                
                white = "ND";
                
            } else {
                
                white = white.replace(".", "-");
                
            }

        }

        return white;
    }
    
}
