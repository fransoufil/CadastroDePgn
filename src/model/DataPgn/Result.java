package model.DataPgn;

public class Result {

    private String Result;

    public String getResult(String pgn) {

        Result = "[Result ";

        if (!pgn.contains(Result)) {
            Result = "ND";
        } else {
            Result = pgn.substring(pgn.indexOf(Result) + Result.length() + 1,
                    pgn.indexOf(Result) + Result.length() + 1 + pgn.substring(pgn.indexOf(Result) + Result.length() + 1).indexOf("]") - 1);

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
