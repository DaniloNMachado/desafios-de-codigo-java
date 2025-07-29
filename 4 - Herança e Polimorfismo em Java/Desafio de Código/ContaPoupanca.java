import java.time.LocalDateTime;

public class ContaPoupanca extends Conta {

    private double taxaDeJuros;

    public ContaPoupanca(String numeroDaConta, String numeroDaAgencia, double saldoEmConta, double taxaDeJuros) {
        super(numeroDaConta, numeroDaAgencia, saldoEmConta);
        this.taxaDeJuros = taxaDeJuros;
    }

    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    @Override
    public void transferir(Conta contaDestino, double transferirValor) {
        boolean saqueRealizado = this.sacar(transferirValor);
        if (saqueRealizado) {
            contaDestino.depositar(transferirValor);
            System.out.println("Transferência de R$ " + transferirValor + " realizada com sucesso para a conta "
                    + contaDestino.getNumeroDaConta());
        } else {
            System.out.println("Transferência falhou. Saldo insuficiente.");
        }
    }

    @Override
    public void depositar(double depositarValor) {

        setSaldoEmConta(getSaldoEmConta() + depositarValor);

        getHistoricoTransacoes().add(new Transacao("Depósito", depositarValor, LocalDateTime.now()));

        System.out.printf("Depósito de R$ %.2f realizado com sucesso. Novo saldo: R$ %.2f%n", depositarValor,
                getSaldoEmConta());
    }

    @Override
    public boolean sacar(double sacarValor) {
        if (sacarValor <= getSaldoEmConta()) {
            setSaldoEmConta(getSaldoEmConta() - sacarValor);
            System.out.println("Saque de R$ " + sacarValor + " realizado com sucesso.");
            getHistoricoTransacoes().add(new Transacao("Saque", sacarValor, LocalDateTime.now()));
            System.out.printf("Novo saldo: R$ %.2f%n", getSaldoEmConta());
            return true;
        } else {
            System.out.println("Saldo insuficiente para saque.");
            return false;
        }
    }

}
