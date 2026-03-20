package poo_ads2026.todoparte.relacionamentomisto.exe3;

public class Ingresso {
    
    private int id;
    private String titulo;
    private String tipo;
    private double preco;

    protected Ingresso(){

    }

    protected Ingresso(int id, String titulo, String tipo, double preco) {
        this.id = id;
        this.titulo = titulo;
        this.tipo = tipo;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "\n |Dados do Ingresso| \nID: " + id + " \nTitulo do ingresso: " + titulo + " \nTipo de ingresso: " + tipo + " \nPreco do Ingresso: " + preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    

}
