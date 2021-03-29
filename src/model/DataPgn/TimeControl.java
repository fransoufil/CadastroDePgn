package model.DataPgn;

public class TimeControl {

    private String TimeControl;

    public String getTimeControl(String pgn) {

        TimeControl = "[TimeControl ";

        if (!pgn.contains(TimeControl)) {
            TimeControl = "ND";
        } else {
            TimeControl = pgn.substring(pgn.indexOf(TimeControl) + TimeControl.length() + 1,
                    pgn.indexOf(TimeControl) + TimeControl.length() + 1 + pgn.substring(pgn.indexOf(TimeControl) + TimeControl.length() + 1).indexOf("]") - 1);

            if (TimeControl.equals("")) {
                TimeControl = "ND";
            } else {
                TimeControl = TimeControl.replace(".", "/");
                TimeControl = TimeControl.replace("/ ", "/");
            }
        }
        return TimeControl;
    }
}
