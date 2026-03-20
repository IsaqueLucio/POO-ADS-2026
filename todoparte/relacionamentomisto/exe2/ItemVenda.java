package poo_ads2026.todoparte.relacionamentomisto.exe2;
//pacote não estava antes, adicionei para organizar melhor o código, pode ser removido se não for necessário

public class ItemVenda {
    
    private int id;
    private int quantidade;

    public ItemVenda() {

    }

    public ItemVenda(int id, int quantidade) {
        this.id = id;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "ItemVenda [id=" + id + ", quantidade=" + quantidade + "]";
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

}
