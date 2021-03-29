package model.DataPgn;

public class Annotator {
    
    private String Annotator;
    
    public String getAnnotator(String pgn) {
        
        Annotator = "[Annotator ";

        if (!pgn.contains(Annotator)) {
            Annotator = "ND";
        } else {
            Annotator = pgn.substring(pgn.indexOf(Annotator) + Annotator.length() + 1, 
                    pgn.indexOf(Annotator) + Annotator.length() + 1 + pgn.substring(pgn.indexOf(Annotator) + Annotator.length() + 1).indexOf("]") - 1);

            if (Annotator.equals("")) {                
                Annotator = "ND";
            }
        }
        return Annotator;
    }
    
    //ABOVE THE OLD ONE CODE - THE SAME THAT ARE IN THE OTHERS CLASS
    
//    public String getAnnotator(String pgn) {
//        
//        Annotator = "[Annotator ";
//        
//        chaveiniciodoAnnotator = pgn.indexOf(Annotator);
//
//        if (chaveiniciodoAnnotator == -1) {
//            Annotator = "ND";
//        } else {
//            posicaoinicialdoAnnotator = chaveiniciodoAnnotator + (Annotator.length() + 1);
//            txtsemAnnotator = pgn.substring(posicaoinicialdoAnnotator);
//            chavefinaldoAnnotator = txtsemAnnotator.indexOf("]");
//            posicaofinaldoAnnotator = posicaoinicialdoAnnotator + chavefinaldoAnnotator - 1;
//            Annotator = pgn.substring(posicaoinicialdoAnnotator, posicaofinaldoAnnotator);
//
//            if (Annotator.equals("")) {                
//                Annotator = "ND";
//            } else {
//                Annotator = Annotator.replace(".", "/");
//                Annotator = Annotator.replace("/ ", "/");
//            }
//        }
//        return Annotator;
//    }
}
