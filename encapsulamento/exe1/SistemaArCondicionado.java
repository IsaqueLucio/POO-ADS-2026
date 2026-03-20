package poo_ads2026.encapsulamento.exe1;
//pacote não estava antes, adicionei para organizar melhor o código, pode ser removido se não for necessário

public class SistemaArCondicionado {
    private String marca;
    private String modelo;
    private int temperatura;
    private boolean ligado;

    public  SistemaArCondicionado(){
        this.marca = "Generico";
        this.modelo = "Standart";
        this.temperatura = 23;
        this.ligado = false;
    }

    public SistemaArCondicionado(String marca, String modelo,int temperatura){    
        this.marca = marca;
        this.modelo = modelo;
        this.temperatura = temperatura;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        if (temperatura >= 16 && temperatura <= 30) {
             this.temperatura = temperatura;
            System.out.println("Temperatura alterada!\nTemperatura atual: "+temperatura+"°C");
        } else System.out.println("A temperatura precisa ser entre no minimo 16°C e no maximo 30°C!");
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar(){
        setLigado(true);
        System.out.println("O ar condicionado está ligado e pronto para uso!");
    }

    public void desligar(){
        setLigado(false);
        System.out.println("O ar condicioanado foi desligado!");
    }

    public void ajustarTemperatura(int novaTemp){
        if(this.ligado){
            setTemperatura(novaTemp);
        } else System.out.println("Não foi possivel ajustar a temperatura, ligue o aparelho primeiro!");
    }

    public void modoTurbo(){
        if(this.ligado){
            processarResfriamentoRapido();
        } else System.out.println("Não foi possivel acionar o modo turbo, ligue o aparelho primeiro!");
    }

    private void processarResfriamentoRapido(){
        System.out.println("Aumentando rotação do compressor...\nLigando ventilação máxima...");
        setTemperatura(16);
        System.out.println("Modo de resfriamento rapido concluido\nTemperatura atual em 16°C.");
        
    }

    @Override
    public String toString(){
        String status;
        if(this.ligado){
            status = "Ligado";
        } else{
            status = "Desligado";
        }
        return "\nDados do Ar Condicionado: \nMarca: "+marca+"\nModelo: "+modelo+"\nTemperatura atual: "+temperatura+"\nStatus: "+status+"\n";
    }
    
}
