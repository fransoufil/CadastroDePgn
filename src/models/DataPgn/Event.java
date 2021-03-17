package models.DataPgn;

public class Event {

    String Event;

    public String getEvent(String pgn) {

        Event = "[Event ";

        if (!pgn.contains(Event)) {
            Event = "ND";
        } else {
            Event = pgn.substring(pgn.indexOf(Event) + Event.length() + 1,
                    pgn.indexOf(Event) + Event.length() + 1 + pgn.substring(pgn.indexOf(Event) + Event.length() + 1).indexOf("]") - 1);

            if (Event.equals("")) {
                Event = "ND";
            } else {
                Event = Event.replace(".", "/");
                Event = Event.replace("/ ", "/");
            }
        }
        return Event;
    }
}
