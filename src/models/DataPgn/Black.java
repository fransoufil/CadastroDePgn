
package models.DataPgn;

public class Black {
    
    String Black, txtsemBlack;
    int chaveiniciodoBlack, posicaoinicialdoBlack, chavefinaldoBlack, posicaofinaldoBlack;
    
    public String getBlack(String pgn) {
        
        Black = "[Black ";
        
        chaveiniciodoBlack = pgn.indexOf(Black);

        if (chaveiniciodoBlack == -1) {
            Black = "ND";
        } else {
            posicaoinicialdoBlack = chaveiniciodoBlack + (Black.length() + 1);
            txtsemBlack = pgn.substring(posicaoinicialdoBlack);
            chavefinaldoBlack = txtsemBlack.indexOf("]");
            posicaofinaldoBlack = posicaoinicialdoBlack + chavefinaldoBlack - 1;
            Black = pgn.substring(posicaoinicialdoBlack, posicaofinaldoBlack);

            if (Black.equals("")) {                
                Black = "ND";
            } else {
                Black = Black.replace(".", "/");
                Black = Black.replace("/ ", "/");
            }
        }
        return Black;
    }
    
}
