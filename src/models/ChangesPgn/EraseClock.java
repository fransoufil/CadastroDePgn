package models.ChangesPgn;

public class EraseClock {

    public String eraseClock(String pgn) {

        String eraseclock = "";

        String beginclock = " { [%clk";
        String endclock = "] } ";

        int intBeginclock = pgn.indexOf(beginclock);
        int intEndclock = pgn.indexOf(endclock);

        while ((intBeginclock > 0) || intEndclock > 0) {

            intBeginclock = pgn.indexOf(beginclock);
            intEndclock = pgn.indexOf(endclock);

            String iniciopgnsemclock = pgn.substring(0, intBeginclock);
            String finalpgnsemclock = pgn.substring(intEndclock + 3);

            eraseclock = iniciopgnsemclock + finalpgnsemclock;

            pgn = eraseclock;

            intBeginclock = pgn.indexOf(beginclock);
            intEndclock = pgn.indexOf(endclock);

        }
        return eraseclock;
    }

}
