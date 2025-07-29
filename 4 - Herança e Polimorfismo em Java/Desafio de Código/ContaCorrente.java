import java.time.LocalDateTime;

public class ContaCorrente extends Conta {

    private double limiteEspecial;

    public ContaCorrente(String numeroDaConta, String numeroDaAgencia, double saldoEmConta, double limiteEspecial) {
        super(numeroDaConta, numeroDaAgencia, saldoEmConta);
        this.limiteEspecial = limiteEspecial;
    }

    public double getLimiteEspecial() {
        return this.limiteEspecial;
    }

    @Override
    public void depositar(double depositarValor) {
        setSaldoEmConta(getSaldoEmConta() + depositarValor);
        getHistoricoTransacoes().add(new Transacao("Depósito", depositarValor, LocalDateTime.now()));
    }

    @Override
    public boolean sacar(double sacarValor) {
        if (sacarValor <= getSaldoEmConta() + this.limiteEspecial) {
            setSaldoEmConta(getSaldoEmConta() - sacarValor);
            getHistoricoTransacoes().add(new Transacao("Saque", sacarValor, LocalDateTime.now()));
            return true;
        } else {
            System.out.println("Saldo e limite de cheque especial insuficientes.");
            return false;
        }
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        boolean saqueRealizado = this.sacar(valor);

        if (saqueRealizado) {
            contaDestino.depositar(valor);
            System.out.println("Transferência realizada com sucesso.");
        } else {
            System.out.println("Transferência não realizada. Saldo insuficiente.");
        }
    }
}