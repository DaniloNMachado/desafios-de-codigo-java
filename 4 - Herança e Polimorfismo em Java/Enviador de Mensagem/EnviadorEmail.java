package Enviador de Mensagem;

public class EnviadorEmail implements EnviadorDeMensagem {
    
    @Override
    public void enviar(String mensagem){
        System.out.println("[E-MAIL ENVIADO]: " + mensagem);
    }
}
