package models.DataPgn;

public class TimeControl {

    String TimeControl, txtsemTimeControl;
    int chaveiniciodoTimeControl, posicaoinicialdoTimeControl, chavefinaldoTimeControl, posicaofinaldoTimeControl;
    
    public String getTimeControl(String pgn) {
        
        TimeControl = "[TimeControl ";
        
        chaveiniciodoTimeControl = pgn.indexOf(TimeControl);

        if (chaveiniciodoTimeControl == -1) {
            TimeControl = "ND";
        } else {
            posicaoinicialdoTimeControl = chaveiniciodoTimeControl + (TimeControl.length() + 1);
            txtsemTimeControl = pgn.substring(posicaoinicialdoTimeControl);
            chavefinaldoTimeControl = txtsemTimeControl.indexOf("]");
            posicaofinaldoTimeControl = posicaoinicialdoTimeControl + chavefinaldoTimeControl - 1;
            TimeControl = pgn.substring(posicaoinicialdoTimeControl, posicaofinaldoTimeControl);

            if (TimeControl.equals("")) {                
                TimeControl = "ND";
            } else {
                TimeControl = TimeControl.replace(".", "/");
                TimeControl = TimeControl.replace("/ ", "/");
            }
        }
        return TimeControl;
    }
}
