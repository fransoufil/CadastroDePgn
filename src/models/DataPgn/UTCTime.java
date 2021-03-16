package models.DataPgn;

public class UTCTime {

    String UTCTime, txtsemUTCTime;
    int chaveiniciodoUTCTime, posicaoinicialdoUTCTime, chavefinaldoUTCTime, posicaofinaldoUTCTime;
    
    public String getUTCTime(String pgn) {
        
        UTCTime = "[UTCTime ";
        
        chaveiniciodoUTCTime = pgn.indexOf(UTCTime);

        if (chaveiniciodoUTCTime == -1) {
            UTCTime = "ND";
        } else {
            posicaoinicialdoUTCTime = chaveiniciodoUTCTime + (UTCTime.length() + 1);
            txtsemUTCTime = pgn.substring(posicaoinicialdoUTCTime);
            chavefinaldoUTCTime = txtsemUTCTime.indexOf("]");
            posicaofinaldoUTCTime = posicaoinicialdoUTCTime + chavefinaldoUTCTime - 1;
            UTCTime = pgn.substring(posicaoinicialdoUTCTime, posicaofinaldoUTCTime);

            if (UTCTime.equals("")) {                
                UTCTime = "ND";
            } else {
                UTCTime = UTCTime.replace(".", "/");
                UTCTime = UTCTime.replace("/ ", "/");
            }
        }
        return UTCTime;
    }
}
