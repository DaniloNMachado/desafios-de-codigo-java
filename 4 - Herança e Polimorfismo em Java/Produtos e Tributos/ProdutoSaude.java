package desafios-de-codigo-java.4-Herança e Polimorfismo em Java.Produtos e Tributos;

public class ProdutoSaude extends Produto {

    public ProdutoSaude(double valor) {
        super(valor);
    }

    @Override
    public double getValorImposto() {
        return super.getValor() * 0.015;
    }
}
