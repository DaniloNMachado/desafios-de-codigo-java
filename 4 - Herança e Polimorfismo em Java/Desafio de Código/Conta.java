import java.util.List;
import java.util.ArrayList;

public abstract class Conta {

    private String numeroDaConta;
    private String numeroDaAgencia;
    private double saldoEmConta = 0;

    private List<Transacao> historicoTransacoes;

    public Conta(String numeroDaConta, String numeroDaAgencia, double saldoEmConta) {
        this.numeroDaConta = numeroDaConta;
        this.numeroDaAgencia = numeroDaAgencia;
        this.saldoEmConta = saldoEmConta;
        this.historicoTransacoes = new ArrayList<>();
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getNumeroDaAgencia() {
        return numeroDaAgencia;
    }

    public double getSaldoEmConta() {
        return saldoEmConta;
    }

    protected void setSaldoEmConta(double saldoEmConta) {
        this.saldoEmConta = saldoEmConta;
    }

    public List<Transacao> getHistoricoTransacoes() {
        return historicoTransacoes;
    }

    public abstract void transferir(Conta contaDestino, double transferirValor);

    public abstract void depositar(double depositarValor);

    public abstract boolean sacar(double sacarValor);

}
