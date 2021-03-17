package models.DataPgn;

public class Round {

    String Round;

    public String getRound(String pgn) {

        Round = "[Round ";

        if (!pgn.contains(Round)) {
            Round = "ND";
        } else {
            Round = pgn.substring(pgn.indexOf(Round) + Round.length() + 1,
                    pgn.indexOf(Round) + Round.length() + 1 + pgn.substring(pgn.indexOf(Round) + Round.length() + 1).indexOf("]") - 1);

            if (Round.equals("")) {
                Round = "ND";
            } else {
                Round = Round.replace(".", "/");
                Round = Round.replace("/ ", "/");
            }
        }
        return Round;
    }
}
