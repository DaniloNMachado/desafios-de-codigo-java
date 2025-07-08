package Enviador de Mensagem;

public class EnviadorWhatsApp implements EnviadorDeMensagem {
    
    @Override
    public void enviar(String mensagem){
        System.out.println("[WhatsApp ENVIADO]: " + mensagem);
    }
}
