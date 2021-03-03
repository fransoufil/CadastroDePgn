package models.DataPgn;

public class Site {

    public String getSite(String pgn) {

        String site;
        int chaveiniciodosite = pgn.indexOf("[Site ");

        if (chaveiniciodosite == -1) {
            
            site = "ND";
        
        } else {

            int posicaoinicialdosite = chaveiniciodosite + 8;

            String txtsemsite = pgn.substring(posicaoinicialdosite);

            int chavefinaldosite = txtsemsite.indexOf("]");
            int posicaofinaldosite = posicaoinicialdosite + chavefinaldosite - 1;

            site = pgn.substring(posicaoinicialdosite, posicaofinaldosite);

            if (site.equals("")) {
                
                site = "ND";
                
            } else {
                
                site = site.replace(".", "/");
                site = site.replace("/ ", "/");
                
            }

        }

        return site;
    }
}
