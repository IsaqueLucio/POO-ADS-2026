package poo_ads2026.todoparte.relacionamentomisto.exe1;
//pacote não estava antes, adicionei para organizar melhor o código, pode ser removido se não for necessário


public class ItemVenda{

    private int id;
    private int quantidade;
    private double valorUnitario;

    public ItemVenda(){

    }

    public ItemVenda(int id, int quantidade, double valorUnitario) {
        this.id = id;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString() {
        return "\nItemVenda{id=" + id + ", \nquantidade=" + quantidade + ", \nvalorUnitario=" + valorUnitario + "\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}