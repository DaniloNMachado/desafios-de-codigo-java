package Enviador de Mensagem;

import java.util.List;
import java.util.ArrayList;

public class Marketing {
    public static void main(String[] args) {
        List<EnviadorDeMensagem> canaisDeEnvio = new ArrayList<>();

        canaisDeEnvio.add(new EnviadorSMS());
        canaisDeEnvio.add(new EnviadorEmail());
        canaisDeEnvio.add(new EnviadorWhatsApp());
        canaisDeEnvio.add(new EnviadorRedeSocial());

        String mensagemDeMarketing = "PROMOÇÃO IMPERDÍVEL: 50% de desconto em toda a loja só hoje!";

        System.out.println("Disparando campanha de marketing...");
        System.out.println("-----------------------------------");

        for (EnviadorDeMensagem canal : canaisDeEnvio) {
            canal.enviar(mensagemDeMarketing);
        }
    }
    
}
