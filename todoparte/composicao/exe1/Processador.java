package poo_ads2026.todoparte.composicao.exe1;
//pacote não estava antes, adicionei para organizar melhor o código, pode ser removido se não for necessário

public class Processador {
    
    private String marca;
    private String modelo;
    private double frequencia;

    protected Processador() {

    }

    protected Processador(String marca, String modelo, double frequencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "\nMarca do Processador: " + marca + " \nModelo do Processador: " + modelo + " \nFrequência do Processador: " + frequencia + "Ghz\n";
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getFrequencia() {
        return frequencia;
    }

    
}
