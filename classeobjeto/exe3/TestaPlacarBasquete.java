package poo_ads2026.classeobjeto.exe3;
//pacote não estava antes, adicionei para organizar melhor o código, pode ser removido se não for necessário

public class TestaPlacarBasquete {
    public static void main(String[] args) {
        PlacarBasquete jogo1 = new PlacarBasquete("Franca Basquete", "Corinthians");
        System.out.println(jogo1);
        jogo1.registrarPontos("batman", 9);
        jogo1.registrarPontos("Franca Basquete", 3);
        jogo1.registrarPontos("Franca Basquete", 3);
        jogo1.proximoQuarto();
        System.out.println(jogo1);
        jogo1.registrarPontos("Franca Basquete", 3);
        jogo1.registrarPontos("Corinthians", 3);
        jogo1.proximoQuarto();
        System.out.println(jogo1);
        jogo1.registrarPontos("Corinthians", 2);
        jogo1.registrarPontos("Corinthians", 1);
        jogo1.proximoQuarto();
        System.out.println(jogo1);
    }
}
