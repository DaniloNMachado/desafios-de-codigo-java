package desafios-de-codigo-java.4-Herança e Polimorfismo em Java.Produtos e Tributos;

public class ProdutoCultura extends Produto {

    public ProdutoCultura(double valor) {
        super(valor);
    }

    @Override
    public double getValorImposto() {
        return super.getValor() * 0.04;
    }
}
