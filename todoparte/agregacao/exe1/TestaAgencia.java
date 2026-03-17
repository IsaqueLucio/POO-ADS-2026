import java.time.LocalDateTime;

public class TestaAgencia {
    
    public static void main(String[] args) {
        
        Passageiro pas1 = new Passageiro("CPF123", "Michael");

        LocalDateTime dataVoo = LocalDateTime.of(2026, 4, 13, 15, 30);
        Voo voo1 = new Voo(21, "Rome - Italia", "Paris - France", dataVoo);

        LocalDateTime dataReserva = LocalDateTime.now();
        Reserva res1 = new Reserva(15, dataReserva, 11, pas1,voo1);

        System.out.println(voo1);
        System.out.println(pas1);
        System.out.println(res1);

    }
}
