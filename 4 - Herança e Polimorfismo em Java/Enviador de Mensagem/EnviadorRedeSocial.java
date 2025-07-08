package Enviador de Mensagem;

public class EnviadorRedeSocial implements EnviadorDeMensagem {
    
    @Override
    public void enviar(String mensagem){
        System.out.println("[Redes Sociais ENVIADO]: " + mensagem);
    }
}
