package poo_ads2026.classeobjeto.exe1;
//pacote não estava antes, adicionei para organizar melhor o código, pode ser removido se não for necessário

public class Conta {
    int numeroConta;
    int agencia;
    String nomeCliente;
    float saldo;
    boolean status;


    public Conta(int numeroConta, int agencia, String nomeCliente){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
        this.status = true;
    }

    public void depositar(float valor){
        if(this.status){
            this.saldo = this.saldo + valor;
            System.out.println("Saldo atualizado!\nSaldo atual: " + this.saldo);
        }

        else System.out.println("Não foi possivel depositar, conta inativa.");
    }

    public void sacar(float valor){
        if(this.status && this.saldo >= valor){
            this.saldo = this.saldo - valor;
            System.out.println("Saldo atualizado!\nSaldo atual: " + this.saldo);
        }
        else{
            if(this.saldo < valor){
                System.out.println("Saldo insuficiente");
            }
            else System.out.println("Conta inativa");
        }
    }

    public void encerrarConta(){
        if(this.saldo != 0){
            System.out.println("Saque todo o saldo para encerrar.\n Saldo atual "+this.saldo);
        }
        else{
            this.status = false;
            System.out.println("Conta encerrada com sucesso!");
        }
    }

    @Override
    public String toString(){
        return "Conta \nNúmero: " + numeroConta + "\nAgência: " + agencia + "\nCliente: " + nomeCliente + 
        "\nSaldo atual: "+ this.saldo+ "\nStatus da conta: "+this.status;
    }

}
