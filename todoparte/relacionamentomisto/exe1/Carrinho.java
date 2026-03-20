package poo_ads2026.todoparte.relacionamentomisto.exe1;
//pacote não estava antes, adicionei para organizar melhor o código, pode ser removido se não for necessário


import java.util.List;
import java.util.ArrayList;

public class Carrinho{

    private List<ItemVenda> listaItens = new ArrayList<>();
    private List<Produto> listaProdutos = new ArrayList<>();

    public Carrinho() {

    }

    public void adicionarProduto(Produto produto){
        this.listaProdutos.add(produto);
    }

    public void gerarItem(int id, int quantidade, double valor){
        ItemVenda novoItemVenda = new ItemVenda(id, quantidade, valor);
        this.listaItens.add(novoItemVenda);
    }

    public void deletarItem(int id){
        for(ItemVenda f: listaItens){
            if(f.getId() == id){
                this.listaItens.remove(f);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "\nCarrinho \nLista Itens=" + listaItens + ", \nLista Produtos=" + listaProdutos + "\n";
    }

    public List<ItemVenda> getListaItens() {
        return listaItens;
    }

    public void setListaItens(List<ItemVenda> listaItens) {
        this.listaItens = listaItens;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

}