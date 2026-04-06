package poo_ads2026.encapsulamento.exe0;
//pacote não estava antes, adicionei para organizar melhor o código, pode ser removido se não for necessário

public class SmartTv {
    private String marca, modelo;
    private int volume;
    private boolean conectadoInternet;

    // construtor sem parâmetros
    public SmartTv(){
        this.volume = 0;
    }
    // construtor com parâmetro
    public SmartTv(String marca, String modelo, int volume){
        this.marca = marca; this.modelo = modelo;
        this.setVolume(volume);
        this.conectadoInternet = false;
    }
    // altera o valor de volume
    public void setVolume (int volume){
        if (volume >= 0 && volume <= 100){
            this.volume = volume;
            System.out.println("Volume alterado com sucesso!");
        }
        else System.out.println("Volume inválido");
    }
    // obter o valor do volume
    public int getVolume(){
        return this.volume;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return this.marca;
    }

    public String toString(){
        return "Marca: " + this.marca +
        " Modelo " + this.modelo +
        " Volume: " + this.volume;
    }

    public void entrarYoutube(){
        if(this.isConectarInternet()){
            System.out.println("Conectado a internet e entrando no Youtube!");
        }
        else{
            System.out.println("Internet não encontrada!");
        }
    }

    private boolean isConectarInternet(){
        System.out.println("Buscando sinal de wi-fi...\nVerificando Credenciais...\nAutenticando IP do roteador...");

        int random = (int) (Math.random() * 10);
        System.out.println(random);

        if(random < 5){
            this.conectadoInternet = true;
            System.out.println("Tu ta on pcro");
            return true;
        }
        else{
            this.conectadoInternet = false;
            System.out.println("Não rolou n pcro");
            return false;
        }
    }

    public void aumentarVolume(int vol){
        this.setVolume(this.volume+vol);
    }
    public void diminuirVolume(int vol){
        this.setVolume(this.volume-vol);
    }
    public boolean isConectadoInternet() {
        return conectadoInternet;
    }
    public void setConectadoInternet(boolean conectadoInternet) {
        this.conectadoInternet = conectadoInternet;
    }
    

}
