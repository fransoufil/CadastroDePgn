package models.DataPgn;

public class Termination {

    public String getTermination(String pgn) {

        String termination;
        
        int chaveiniciodotermination = pgn.indexOf("[Termination ");

        if (chaveiniciodotermination == -1) {
            
            termination = "ND";
        
        } else {

            int posicaoinicialdotermination = chaveiniciodotermination + 14;

            String txtsemtermination = pgn.substring(posicaoinicialdotermination);

            int chavefinaldotermination = txtsemtermination.indexOf("]");
            int posicaofinaldotermination = posicaoinicialdotermination + chavefinaldotermination - 1;

            termination = pgn.substring(posicaoinicialdotermination, posicaofinaldotermination);

            if (termination.equals("")) {
                
                termination = "ND";
                
            } else {
                
                termination = termination.replace(".", "/");
                termination = termination.replace("/ ", "/");
                
            }

        }

        return termination;
    }
}
