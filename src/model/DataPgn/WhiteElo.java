package model.DataPgn;

public class WhiteElo {

    String WhiteElo;

    public String getWhiteElo(String pgn) {

        WhiteElo = "[WhiteElo ";

        if (!pgn.contains(WhiteElo)) {
            WhiteElo = "ND";
        } else {
            WhiteElo = pgn.substring(pgn.indexOf(WhiteElo) + WhiteElo.length() + 1,
                    pgn.indexOf(WhiteElo) + WhiteElo.length() + 1 + pgn.substring(pgn.indexOf(WhiteElo) + WhiteElo.length() + 1).indexOf("]") - 1);

            if (WhiteElo.equals("")) {
                WhiteElo = "ND";
            } else {
                WhiteElo = WhiteElo.replace(".", "/");
                WhiteElo = WhiteElo.replace("/ ", "/");
            }
        }
        return WhiteElo;
    }
}
