package desafios-de-codigo-java.4-Herança e Polimorfismo em Java.Área de Figuras Geométricas;

public class Circulo extends FormaGeometrica {

    private double raio = 0;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * this.raio * this.raio;
    }

}
