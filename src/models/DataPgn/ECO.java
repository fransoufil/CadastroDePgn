package models.DataPgn;

public class ECO {

    String ECO, txtsemECO;
    int chaveiniciodoECO, posicaoinicialdoECO, chavefinaldoECO, posicaofinaldoECO;
    
    public String getECO(String pgn) {
        
        ECO = "[ECO ";
        
        chaveiniciodoECO = pgn.indexOf(ECO);

        if (chaveiniciodoECO == -1) {
            ECO = "ND";
        } else {
            posicaoinicialdoECO = chaveiniciodoECO + (ECO.length() + 1);
            txtsemECO = pgn.substring(posicaoinicialdoECO);
            chavefinaldoECO = txtsemECO.indexOf("]");
            posicaofinaldoECO = posicaoinicialdoECO + chavefinaldoECO - 1;
            ECO = pgn.substring(posicaoinicialdoECO, posicaofinaldoECO);

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
