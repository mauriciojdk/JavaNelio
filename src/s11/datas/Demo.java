package s11.datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo {
    public static void main(String[] args) {
        //DEMONSTRAÇÃO

        //Criando formatação
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        //Instanciando tempo no momento de execução
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        //Convertendo texto ISO-8601 em objeto
        LocalDate d04 = LocalDate.parse("2017-05-20");
        LocalDateTime d05 = LocalDateTime.parse("2017-05-20T02:45:26");
        Instant d06 = Instant.parse("2017-05-20T02:45:26Z");

        LocalDate d07 = LocalDate.parse("20/07/2022", fmt1);
        LocalDateTime d08 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

        //Instanciando passando data separada
        LocalDate d09 = LocalDate.of(2022, 12, 19);
        LocalDateTime d10 = LocalDateTime.of(2022, 12, 19, 1,0);

    }
}
