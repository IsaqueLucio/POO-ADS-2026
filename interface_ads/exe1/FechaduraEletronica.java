package interface_ads.exe1;

public class FechaduraEletronica implements Auntenticavel, DispositivoLigavel{

    private boolean isLogado;
    private boolean isLigado;
    private String senha;

    public FechaduraEletronica(String senha){
        this.senha = senha;
    }

    @Override
    public void validarAcesso(String senha){
        if(senha.equals(this.senha)){
            System.out.println("Acesso validado com sucesso!");
            this.isLogado = true;
        } else System.out.println("Senha incorreta!");
    }

    @Override
    public void ligar(){
        if(isLigado){
            System.out.println("Aparelho já ligado");
            return;
        }
        if(isLogado){
            System.out.println("Aparelho ligado com sucesso!");
            this.isLigado = true;
        } else {
            System.out.println("Acesso não validado. Primeiro valide a senha antes de ligar.");
        }
    }

    @Override
    public void desligar(){
        if (isLigado) {
            System.out.println("Aparelho desligado com sucesso!");
            this.isLigado = false;
            this.isLogado = false;
        } else System.out.println("O aparelho já está desligado!");
    }

    
}