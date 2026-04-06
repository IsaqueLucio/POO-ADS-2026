package interface_ads.exe1;

public class TestaExe1Interface {
    
    public static void main(String[] args) {

        FechaduraEletronica fechaduraEletronica = new FechaduraEletronica("senha");
        TermostatoSmart termostatoSmart = new TermostatoSmart();

        System.out.println("Teste da Fechadura Eletronica: ");
        fechaduraEletronica.ligar();
        fechaduraEletronica.validarAcesso("nãoSenha");
        fechaduraEletronica.validarAcesso("senha");
        fechaduraEletronica.desligar();
        fechaduraEletronica.ligar();
        fechaduraEletronica.ligar();
        fechaduraEletronica.desligar();
        
        System.out.println("\nTeste do Termostado Smart: ");
        System.out.println("Temperatura atual: "+termostatoSmart.lerTemperatura());
        termostatoSmart.ligar();
        termostatoSmart.abaixarTemperatura(14);
        System.out.println("Temperatura atual: "+termostatoSmart.lerTemperatura());
        termostatoSmart.aumentarTemperatura(25.7);
        System.out.println("Temperatura atual: "+termostatoSmart.lerTemperatura());
        termostatoSmart.aumentarTemperatura(42);
        termostatoSmart.desligar();
        
        
    }
}
