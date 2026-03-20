package poo_ads2026.classeobjeto.exe1;
//pacote não estava antes, adicionei para organizar melhor o código, pode ser removido se não for necessário

public class TestaConta {
    public static void main(String[] args) {
        Conta c1 = new Conta(7461, 0001, "João Silva");

        c1.depositar(500.00f);
        c1.sacar(200.00f);
        System.out.println(c1);


        Conta c2 = new Conta(3795, 0001, "Maria Souza");

        c2.sacar(50.00f);

        c1.encerrarConta();

        c1.sacar(300.00f);
        c1.encerrarConta();
        System.out.println(c1);
    }
    
}
