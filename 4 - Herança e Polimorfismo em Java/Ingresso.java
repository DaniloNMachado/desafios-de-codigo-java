public class Ingresso {

    private double valor = 0;
    private String filme = "";
    private boolean dublado = true;

    public Ingresso(double valor, String filme, boolean dublado) {
        this.valor = valor;
        this.filme = filme;
        this.dublado = dublado;
    }

    public double getValor() {
        return this.valor;
    }

    public String getFilme() {
        return this.filme;
    }

    public boolean isDublado() {
        return this.dublado;
    }

    public double getValorReal() {
        return this.getValor();
    }
}