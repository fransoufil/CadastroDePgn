
package models.ChangesPgn;

public class ReplaceOpening {
    
    public String replaceOpening (String sequenciainicial) {
        
        String cutpgn = "";
        String opening;
        
        int beginopening = sequenciainicial.indexOf(" { ");
        int endopening = sequenciainicial.indexOf(" } ");
        
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
