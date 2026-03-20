package poo_ads2026.todoparte.agregacao.exe1;
//pacote não estava antes, adicionei para organizar melhor o código, pode ser removido se não for necessário

import java.util.ArrayList;
import java.util.List;

public class TimeBasquete {
    
    private String nome;
    private String tecnico;
    private int id;
    private List <Atleta> listaAtletas = new ArrayList<>();
    
    public TimeBasquete() {

    }

    public TimeBasquete(String nome, String tecnico, int id) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Dabos do Time de Basquete \nNome: " + nome + " \nTecnico: " + tecnico + " \nID: " + id + " \nLista de Atletas: \n" + listaAtletas
                + "\n";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Atleta> getListaAtletas() {
        return listaAtletas;
    }

    public void setListaAtletas(List<Atleta> listaAtletas) {
        this.listaAtletas = listaAtletas;
    }

    public void contratarAtleta(Atleta novoAtleta){
        this.listaAtletas.add(novoAtleta);
    }

}
