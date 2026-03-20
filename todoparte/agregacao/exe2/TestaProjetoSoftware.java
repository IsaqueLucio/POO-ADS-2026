package poo_ads2026.todoparte.agregacao.exe2;   
//pacote não estava antes, adicionei para organizar melhor o código, pode ser removido se não for necessário

public class TestaProjetoSoftware {
    
    public static void main(String[] args) {
        
        Programador dev1 = new Programador("Isaque", "Java", 101);
        Programador dev2 = new Programador("Davi", "Python", 102);
        Programador dev3 = new Programador("Leonardo", "C#", 103);

        Projeto proj1 = new Projeto("Sistema para gerenciar um presidio", 1098);
        
        proj1.contratarProgramadores(dev1);
        proj1.contratarProgramadores(dev2);

        System.out.println(proj1);
        proj1.exibirProgramadores();

        
        System.out.println("O projeto "+proj1.getNomeProjeto()+" foi pras cucuias!!!"+(proj1 = null));
        System.out.println("Mas relaxe que os programadores ainda existem pois era agregação: "
            +dev1+"\n"+dev2+"\n"+dev3);

    }
}
