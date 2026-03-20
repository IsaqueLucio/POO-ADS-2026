package poo_ads2026.todoparte.agregacao.exe1;
//pacote não estava antes, adicionei para organizar melhor o código, pode ser removido se não for necessário

public class TestaTimeBasquete{

    public static void main(String[] args) {
        
        Atleta atle1 = new Atleta("Kobe", "Armador", 101);
        Atleta atle2 = new Atleta("Jordan", "Ala", 102);
        Atleta atle3 = new Atleta("LeBron", "Pivô", 103);

        TimeBasquete time1 = new TimeBasquete("Lakers", "Larry Bird", 1);

        time1.contratarAtleta(atle1);
        time1.contratarAtleta(atle2);
        time1.contratarAtleta(atle3);
        System.out.println(time1);

        time1 = null;
        if(time1 == null){
            System.out.println("Provando que mesmo com o time não exisitindo os atletas permanecem: "
            +atle1+"\n"+atle2+"\n"+atle3);
        } else System.out.println("Não deu pra provar que deu agregação não :/");
    }
}