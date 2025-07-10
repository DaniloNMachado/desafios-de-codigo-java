package desafios-de-codigo-java.4-Herança e Polimorfismo em Java.Produtos e Tributos;

public class ProdutoVestuario extends Produto {

    public ProdutoVestuario(double valor) {
        super(valor);
    }

    @Override
    public double getValorImposto() {
        return super.getValor() * 0.025;
    }
}