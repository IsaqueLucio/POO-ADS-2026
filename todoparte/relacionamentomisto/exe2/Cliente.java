package poo_ads2026.todoparte.relacionamentomisto.exe2;
//pacote não estava antes, adicionei para organizar melhor o código, pode ser removido se não for necessário


public class Cliente {
    
    private int id;
    private String nome;

    public Cliente() {

    }

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente [id=" + id + ", nome=" + nome + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
