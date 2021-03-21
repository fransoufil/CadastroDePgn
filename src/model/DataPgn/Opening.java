package model.DataPgn;

public class Opening {

    String Opening;

    public String getOpening(String pgn) {

        Opening = "[Opening ";

        if (!pgn.contains(Opening)) {
            Opening = "ND";
        } else {
            Opening = pgn.substring(pgn.indexOf(Opening) + Opening.length() + 1,
                    pgn.indexOf(Opening) + Opening.length() + 1 + pgn.substring(pgn.indexOf(Opening) + Opening.length() + 1).indexOf("]") - 1);

            if (Opening.equals("")) {
                Opening = "ND";
            } else {
                Opening = Opening.replace(".", "/");
                Opening = Opening.replace("/ ", "/");
                Opening = Opening.replace("'", "");
            }
        }
        return Opening;
    }
}
