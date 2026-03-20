package poo_ads2026.classeobjeto.exe2;
//pacote não estava antes, adicionei para organizar melhor o código, pode ser removido se não for necessário

public class TestaStreaming {
    public static void main(String[] args) {
        Streaming obj1 = new Streaming("Marcos", "Basico");
        System.out.println(obj1);

        Streaming obj2 = new Streaming("Julia", "Premium");
        System.out.println(obj2);

        Streaming obj3 = new Streaming("Otavio", "Familia");
        System.out.println(obj3);

        obj1.assistirFilme("Batman: O Cavaleiro das Trevas");
        obj2.cancelarAssinatura();
        obj2.assistirFilme("Coringa");
        System.out.println(obj2);
    }
}
