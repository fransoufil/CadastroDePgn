package models.DataPgn;

public class Opening {

    String Opening, txtsemOpening;
    int chaveiniciodoOpening, posicaoinicialdoOpening, chavefinaldoOpening, posicaofinaldoOpening;
    
    public String getOpening(String pgn) {
        
        Opening = "[Opening ";
        
        chaveiniciodoOpening = pgn.indexOf(Opening);

        if (chaveiniciodoOpening == -1) {
            Opening = "ND";
        } else {
            posicaoinicialdoOpening = chaveiniciodoOpening + (Opening.length() + 1);
            txtsemOpening = pgn.substring(posicaoinicialdoOpening);
            chavefinaldoOpening = txtsemOpening.indexOf("]");
            posicaofinaldoOpening = posicaoinicialdoOpening + chavefinaldoOpening - 1;
            Opening = pgn.substring(posicaoinicialdoOpening, posicaofinaldoOpening);

            if (Opening.equals("")) {                
                Opening = "ND";
            } else {
                Opening = Opening.replace(".", "/");
                Opening = Opening.replace("/ ", "/");
            }
        }
        return Opening;
    }
}
