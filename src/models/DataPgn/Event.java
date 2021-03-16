package models.DataPgn;

public class Event {

    String Event, txtsemEvent;
    int chaveiniciodoEvent, posicaoinicialdoEvent, chavefinaldoEvent, posicaofinaldoEvent;
    
    public String getEvent(String pgn) {
        
        Event = "[Event ";
        
        chaveiniciodoEvent = pgn.indexOf(Event);

        if (chaveiniciodoEvent == -1) {
            Event = "ND";
        } else {
            posicaoinicialdoEvent = chaveiniciodoEvent + (Event.length() + 1);
            txtsemEvent = pgn.substring(posicaoinicialdoEvent);
            chavefinaldoEvent = txtsemEvent.indexOf("]");
            posicaofinaldoEvent = posicaoinicialdoEvent + chavefinaldoEvent - 1;
            Event = pgn.substring(posicaoinicialdoEvent, posicaofinaldoEvent);

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
