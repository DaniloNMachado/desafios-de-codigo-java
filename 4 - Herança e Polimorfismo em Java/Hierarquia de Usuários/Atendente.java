package Hierarquia de Usuários;

public class Atendente extends Usuario {

    private boolean administrador = false;
    private double valorEmCaixa = 0;
    
    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    public void receberPagamento(double valor) {
        this.valorEmCaixa += valor;
        System.out.printf("Pagamento de R$ %.2f recebido. Novo valor em caixa: R$ %.2f%n", valor, this.valorEmCaixa);
    }

    public void FecharCaixa() {
        System.out.printf("--- Fechamento de Caixa ---%n");
        System.out.printf("Valor total em caixa: R$ %.2f%n", this.valorEmCaixa);
        this.valorEmCaixa = 0.0;
        System.out.println("Caixa zerado com sucesso!");
    }
}
