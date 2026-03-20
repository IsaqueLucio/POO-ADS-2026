package poo_ads2026.todoparte.composicao.exe2;
//pacote não estava antes, adicionei para organizar melhor o código, pode ser removido se não for necessário

public class TestaEdAp {
    public static void main(String[] args) {
        
        Edificio edi1 = new Edificio("Av. Supreme King", "Nova AlphaVille");
        edi1.construirApartamento(10, 35);
        edi1.construirApartamento(0, 90);
        edi1.construirApartamento(7, 809);
        System.out.println(edi1);
    }
}
