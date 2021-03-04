package models.DataPgn;

public class Date {

    public String getDate(String pgn) {

        String date;
        
        pgn = pgn.replace(".??", "/??");
        pgn = pgn.replace("??", "2");
        
        int chaveiniciododate = pgn.indexOf("[Date ");

        if (chaveiniciododate == -1) {
            
            date = "ND";
        
        } else {

            int posicaoinicialdodate = chaveiniciododate + 8;

            String txtsemdate = pgn.substring(posicaoinicialdodate);

            int chavefinaldodate = txtsemdate.indexOf("]");
            int posicaofinaldodate = posicaoinicialdodate + chavefinaldodate - 1;

            date = pgn.substring(posicaoinicialdodate, posicaofinaldodate);

            if (date.equals("")) {
                
                date = "ND";
                
            } else {
                
                date = date.replace(".", "/");
                date = date.replace("/ ", "/");
                
            }

        }

        return date;
    }
}
