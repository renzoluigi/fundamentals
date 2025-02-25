package Exercicios;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Time {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        LocalDate dataEspecifica = LocalDate.of(2006,10,22);

        data.isBefore(dataEspecifica); //false
        data.isAfter(dataEspecifica);//true
        data.isEqual(dataEspecifica); //false

        data.getDayOfMonth(); //dia do mes
        data.getDayOfWeek(); //dia da semana
        data.getDayOfYear(); //dia do ano

        data.plusDays(14); //adiciona dias

        LocalTime hora = LocalTime.now();
        LocalTime horaEspecifica = LocalTime.of(16,44);

        LocalDateTime horaData = LocalDateTime.now();
        LocalDateTime horaDataEspecifica = LocalDateTime.of(2004,1,24,16,44,32);

        ZonedDateTime dataHoraLocal = ZonedDateTime.now();
        ZonedDateTime dataHoralLocalEspecifica = ZonedDateTime.of(2025, 1, 26, 14, 30, 0, 0, ZoneId.of("America/Sao_Paulo"));

        Instant agora = Instant.now();

        LocalDateTime datetime = LocalDateTime.of(2007, 12, 3, 10, 15, 30);
        LocalDateTime parsed = LocalDateTime.parse("2007-12-03T10:15:30"); //Formata uma string e transforma em data

        datetime.isEqual(parsed); //true

        DateTimeFormatter analisador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse("22/10/2006",analisador);

        DateTimeFormatter printer = DateTimeFormatter.ofPattern("MMMM d, yyyy"); //criacao de um printer para formatar a data que tem o formato de analisador
        printer.format(date); //Outubro 22, 2006
    }
}
