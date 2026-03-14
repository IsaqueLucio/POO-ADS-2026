import java.util.ArrayList;
import java.util.List;

public class EmpresaComposicao{

    private String nome;
    private String cnpj;
    private List<Funcionario>listaFuncionario = new ArrayList<>();
    
    public EmpresaComposicao(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "\nEmpresaComposicao \nnome=" + nome + ", \ncnpj=" + cnpj + ", \nlistaFuncionario=" + listaFuncionario + "\n";
    }

    public void contratarFuncionario(int id, String nome, String cargo){
        Funcionario novoFuncionario = new Funcionario(id, nome, cargo);
        this.listaFuncionario.add(novoFuncionario);
    }

    public void desligarFuncionario(int id){
        for(int i=0;i<this.listaFuncionario.size();i++){
            if(this.listaFuncionario.get(i).getId() == id){
                this.listaFuncionario.remove(i);
                break;
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Funcionario> getListaFuncionario() {
        return listaFuncionario;
    }

    public void setListaFuncionario(List<Funcionario> listaFuncionario) {
        this.listaFuncionario = listaFuncionario;
    }

    

    

}