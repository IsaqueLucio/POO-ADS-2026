package poo_ads2026.encapsulamento.exe0;
//pacote não estava antes, adicionei para organizar melhor o código, pode ser removido se não for necessário

class TesteSmartTv{
    public static void main(String[] args){

        SmartTv obj1 = new SmartTv("Samsung", "32 polegadas", 0);
        System.out.println(obj1.toString());
        // altera o volume
        obj1.setVolume(30);
        System.out.println("Valor do volume " + obj1.getVolume());

        SmartTv obj2 = new SmartTv("Lg","40 polegadas",-120);
        System.out.println(obj2);

        obj1.entrarYoutube();
        obj1.aumentarVolume(30);
        obj1.diminuirVolume(80);


    }
}