package poo_ads2026.todoparte.agregacao.exe0;
//pacote não estava antes, adicionei para organizar melhor o código, pode ser removido se não for necessário

import java.util.ArrayList;
import java.util.List;

public class EmpresaAgregacao {

    private int identificador;
    private String nome;
    private String cnpj;
    private List <FreeLancer> listaFreeLancers = new ArrayList<>();
    
    public EmpresaAgregacao() {
        
    }

    public EmpresaAgregacao(int identificador, String nome, String cnpj) {
        this.identificador = identificador;
        this.nome = nome;
        this.cnpj = cnpj;
        
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<FreeLancer> getListaFreeLancers() {
        return listaFreeLancers;
    }

    public void setListaFreeLancers(List<FreeLancer> listaFreeLancers) {
        this.listaFreeLancers = listaFreeLancers;
    }

    @Override
    public String toString() {
        return "\nEmpresa Agregação \nidentificador=" + identificador + ", \nnome=" + nome + ", \ncnpj=" + cnpj
                + ", \nlistaFreeLancers=" + listaFreeLancers + "\n";
    }

    public void adicionaFreeLancer(FreeLancer freeLancer){
        this.listaFreeLancers.add(freeLancer);
    }

    public void removeFreeLancer(FreeLancer freeLancer){
        this.listaFreeLancers.remove(freeLancer);
    }

    public int quantidadeFreelancer(){
        return this.listaFreeLancers.size();
    }

}
