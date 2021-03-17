package models.DataPgn;

public class UTCDate {

    String UTCDate;

    public String getUTCDate(String pgn) {

        UTCDate = "[UTCDate ";

        if (!pgn.contains(UTCDate)) {
            UTCDate = "ND";
        } else {
            UTCDate = pgn.substring(pgn.indexOf(UTCDate) + UTCDate.length() + 1,
                    pgn.indexOf(UTCDate) + UTCDate.length() + 1 + pgn.substring(pgn.indexOf(UTCDate) + UTCDate.length() + 1).indexOf("]") - 1);

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
