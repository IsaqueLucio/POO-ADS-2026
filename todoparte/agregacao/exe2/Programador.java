package poo_ads2026.todoparte.agregacao.exe2;
//pacote não estava antes, adicionei para organizar melhor o código, pode ser removido se não for necessário

public class Programador {
    
    private String nome;
    private String linguagemPrinicipal;
    private int id;

    public Programador() {

    }

    public Programador(String nome, String linguagemPrinicipal, int id) {
        this.nome = nome;
        this.linguagemPrinicipal = linguagemPrinicipal;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Programador [nome=" + nome + ", linguagemPrinicipal=" + linguagemPrinicipal + ", id=" + id + "]";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLinguagemPrinicipal() {
        return linguagemPrinicipal;
    }

    public void setLinguagemPrinicipal(String linguagemPrinicipal) {
        this.linguagemPrinicipal = linguagemPrinicipal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
