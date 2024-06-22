
package businessRules;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;



public class DataFormatador {
    final private static SimpleDateFormat  formatador = new SimpleDateFormat("dd/mm/yyyy");
    
    public static Date datas(String dataString){
        try {
            return DataFormatador.formatador.parse(dataString);
        } catch (ParseException ex) {
            Logger.getLogger(DataFormatador.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
}
