package models.DataPgn;

public class Site {

    String Site, txtsemSite;
    int chaveiniciodoSite, posicaoinicialdoSite, chavefinaldoSite, posicaofinaldoSite;
    
    public String getSite(String pgn) {
        
        Site = "[Site ";
        
        chaveiniciodoSite = pgn.indexOf(Site);

        if (chaveiniciodoSite == -1) {
            Site = "ND";
        } else {
            posicaoinicialdoSite = chaveiniciodoSite + (Site.length() + 1);
            txtsemSite = pgn.substring(posicaoinicialdoSite);
            chavefinaldoSite = txtsemSite.indexOf("]");
            posicaofinaldoSite = posicaoinicialdoSite + chavefinaldoSite - 1;
            Site = pgn.substring(posicaoinicialdoSite, posicaofinaldoSite);

            if (Site.equals("")) {                
                Site = "ND";
            } else {
                Site = Site.replace(".", "/");
                Site = Site.replace("/ ", "/");
            }
        }
        return Site;
    }
}
