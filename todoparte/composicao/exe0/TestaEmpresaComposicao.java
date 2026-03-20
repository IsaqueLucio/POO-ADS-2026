package poo_ads2026.todoparte.composicao.exe0;
//pacote não estava antes, adicionei para organizar melhor o código, pode ser removido se não for necessário

public class TestaEmpresaComposicao{
    public static void main(String[] args) {
        
        EmpresaComposicao emp1 = new EmpresaComposicao("Microsoft", "NUM9876");
        emp1.contratarFuncionario(101, "Isaque", "Product Owner");
        emp1.contratarFuncionario(102, "Jonas", "Dev Sr");
        emp1.contratarFuncionario(103, "Carlos Oliveira", "Dev Backend");
        emp1.contratarFuncionario(104, "Ana Beatriz", "UX Designer");
        emp1.contratarFuncionario(105, "Ricardo Silva", "Project Manager");
        emp1.contratarFuncionario(106, "Fernanda Souza", "QA Engineer");
        emp1.contratarFuncionario(107, "Mateus Lima", "Estagiário Java");

        System.out.println(emp1);
        emp1.desligarFuncionario(106);
        System.out.println(emp1);
    }
}