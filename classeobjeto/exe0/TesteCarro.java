package poo_ads2026.classeobjeto.exe0;
//pacote não estava antes, adicionei para organizar melhor o código, pode ser removido se não for necessário

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Ferrari","SF90",
        "Vermelho","ABC123",700,2024);

        Carro carro2 = new Carro("Ford","Mustang Shelby GT",
        "Azul Profundo","ABCD12",800,2017);
        
        Carro carro3 = new Carro("Porche","GT3 RS",
        "Amarelo","ABCDE1",600,2020);

        Carro carro4 = new Carro("Pouzera", "Bonitão", "Marrom Claro ui", "SOUOPOU", 1, 1);

        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(carro3);
        System.out.println(carro4);
    }
}


