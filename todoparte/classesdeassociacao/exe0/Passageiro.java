package poo_ads2026.todoparte.classesdeassociacao.exe0;
//pacote não estava antes, adicionei para organizar melhor o código, pode ser removido se não for necessário

public class Passageiro {
    
    private String cpf;
    private String nome;

    public Passageiro() {

    }

    public Passageiro(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nPassageiro [cpf=" + cpf + ", nome=" + nome + "]\n";
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
