package models.DataPgn;

public class TimeControl {

    public String getTimeControl(String pgn) {

        String timecontrol;
        
        int chaveiniciodotimecontrol = pgn.indexOf("[TimeControl ");

        if (chaveiniciodotimecontrol == -1) {
            
            timecontrol = "ND";
        
        } else {

            int posicaoinicialdotimecontrol = chaveiniciodotimecontrol + 14;

            String txtsemtimecontrol = pgn.substring(posicaoinicialdotimecontrol);

            int chavefinaldotimecontrol = txtsemtimecontrol.indexOf("]");
            int posicaofinaldotimecontrol = posicaoinicialdotimecontrol + chavefinaldotimecontrol - 1;

            timecontrol = pgn.substring(posicaoinicialdotimecontrol, posicaofinaldotimecontrol);

            if (timecontrol.equals("")) {
                
                timecontrol = "ND";
                
            } else {
                
                timecontrol = timecontrol.replace(".", "/");
                timecontrol = timecontrol.replace("/ ", "/");
                
            }

        }

        return timecontrol;
    }
}
