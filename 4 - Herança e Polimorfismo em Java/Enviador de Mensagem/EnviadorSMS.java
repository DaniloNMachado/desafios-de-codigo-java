package Enviador de Mensagem;

public class EnviadorSMS implements EnviadorDeMensagem {
    
    @Override
    public void enviar(String mensagem){
        System.out.println("[SMS ENVIADO]: " + mensagem);
    }
}
