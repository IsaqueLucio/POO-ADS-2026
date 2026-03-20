package poo_ads2026.todoparte.agregacao.exe2;
//pacote não estava antes, adicionei para organizar melhor o código, pode ser removido se não for necessário

import java.util.ArrayList;
import java.util.List;

public class Projeto {
    
    private String nomeProjeto;
    private int id;
    private List <Programador> listaProgramadores = new ArrayList<>();
    
    public Projeto() {
        
    }

    public Projeto(String nomeProjeto, int id) {
        this.nomeProjeto = nomeProjeto;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Projeto [nomeProjeto=" + nomeProjeto + ", id=" + id + ", listaProgramadores=" + listaProgramadores
                + "]";
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Programador> getListaProgramadores() {
        return listaProgramadores;
    }

    public void setListaProgramadores(List<Programador> listaProgramadores) {
        this.listaProgramadores = listaProgramadores;
    }

    public void contratarProgramadores(Programador novoProgramador){
        this.listaProgramadores.add(novoProgramador);
    }

    public void exibirProgramadores(){
        System.out.println("\nProgramadores atualmente no projeto: "+listaProgramadores);
    }
    

}
