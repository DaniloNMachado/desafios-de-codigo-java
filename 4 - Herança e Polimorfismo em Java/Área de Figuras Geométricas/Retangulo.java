package desafios-de-codigo-java.4-Herança e Polimorfismo em Java.Área de Figuras Geométricas;

public class Retangulo extends FormaGeometrica {

    private double base = 0;
    private double altura = 0;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return this.base * this.altura;
    }

}
