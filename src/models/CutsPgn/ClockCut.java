
package models.CutsPgn;

public class ClockCut {
    
    public String clockCut(String pgn) {
        
        String cutpgn = "";
        
        String stringiniciodoclock = " { [%clk";
        String stringfinaldoclock = "] } ";
        
        int iniciodoclock = pgn.indexOf(stringiniciodoclock);
        int finaldoclock = pgn.indexOf(stringfinaldoclock);

        while ((iniciodoclock > 0) || finaldoclock > 0) {

            iniciodoclock = pgn.indexOf(stringiniciodoclock);
            finaldoclock = pgn.indexOf(stringfinaldoclock);

            String iniciopgnsemclock = pgn.substring(0, iniciodoclock);
            String finalpgnsemclock = pgn.substring(finaldoclock + 3);

            cutpgn = iniciopgnsemclock + finalpgnsemclock;

            pgn = cutpgn;

            iniciodoclock = pgn.indexOf(stringiniciodoclock);
            finaldoclock = pgn.indexOf(stringfinaldoclock);
            
        }
        
        return cutpgn;
    }
    
}
