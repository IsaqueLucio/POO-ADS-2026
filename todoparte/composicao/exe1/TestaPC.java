package poo_ads2026.todoparte.composicao.exe1;
//pacote não estava antes, adicionei para organizar melhor o código, pode ser removido se não for necessário

public class TestaPC {
    public static void main(String[] args) {
        
        Computador computador = new Computador("Alienware", 101, "Intel", "I9 9990k", 5.6);
        Computador computador2 = new Computador("Legion", 102, "Ryzen", " 9 950X3D", 6.1);

        System.out.println(computador);
        System.out.println(computador2);

        computador = null; //Destruindo o computador
        System.out.println(computador.getProcessador()); //Vai dar erro pois como é composição o processador morreu com o computador
    }
}
