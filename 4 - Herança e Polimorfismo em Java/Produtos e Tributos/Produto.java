package desafios-de-codigo-java.4-Herança e Polimorfismo em Java.Produtos e Tributos;

public abstract class Produto {

    private double valor;

    public Produto(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }

    public abstract double getValorImposto();
}
