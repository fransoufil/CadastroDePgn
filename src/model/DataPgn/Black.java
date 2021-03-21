package model.DataPgn;

public class Black {
    
    String Black;

    public String getBlack(String pgn) {

        Black = "[Black ";

        if (!pgn.contains(Black)) {
            Black = "ND";
        } else {
            Black = pgn.substring(pgn.indexOf(Black) + Black.length() + 1,
                    pgn.indexOf(Black) + Black.length() + 1 + pgn.substring(pgn.indexOf(Black) + Black.length() + 1).indexOf("]") - 1);

            if (Black.equals("")) {
                Black = "ND";
            } else {
                Black = Black.replace(".", "/");
                Black = Black.replace("/ ", "/");
            }
        }
        return Black;
    }
    
}
