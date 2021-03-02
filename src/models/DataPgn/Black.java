
package models.DataPgn;

public class Black {
    
    public String getBlack(String pgn){
        
       String black = "";
        
        int chaveiniciodoblack = pgn.indexOf("[Black ");

        if (chaveiniciodoblack == -1) {
            
            black = "ND";
        
        } else {

            int posicaoinicialdoblack = chaveiniciodoblack + 8;

            String txtsemblack = pgn.substring(posicaoinicialdoblack);

            int chavefinaldoblack = txtsemblack.indexOf("]");
            int posicaofinaldoblack = posicaoinicialdoblack + chavefinaldoblack - 1;

            black = pgn.substring(posicaoinicialdoblack, posicaofinaldoblack);

            if (black.equals("")) {
                
                black = "ND";
                
            } else {
                
                black = black.replace(".", "-");
                
            }

        }

        return black;
    }
    
}
