package poo_ads2026.todoparte.classesdeassociacao.exe0;
//pacote não estava antes, adicionei para organizar melhor o código, pode ser removido se não for necessário

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reserva {
    
    private int id;
    private LocalDateTime data;
    private int poltrona;
    private Passageiro passageiro;
    private Voo voo;

    public Reserva() {
        
    }

    public Reserva(int id, LocalDateTime data, int poltrona, Passageiro passageiro, Voo voo) {
        this.id = id;
        this.data = data;
        this.poltrona = poltrona;
        this.passageiro = passageiro;
        this.voo = voo;
    }

    DateTimeFormatter formatadoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy ás HH:mm");

    @Override
    public String toString() {
        return "\nReserva [id=" + id + ", data=" + data.format(formatadoBr) + ", poltrona=" + poltrona + ", passageiro=" + passageiro
                + ", voo=" + voo + "\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public DateTimeFormatter getFormatadoBr() {
        return formatadoBr;
    }

    public void setFormatadoBr(DateTimeFormatter formatadoBr) {
        this.formatadoBr = formatadoBr;
    }
   
}
