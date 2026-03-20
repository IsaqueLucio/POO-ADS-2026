package poo_ads2026.todoparte.agregacao.exe0;
//pacote não estava antes, adicionei para organizar melhor o código, pode ser removido se não for necessário

public class FreeLancer{

    private int identificador;
    private String nome;
    private String funcao;

    public FreeLancer() {
    }

    public FreeLancer(int identificador, String nome, String funcao) {
        this.identificador = identificador;
        this.nome = nome;
        this.funcao = funcao;
    }
    
    public int getIdentificador() {
        return identificador;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    @Override
    public String toString() {
        return "\nFreeLancer \nidentificador=" + identificador + ", \nnome=" + nome + ", \nfuncao=" + funcao + "\n";
    }

    
}