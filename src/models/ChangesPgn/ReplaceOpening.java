package models.ChangesPgn;

public class ReplaceOpening {

    String cutpgn = "", opening;
    int beginopening, endopening;

    public String replaceOpening(String sequenciainicial) {

        beginopening = sequenciainicial.indexOf(" { ");
        endopening = sequenciainicial.indexOf(" } ");

        if ((endopening == -1) || (beginopening == -1)) {

            cutpgn = sequenciainicial;

        } else {

            opening = sequenciainicial.substring(beginopening + 1, endopening + 2);
            cutpgn = sequenciainicial.replace(opening, "");
            //+ "\n\n" + opening;

        }

        return cutpgn;
    }

}
