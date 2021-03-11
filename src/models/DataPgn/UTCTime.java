package models.DataPgn;

public class UTCTime {

    public String getUTCTime(String pgn) {

        String utctime;
        
        int chaveiniciodoutctime = pgn.indexOf("[UTCTime ");

        if (chaveiniciodoutctime == -1) {
            
            utctime = "ND";
        
        } else {

            int posicaoinicialdoutctime = chaveiniciodoutctime + 10;

            String txtsemutctime = pgn.substring(posicaoinicialdoutctime);

            int chavefinaldoutctime = txtsemutctime.indexOf("]");
            int posicaofinaldoutctime = posicaoinicialdoutctime + chavefinaldoutctime - 1;

            utctime = pgn.substring(posicaoinicialdoutctime, posicaofinaldoutctime);

            if (utctime.equals("")) {
                
                utctime = "ND";
                
            } else {
                
                utctime = utctime.replace(".", "/");
                utctime = utctime.replace("/ ", "/");
                
            }

        }

        return utctime;
    }
}
