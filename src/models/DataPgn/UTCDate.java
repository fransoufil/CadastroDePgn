package models.DataPgn;

public class UTCDate {

    String UTCDate, txtsemUTCDate;
    int chaveiniciodoUTCDate, posicaoinicialdoUTCDate, chavefinaldoUTCDate, posicaofinaldoUTCDate;
    
    public String getUTCDate(String pgn) {
        
        UTCDate = "[UTCDate ";
        
        chaveiniciodoUTCDate = pgn.indexOf(UTCDate);

        if (chaveiniciodoUTCDate == -1) {
            UTCDate = "ND";
        } else {
            posicaoinicialdoUTCDate = chaveiniciodoUTCDate + (UTCDate.length() + 1);
            txtsemUTCDate = pgn.substring(posicaoinicialdoUTCDate);
            chavefinaldoUTCDate = txtsemUTCDate.indexOf("]");
            posicaofinaldoUTCDate = posicaoinicialdoUTCDate + chavefinaldoUTCDate - 1;
            UTCDate = pgn.substring(posicaoinicialdoUTCDate, posicaofinaldoUTCDate);

            if (UTCDate.equals("")) {                
                UTCDate = "ND";
            } else {
                UTCDate = UTCDate.replace(".", "/");
                UTCDate = UTCDate.replace("/ ", "/");
            }
        }
        return UTCDate;
    }
}
