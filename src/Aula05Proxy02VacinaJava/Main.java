package Aula05Proxy02VacinaJava;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // Data e hora de agendamento
        int year = 2021;
        int month = 10;
        int day = 21;

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);

        Date date = calendar.getTime();


        // Agendamento e registro da vacina
        Pessoa pessoa = new Pessoa("Gaspar", "Sousa", "999999999-99", "Coronavac", date);

        IRegistro registro = new RegistroVacinaProxy();
        registro.registrar(pessoa.dados());
    }
}
