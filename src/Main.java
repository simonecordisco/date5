//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
//verificare che la prima data è precedente alla seconda
//verificare che la seconda data è successiva alla prima
//verificare che le due date sono uguali ad ora
//Stampa il risultato


import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {


        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime data1 = OffsetDateTime.parse("2024-03-01T13:51:00Z");

        System.out.println("Data: " + data);
        System.out.println("Data1: " + data1);
        OffsetDateTime date = OffsetDateTime.now();

        System.out.println(data1);
        System.out.println(data);
        System.out.println(data.isBefore(data1));
        System.out.println(data1.isAfter(data));
        System.out.println(data.isEqual(date));
        System.out.println(data1.isEqual(date));
    }
}