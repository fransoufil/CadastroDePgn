package model.DataPgn;

public class ECO {

    private String ECO;

    public String getECO(String pgn) {

        ECO = "[ECO ";

        if (!pgn.contains(ECO)) {
            ECO = "ND";
        } else {
            ECO = pgn.substring(pgn.indexOf(ECO) + ECO.length() + 1,
                    pgn.indexOf(ECO) + ECO.length() + 1 + pgn.substring(pgn.indexOf(ECO) + ECO.length() + 1).indexOf("]") - 1);

            if (ECO.equals("")) {
                ECO = "ND";
            } else {
                ECO = ECO.replace(".", "/");
                ECO = ECO.replace("/ ", "/");
            }
        }
        return ECO;
    }
}
