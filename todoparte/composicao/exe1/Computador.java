package poo_ads2026.todoparte.composicao.exe1;
//pacote não estava antes, adicionei para organizar melhor o código, pode ser removido se não for necessário

public class Computador {
    
    private String marca;
    private int id;
    private final Processador processador;
    
    public Computador(String marca, int id, String procMarca, String procModelo, double procFreq) {
        this.marca = marca;
        this.id = id;
        this.processador = new Processador(procMarca, procModelo, procFreq);
    }

    @Override
    public String toString() {
        return "\nInformações do Computador \nMarca: " + marca + " \nID: " + id + " \nProcessador: " + processador + "\n";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Processador getProcessador() {
        return processador;
    }


}
