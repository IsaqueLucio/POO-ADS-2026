package poo_ads2026.classeobjeto.exe2;
//pacote não estava antes, adicionei para organizar melhor o código, pode ser removido se não for necessário

public class Streaming {
    
    private String usuario;
    private String plano;
    private double mensalidade;
    private boolean ativo;
    private String ultimoFilmeAssistido;

    public Streaming(String usuario, String plano){
        this.usuario = usuario;
        if(plano.equals("Basico")){
            this.mensalidade = 25.90;
        } else{
            if(plano.equals("Premium")){
                this.mensalidade = 45.90;
            } else{
                if(plano.equals("Familia")){
                    this.mensalidade = 60.90;
                }
             }
        }
        this.plano=plano;
        this.ativo = true;
        this.ultimoFilmeAssistido = "";
    }

    public void assistirFilme(String nomeFilme){
        if(this.ativo){
            this.ultimoFilmeAssistido = nomeFilme;
            System.out.println("Usuario "+usuario+" assistiu: "+nomeFilme);
        } else System.out.println("Nâo foi possivel iniciar o filme: "+nomeFilme+" \nNecessario renovar o plano, conta inativa!");
    }

    public void cancelarAssinatura(){
        this.ativo = false;
        System.out.println("Plano cancelado e conta inativa!");
    }

    @Override
    public String toString(){
        String status;
        if(this.ativo){
            status = "Ativo.";
        } else{
            status = "Suspenso.";
        }

        return "\nDados da Conta \n Usuario: "+usuario+"\n Plano: "+plano+"\n Mensalidade: R$"+mensalidade+
        "\n Status do plano: "+status+"\n Ultimo filme assistido: "+ultimoFilmeAssistido+"\n";
    }


}   
