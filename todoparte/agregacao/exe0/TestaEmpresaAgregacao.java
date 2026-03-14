public class TestaEmpresaAgregacao{
    public static void main(String[] args) {

        EmpresaAgregacao emp1 = new EmpresaAgregacao(01, "Google", "NUM1234");
        FreeLancer fl1 = new FreeLancer(001, "Jonas", "Scrum Master");
        FreeLancer fl2 = new FreeLancer(002, "Marta", "Dev Junior");
        FreeLancer fl3 = new FreeLancer(003, "Maros", "Gerente de Projeto");

        emp1.adicionaFreeLancer(fl1);
        emp1.adicionaFreeLancer(fl2);
        emp1.adicionaFreeLancer(fl3);

        System.out.println(emp1);
        System.out.println(emp1.quantidadeFreelancer());

        emp1.removeFreeLancer(fl3);
        System.out.println(emp1);
        System.out.println(emp1.quantidadeFreelancer());
        
    }
}