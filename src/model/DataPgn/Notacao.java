package model.DataPgn;

public class Notacao {
    
    private String strInicial;
    
    public String getNotacao(String pgn) {
        
        strInicial  = "1. ";
        return pgn.substring(pgn.indexOf(strInicial), pgn.length()).replace("  ", " ");
    }
    
}
