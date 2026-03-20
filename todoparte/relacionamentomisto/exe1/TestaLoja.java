package poo_ads2026.todoparte.relacionamentomisto.exe1;
//pacote não estava antes, adicionei para organizar melhor o código, pode ser removido se não for necessário


public class TestaLoja{
    public static void main(String[] args) {

        Produto pro1 = new Produto(101, "Monitor AOC 144Mhz", 699.90);
        Produto pro2 = new Produto(102, "Mouse Redragon King Cobra", 170.50);
        Produto pro3 = new Produto(102, "Teclado Mecanico Redragon DarkAvenger", 199.99);

        Carrinho car1 = new Carrinho();
        car1.adicionarProduto(pro1);
        car1.adicionarProduto(pro2);
        car1.adicionarProduto(pro3);

        car1.gerarItem(101, 2, 699.90);
        car1.gerarItem(102, 3, 170.50);

        System.out.println(car1);

        car1.deletarItem(101);
        System.out.println(car1);

    }
}