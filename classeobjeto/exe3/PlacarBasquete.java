package classeobjeto.exe3;

public class PlacarBasquete {

    private String timeCasa;
    private String timeVisitante;
    private int pontosCasa;
    private int pontosVisitante;
    private int periodoQuarto;

    public PlacarBasquete(String timeCasa, String timeVisitante){
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
        this.pontosCasa = 0;
        this.pontosVisitante = 0;
        this.periodoQuarto = 1;
    }

    public void registrarPontos(String time, int tipo) {
        if (timeCasa.equals(time) && tipo > 0 && tipo <= 3) {
            this.pontosCasa = this.pontosCasa + tipo;
            
        } else if (timeVisitante.equals(time) && tipo > 0 && tipo <= 3) {
            this.pontosVisitante = this.pontosVisitante + tipo;
            
        } else if (!timeCasa.equals(time) && !timeVisitante.equals(time) && tipo > 0 && tipo <= 3) {
            System.out.println("Time Invalido!");
            
        } else if (!timeCasa.equals(time) && !timeVisitante.equals(time)) {
            System.out.println("Chapou o globo, reescreve isso ai pcr");
            
        } else {
            System.out.println("Apenas pontos de 1, 2 ou 3!");
        }
    }

    public void proximoQuarto(){
        this.periodoQuarto = this.periodoQuarto+1;
        if(this.periodoQuarto == 4){
            System.out.println("O jogo acabou!!!");
        } else{
            this.periodoQuarto++;
        }
    }

    public String toString(){
        return "Time da Casa: "+pontosCasa+" | "+pontosVisitante+" :Time Visitante \nPeriodo do jogo: "+periodoQuarto+"\n";
    }


}
