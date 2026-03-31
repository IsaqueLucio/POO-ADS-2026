package poo_ads2026.heranca.classe_abstrata.exe0;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorNotificacoes {
    public static void main(String[] args) {
        
        List <CanalNotificacao> gerenciador_de_notificacoes = new ArrayList<>();

        Email email = new Email("Micah", "Tu é um rato.", "Eu sei que tu é um rato");
        Sms sms = new Sms("Dutch", "Não esquece dos 25$", 123456789);
        WhatsApp whatsApp = new WhatsApp("Arthur", "Não cobre dividas", "Visto");

        gerenciador_de_notificacoes.add(email);
        gerenciador_de_notificacoes.add(sms);
        gerenciador_de_notificacoes.add(whatsApp);

        for (CanalNotificacao f: gerenciador_de_notificacoes) {
            f.exibirDados();
            System.out.println("\n");
            f.enviar();
        }
        
    }
}
