package s11.datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Text {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-22T01:30:26Z");

        DateTimeFormatter fmt1  = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2  = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3  = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        /*System.out.println("d04 = " + d04.format(fmt1));
        System.out.println("d04 = " + fmt1.format(d04));

        System.out.println("d05 = " + d05.format(fmt2));
        System.out.println("d06 = " + fmt3.format(d06));*/

        //Mostrar listas de fuso-horarios customizados
        /*for (String s : ZoneId.getAvailableZoneIds()){
            System.out.println(s);
        }*/

        //Convertendo data global em local
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        //Pegando dia, mês e ano das datas locais
        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mês = " + d04.getMonth());
        System.out.println("d04 ano = " + d04.getYear());

    }
}
