package Cinema;

public class IngressoFamilia extends Ingresso {

    private int numeroDePessoas = 0;

    public IngressoFamilia(double valor, String filme, boolean dublado, int numeroDePessoas) {
        super(valor, filme, dublado);
        this.numeroDePessoas = numeroDePessoas;
    }

    @Override
    public double getValorReal() {
        double valorTotal = super.getValor() * this.numeroDePessoas;

        if (this.numeroDePessoas > 3) {
            valorTotal = valorTotal * 0.95;
        }
        return valorTotal;
    }

}