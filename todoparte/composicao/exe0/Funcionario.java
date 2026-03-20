package poo_ads2026.todoparte.composicao.exe0;
//pacote não estava antes, adicionei para organizar melhor o código, pode ser removido se não for necessário

public class Funcionario{

    private int id;
    private String nome;
    private String cargo;

    public Funcionario() {

    }

    public Funcionario(int id, String npme, String cargo) {
        this.id = id;
        this.nome = npme;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "\nFuncionario \nid=" + id + ", \nnome=" + nome + ", \ncargo=" + cargo + "\n";
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    

    

    
}