package models.DataPgn;

public class Variant {

    String Variant;

    public String getVariant(String pgn) {

        Variant = "[Variant ";

        if (!pgn.contains(Variant)) {
            Variant = "ND";
        } else {
            Variant = pgn.substring(pgn.indexOf(Variant) + Variant.length() + 1,
                    pgn.indexOf(Variant) + Variant.length() + 1 + pgn.substring(pgn.indexOf(Variant) + Variant.length() + 1).indexOf("]") - 1);

            if (Variant.equals("")) {
                Variant = "ND";
            } else {
                Variant = Variant.replace(".", "/");
                Variant = Variant.replace("/ ", "/");
            }
        }
        return Variant;
    }
}
