package models.DataPgn;

public class Termination {

    String Termination, txtsemTermination;
    int chaveiniciodoTermination, posicaoinicialdoTermination, chavefinaldoTermination, posicaofinaldoTermination;
    
    public String getTermination(String pgn) {
        
        Termination = "[Termination ";
        
        chaveiniciodoTermination = pgn.indexOf(Termination);

        if (chaveiniciodoTermination == -1) {
            Termination = "ND";
        } else {
            posicaoinicialdoTermination = chaveiniciodoTermination + (Termination.length() + 1);
            txtsemTermination = pgn.substring(posicaoinicialdoTermination);
            chavefinaldoTermination = txtsemTermination.indexOf("]");
            posicaofinaldoTermination = posicaoinicialdoTermination + chavefinaldoTermination - 1;
            Termination = pgn.substring(posicaoinicialdoTermination, posicaofinaldoTermination);

            if (Termination.equals("")) {                
                Termination = "ND";
            } else {
                Termination = Termination.replace(".", "/");
                Termination = Termination.replace("/ ", "/");
            }
        }
        return Termination;
    }
}
