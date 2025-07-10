package desafios-de-codigo-java.4-Herança e Polimorfismo em Java.Área de Figuras Geométricas;

public class Quadrado extends FormaGeometrica {

    private double lado = 0;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }
}
