package model.DataPgn;

public class Date {

   String Date;

    public String getDate(String pgn) {

        Date = "[Date ";

        if (!pgn.contains(Date)) {
            Date = "ND";
        } else {
            Date = pgn.substring(pgn.indexOf(Date) + Date.length() + 1,
                    pgn.indexOf(Date) + Date.length() + 1 + pgn.substring(pgn.indexOf(Date) + Date.length() + 1).indexOf("]") - 1);

            if (Date.equals("")) {
                Date = "ND";
            } else {
                Date = Date.replace(".", "/");
                Date = Date.replace("/ ", "/");
            }
        }
        return Date;
    }
}
