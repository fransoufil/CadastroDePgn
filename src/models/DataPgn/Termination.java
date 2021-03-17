package models.DataPgn;

public class Termination {

    String Termination;

    public String getTermination(String pgn) {

        Termination = "[Termination ";

        if (!pgn.contains(Termination)) {
            Termination = "ND";
        } else {
            Termination = pgn.substring(pgn.indexOf(Termination) + Termination.length() + 1,
                    pgn.indexOf(Termination) + Termination.length() + 1 + pgn.substring(pgn.indexOf(Termination) + Termination.length() + 1).indexOf("]") - 1);

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
