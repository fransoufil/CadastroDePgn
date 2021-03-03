package models.DataPgn;

public class Result {

    public String getResult(String pgn) {

        String result;
        int chaveiniciodoresult = pgn.indexOf("[Result ");

        if (chaveiniciodoresult == -1) {
            
            result = "ND";
        
        } else {

            int posicaoinicialdoresult = chaveiniciodoresult + 9;

            String txtsemresult = pgn.substring(posicaoinicialdoresult);

            int chavefinaldoresult = txtsemresult.indexOf("]");
            int posicaofinaldoresult = posicaoinicialdoresult + chavefinaldoresult - 1;

            result = pgn.substring(posicaoinicialdoresult, posicaofinaldoresult);

            if (result.equals("")) {
                
                result = "ND";
                
            } else {
                
                result = result.replace(".", "/");
                result = result.replace("/ ", "/");
                
            }

        }

        return result;
    }
}
