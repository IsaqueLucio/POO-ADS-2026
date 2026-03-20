package poo_ads2026.todoparte.relacionamentomisto.exe3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Sessao {
    
    private int id;
    private int sala;
    private LocalDateTime horario;
    private Filme filme;
    private List <Ingresso> listaIngressos = new ArrayList<>();

    public Sessao(){

    }

    DateTimeFormatter formatadoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy ás HH:mm");

    public Sessao(int id, int sala, LocalDateTime horario) {
        this.id = id;
        this.sala = sala;
        this.horario = horario;
    }
    
    public void venderIngressos(int id, String titulo, String tipo, double preco){
        Ingresso novIngresso = new Ingresso(id, titulo, tipo, preco);
        this.listaIngressos.add(novIngresso);
    }

    public void vincularFilme(Filme f){
        this.filme = f;
    }

    @Override
    public String toString() {
        return "\n|Informações da Sessao|\n \nID da sessão: " + id + " \nSala da Sessão: " + sala + " \nData/Horario da Sessão: " 
        + horario.format(formatadoBr) + " \nFilme a ser exibido: " + filme + " \nLista de Ingressos: "
                + listaIngressos + " \nQuantidade de Ingressos vendidos: "+this.listaIngressos.size();
    }
 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public List<Ingresso> getListaIngressos() {
        return listaIngressos;
    }

    public void setListaIngressos(List<Ingresso> listaIngressos) {
        this.listaIngressos = listaIngressos;
    }

}
