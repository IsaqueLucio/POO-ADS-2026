package poo_ads2026.todoparte.agregacao.exe1;
//pacote não estava antes, adicionei para organizar melhor o código, pode ser removido se não for necessário

public class Atleta {
    
    private String nome;
    private String posicao;
    private int id;

    public Atleta() {

    }

    public Atleta(String nome, String posicao, int id) {
        this.nome = nome;
        this.posicao = posicao;
        this.id = id;
    }

    @Override
    public String toString() {
        return "\nDados do Atleta: \nNome: " + nome + " \nPosição: " + posicao + " \nID: " + id + "\n";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
