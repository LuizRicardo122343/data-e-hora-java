import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class teste {
    public static void main(String[] args) {
        // Obtém a hora atual no fuso horário do Brasil
        ZonedDateTime horaBrasil = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));

        // Formata a hora no formato desejado
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Formata e exibe a hora atual no fuso horário do Brasil
        String horaFormatada = horaBrasil.format(formato);
        System.out.println("Hora atual no Brasil: " + horaFormatada);
        
        
        
        // Obtém a data atual no fuso horário do Brasil
        LocalDate dataBrasil = LocalDate.now(ZoneId.of("America/Sao_Paulo"));

        // Formata a data no formato1 desejado
        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Formata e exibe a data atual no fuso horário do Brasil
        String dataFormatada = dataBrasil.format(formato1);
        System.out.println("Data atual no Brasil: " + dataFormatada);
    }
}