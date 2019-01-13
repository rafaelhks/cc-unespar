package DataEHora;
import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;
/**
 *
 * @author rafael
 */
public class Data {
    
    private static Calendar c = Calendar.getInstance();
    private static Date data = c.getTime();
    private static DateFormat df;
    
    public static String FormataData() {
        
        df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        String DataFormatada = df.format(data);
        return DataFormatada;
    }
    
    public static String FormataDataExtenso() {
        df = DateFormat.getDateInstance(DateFormat.FULL);
        String DataFormatada = df.format(data);
        return DataFormatada;
    }
}
