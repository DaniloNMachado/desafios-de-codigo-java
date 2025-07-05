public class IngressoMeiaEntrada extends Ingresso {

    public IngressoMeiaEntrada(double valor, String filme, boolean dublado) {
        super(valor, filme, dublado);
    }

    @Override
    public double getValorReal() {
        return super.getValor() / 2.0;
    }
}
