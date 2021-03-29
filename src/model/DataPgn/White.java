package model.DataPgn;

public class White {

    private String White;

    public String getWhite(String pgn) {

        White = "[White ";

        if (!pgn.contains(White)) {
            White = "ND";
        } else {
            White = pgn.substring(pgn.indexOf(White) + White.length() + 1,
                    pgn.indexOf(White) + White.length() + 1 + pgn.substring(pgn.indexOf(White) + White.length() + 1).indexOf("]") - 1);

            if (White.equals("")) {
                White = "ND";
            } else {
                White = White.replace(".", "/");
                White = White.replace("/ ", "/");
            }
        }
        return White;
    }

}
