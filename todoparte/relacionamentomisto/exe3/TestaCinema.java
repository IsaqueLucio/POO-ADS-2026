package poo_ads2026.todoparte.relacionamentomisto.exe3;

import java.time.LocalDateTime;

public class TestaCinema {
    public static void main(String[] args) {
        
        Filme film1 = new Filme(101, "The Batman", "Action", 192);
        Filme film2 = new Filme(102, "Dune: Part 3", "Adventure", 200);

        LocalDateTime dataSessao = LocalDateTime.of(2026, 07, 20, 20, 0);
        Sessao sessao1 = new Sessao(109, 2, dataSessao);
        sessao1.vincularFilme(film2);
        sessao1.venderIngressos(130, "A1", "Meia", 14.0);
        sessao1.venderIngressos(131, "A2", "Inteira", 28.0);
        sessao1.venderIngressos(136, "A3", "Meia", 28.0);

        LocalDateTime dataSessao2 = LocalDateTime.of(2026, 10, 29, 18, 30);
        Sessao sessao2 = new Sessao(120, 1, dataSessao2);
        sessao2.vincularFilme(film1);

        System.out.println(sessao1);
        
    }
    
}
