package model.DataPgn;

public class Site {

    private String Site;

    public String getSite(String pgn) {

        Site = "[Site ";

        if (!pgn.contains(Site)) {
            Site = "ND";
        } else {
            Site = pgn.substring(pgn.indexOf(Site) + Site.length() + 1,
                    pgn.indexOf(Site) + Site.length() + 1 + pgn.substring(pgn.indexOf(Site) + Site.length() + 1).indexOf("]") - 1);

            if (Site.equals("")) {
                Site = "ND";
            } 
        }
        return Site;
    }
}
