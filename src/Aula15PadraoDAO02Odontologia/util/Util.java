package Aula15PadraoDAO02Odontologia.util;

import java.sql.Date;
import java.sql.Timestamp;

public class Util {

    public static Timestamp dateToTimestamp(Date date) {
        Timestamp timestamp = new Timestamp((date.getTime()));
        return timestamp;
    }



}
