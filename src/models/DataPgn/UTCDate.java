package models.DataPgn;

public class UTCDate {

    public String getUTCDate(String pgn) {

        String utcdate;
        
        int chaveiniciodoutcdate = pgn.indexOf("[UTCDate ");

        if (chaveiniciodoutcdate == -1) {
            
            utcdate = "ND";
        
        } else {

            int posicaoinicialdoutcdate = chaveiniciodoutcdate + 10;

            String txtsemutcdate = pgn.substring(posicaoinicialdoutcdate);

            int chavefinaldoutcdate = txtsemutcdate.indexOf("]");
            int posicaofinaldoutcdate = posicaoinicialdoutcdate + chavefinaldoutcdate - 1;

            utcdate = pgn.substring(posicaoinicialdoutcdate, posicaofinaldoutcdate);

            if (utcdate.equals("")) {
                
                utcdate = "ND";
                
            } else {
                
                utcdate = utcdate.replace(".", "/");
                utcdate = utcdate.replace("/ ", "/");
                
            }

        }

        return utcdate;
    }
}
