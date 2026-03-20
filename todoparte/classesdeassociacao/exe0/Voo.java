package poo_ads2026.todoparte.classesdeassociacao.exe0;
//pacote não estava antes, adicionei para organizar melhor o código, pode ser removido se não for necessário

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Voo{

    private int numero;
    private String destino;
    private String origem;
    private LocalDateTime data;

    public Voo() {

    }

    public Voo(int numero, String destino, String origem, LocalDateTime data) {
        this.numero = numero;
        this.destino = destino;
        this.origem = origem;
        this.data = data;
    }

    DateTimeFormatter formatadoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy ás HH:mm");

    @Override
    public String toString() {
        return "\nVoo [numero=" + numero + ", destino=" + destino + ", origem=" + origem + ", data=" + data.format(formatadoBr) + "]\n";
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    

    
}