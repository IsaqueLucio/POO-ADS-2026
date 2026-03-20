package poo_ads2026.todoparte.composicao.exe2; 
//pacote não estava antes, adicionei para organizar melhor o código, pode ser removido se não for necessário

import java.util.List;
import java.util.ArrayList;

public class Edificio {

    private String endereco;
    private String nome;
    private List <Apartamento> listaApartamento = new ArrayList<>();

    public Edificio() {

    }

    public Edificio(String endereco, String nome) {
        this.endereco = endereco;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nDados Edificio \nEndereco: " + endereco + " \nNome do edificio: " + nome + " \nLista de apartamentos: " + listaApartamento + " \n";
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void construirApartamento(int andar, int numero){
        Apartamento novApartamento = new Apartamento(andar, numero);
        this.listaApartamento.add(novApartamento);
    }

}
