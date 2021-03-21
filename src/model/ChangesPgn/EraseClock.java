package model.ChangesPgn;

public class EraseClock {

    String eraseclock;

        String beginclock = " { [%clk", endclock = "] } ", iniciopgnsemclock, finalpgnsemclock;
        int intBeginclock, intEndclock;
    
    public String eraseClock(String pgn) {
        
        intBeginclock = pgn.indexOf(beginclock);
        intEndclock = pgn.indexOf(endclock);
        
        while ((intBeginclock > 0) || intEndclock > 0) {

            intBeginclock = pgn.indexOf(beginclock);
            intEndclock = pgn.indexOf(endclock);

            iniciopgnsemclock = pgn.substring(0, intBeginclock);
            finalpgnsemclock = pgn.substring(intEndclock + 3);

            pgn = iniciopgnsemclock + finalpgnsemclock;

            intBeginclock = pgn.indexOf(beginclock);
            intEndclock = pgn.indexOf(endclock);

        }
        
        return pgn;
        
    }

}
