package model.DataPgn;

public class BlackElo {

    private String BlackElo;

    public String getBlackElo(String pgn) {

        BlackElo = "[BlackElo ";

        if (!pgn.contains(BlackElo)) {
            BlackElo = "ND";
        } else {
            BlackElo = pgn.substring(pgn.indexOf(BlackElo) + BlackElo.length() + 1,
                    pgn.indexOf(BlackElo) + BlackElo.length() + 1 + pgn.substring(pgn.indexOf(BlackElo) + BlackElo.length() + 1).indexOf("]") - 1);

            if (BlackElo.equals("")) {
                BlackElo = "ND";
            } else {
                BlackElo = BlackElo.replace(".", "/");
                BlackElo = BlackElo.replace("/ ", "/");
            }
        }
        return BlackElo;
    }
}
