package models.DataPgn;

public class Event {

    public String getEvent(String pgn) {

        String event;
        int chaveiniciodoevent = pgn.indexOf("[Event ");

        if (chaveiniciodoevent == -1) {
            
            event = "ND";
        
        } else {

            int posicaoinicialdoevent = chaveiniciodoevent + 8;

            String txtsemevent = pgn.substring(posicaoinicialdoevent);

            int chavefinaldoevent = txtsemevent.indexOf("]");
            int posicaofinaldoevent = posicaoinicialdoevent + chavefinaldoevent - 1;

            event = pgn.substring(posicaoinicialdoevent, posicaofinaldoevent);

            if (event.equals("")) {
                
                event = "ND";
                
            } else {
                
                event = event.replace(".", "/");
                event = event.replace("/ ", "/");
                
            }

        }

        return event;
    }
}
