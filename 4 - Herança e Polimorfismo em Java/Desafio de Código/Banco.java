import java.util.List;

public class Banco {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca("12345", "001", 1000.0, 0.05);
        ContaCorrente contaCorrente = new ContaCorrente("67890", "002", 500.0, 200.0);

        System.out.println("--- Saldo Inicial ---");
        System.out.printf("Poupança: R$ %.2f%n", contaPoupanca.getSaldoEmConta());
        System.out.printf("Corrente: R$ %.2f%n", contaCorrente.getSaldoEmConta());

        System.out.println("\n... Realizando transferência de R$ 200.00 da Poupança para a Corrente ...");
        contaPoupanca.transferir(contaCorrente, 200.0);

        System.out.println("\n--- Saldo Pós-Transferência ---");
        System.out.printf("Poupança: R$ %.2f%n", contaPoupanca.getSaldoEmConta());
        System.out.printf("Corrente: R$ %.2f%n", contaCorrente.getSaldoEmConta());

        System.out.println("\n... Realizando saque de R$ 100.00 da Corrente ...");
        contaCorrente.sacar(100.0);
        System.out.printf("Saldo Final Corrente: R$ %.2f%n", contaCorrente.getSaldoEmConta());

        System.out.println("\n--- Extrato Conta Poupança ---");
        List<Transacao> historicoPoupanca = contaPoupanca.getHistoricoTransacoes();
        for (Transacao transacao : historicoPoupanca) {
            System.out.println(transacao.getTransacaoFormatada());
        }

        System.out.println("\n--- Extrato Conta Corrente ---");
        List<Transacao> historicoCorrente = contaCorrente.getHistoricoTransacoes();
        for (Transacao transacao : historicoCorrente) {
            System.out.println(transacao.getTransacaoFormatada());
        }
    }
}