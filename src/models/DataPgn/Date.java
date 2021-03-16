package models.DataPgn;

public class Date {

    String Date, txtsemDate;
    int chaveiniciodoDate, posicaoinicialdoDate, chavefinaldoDate, posicaofinaldoDate;
    
    public String getDate(String pgn) {
        
        Date = "[Date ";
        
        chaveiniciodoDate = pgn.indexOf(Date);

        if (chaveiniciodoDate == -1) {
            Date = "ND";
        } else {
            posicaoinicialdoDate = chaveiniciodoDate + (Date.length() + 1);
            txtsemDate = pgn.substring(posicaoinicialdoDate);
            chavefinaldoDate = txtsemDate.indexOf("]");
            posicaofinaldoDate = posicaoinicialdoDate + chavefinaldoDate - 1;
            Date = pgn.substring(posicaoinicialdoDate, posicaofinaldoDate);

            if (Date.equals("")) {                
                Date = "ND";
            } else {
                Date = Date.replace(".", "/");
                Date = Date.replace("/ ", "/");
            }
        }
        return Date;
    }
}
