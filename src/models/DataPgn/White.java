
package models.DataPgn;

public class White {
    
   String White, txtsemWhite;
    int chaveiniciodoWhite, posicaoinicialdoWhite, chavefinaldoWhite, posicaofinaldoWhite;
    
    public String getWhite(String pgn) {
        
        White = "[White ";
        
        chaveiniciodoWhite = pgn.indexOf(White);

        if (chaveiniciodoWhite == -1) {
            White = "ND";
        } else {
            posicaoinicialdoWhite = chaveiniciodoWhite + (White.length() + 1);
            txtsemWhite = pgn.substring(posicaoinicialdoWhite);
            chavefinaldoWhite = txtsemWhite.indexOf("]");
            posicaofinaldoWhite = posicaoinicialdoWhite + chavefinaldoWhite - 1;
            White = pgn.substring(posicaoinicialdoWhite, posicaofinaldoWhite);

            if (White.equals("")) {                
                White = "ND";
            } else {
                White = White.replace(".", "/");
                White = White.replace("/ ", "/");
            }
        }
        return White;
    }
    
}
