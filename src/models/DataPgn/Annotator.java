package models.DataPgn;

public class Annotator {

    public String getAnnotator(String pgn) {

        String annotator;
        int chaveiniciodoannotator = pgn.indexOf("[Annotator ");

        if (chaveiniciodoannotator == -1) {
            
            annotator = "ND";
        
        } else {

            int posicaoinicialdoannotator = chaveiniciodoannotator + 12;

            String txtsemannotator = pgn.substring(posicaoinicialdoannotator);

            int chavefinaldoannotator = txtsemannotator.indexOf("]");
            int posicaofinaldoannotator = posicaoinicialdoannotator + chavefinaldoannotator - 1;

            annotator = pgn.substring(posicaoinicialdoannotator, posicaofinaldoannotator);

            if (annotator.equals("")) {
                
                annotator = "ND";
                
            } else {
                
                annotator = annotator.replace(".", "/");
                annotator = annotator.replace("/ ", "/");
                
            }

        }

        return annotator;
    }
}
