package poo_ads2026.encapsulamento.exe1;
//pacote não estava antes, adicionei para organizar melhor o código, pode ser removido se não for necessário

public class TestaSistemaArCondicionado {
    public static void main(String[] args) {

        SistemaArCondicionado obj1 = new SistemaArCondicionado();
        System.out.println(obj1);

        SistemaArCondicionado obj2 = new SistemaArCondicionado("LG", "ArBom", 22);
        obj2.ligar();
        obj2.ajustarTemperatura(10);
        obj2.ajustarTemperatura(25);
        System.out.println(obj2);

        obj2.desligar();
        obj2.modoTurbo();
        obj2.ligar();
        obj2.modoTurbo();
        System.out.println(obj2);

    }
}
