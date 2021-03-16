package models.DataPgn;

public class Result {

    String Result, txtsemResult;
    int chaveiniciodoResult, posicaoinicialdoResult, chavefinaldoResult, posicaofinaldoResult;
    
    public String getResult(String pgn) {
        
        Result = "[Result ";
        
        chaveiniciodoResult = pgn.indexOf(Result);

        if (chaveiniciodoResult == -1) {
            Result = "ND";
        } else {
            posicaoinicialdoResult = chaveiniciodoResult + (Result.length() + 1);
            txtsemResult = pgn.substring(posicaoinicialdoResult);
            chavefinaldoResult = txtsemResult.indexOf("]");
            posicaofinaldoResult = posicaoinicialdoResult + chavefinaldoResult - 1;
            Result = pgn.substring(posicaoinicialdoResult, posicaofinaldoResult);

            if (Result.equals("")) {                
                Result = "ND";
            } else {
                Result = Result.replace(".", "/");
                Result = Result.replace("/ ", "/");
            }
        }
        return Result;
    }
}
