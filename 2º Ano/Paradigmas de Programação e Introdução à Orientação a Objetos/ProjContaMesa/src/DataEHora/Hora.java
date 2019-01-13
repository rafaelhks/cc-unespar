package DataEHora;
import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;
/**
 *
 * @author rafael
 */
public class Hora {
    
    public static String FormataHora(){
        Calendar c = Calendar.getInstance();
        Date data = c.getTime();
        DateFormat hora = DateFormat.getTimeInstance();
        String HoraFormatada = hora.format(data);
        return HoraFormatada;
    }
}
