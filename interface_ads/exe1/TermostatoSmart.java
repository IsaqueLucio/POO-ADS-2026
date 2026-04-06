package interface_ads.exe1;

public class TermostatoSmart implements DispositivoLigavel,SensorTemperatura{
    
    private double temperatura;
    private boolean isLigado;

    public TermostatoSmart(){
        this.isLigado = true;
        this.temperatura = 20.0;
    }

    public void aumentarTemperatura(double temp){
        if(isLigado){
            if(temp > this.temperatura && temp<=30){
                System.out.println("Temperatura aumentada para "+temp+"C°.");
                this.temperatura = temp;
            } else System.out.println("A temperatura deve ser maior que a atual e menor do que 30 C°");
        } else System.out.println("Primeiro ligue o termostado!!!");
    }

    public void abaixarTemperatura(double temp){
        if(isLigado){
            if(temp < this.temperatura && temp >= 16){
                System.out.println("Temperatura abaixada para "+temp+"C°.");
                this.temperatura = temp;
            } System.out.println("A temperatura não pode ser igual a atual e não pode ser menor do que 16 C°");
        } else System.out.println("Primeiro ligue o termostado!!!");
    }

    @Override
    public double lerTemperatura(){
        return temperatura;
    }

    @Override
    public void ligar(){
        if(!isLigado){
            System.out.println("Termostato ligado.");
            this.temperatura = 20.0;
            this.isLigado = true;
        } else System.out.println("O aparelho já está ligado!!!");
    }

    @Override
    public void desligar(){
        if(isLigado){
            System.out.println("Aparelho desligado.");
            this.temperatura = 0.0;
            this.isLigado = false;
        } else System.out.println("O aparelho já está desligado");
    }

}
