package model.DataPgn;

public class UTCTime {

    String UTCTime;

    public String getUTCTime(String pgn) {

        UTCTime = "[UTCTime ";

        if (!pgn.contains(UTCTime)) {
            UTCTime = "ND";
        } else {
            UTCTime = pgn.substring(pgn.indexOf(UTCTime) + UTCTime.length() + 1,
                    pgn.indexOf(UTCTime) + UTCTime.length() + 1 + pgn.substring(pgn.indexOf(UTCTime) + UTCTime.length() + 1).indexOf("]") - 1);

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
