package desafios-de-codigo-java.4-Herança e Polimorfismo em Java.Área de Figuras Geométricas;

public class Geometria {
    public static void main(String[] args) {

        Quadrado meuQuadrado = new Quadrado(10.0);
        Retangulo meuRetangulo = new Retangulo(10.0, 5.0);
        Circulo meuCirculo = new Circulo(10.0);

        System.out.println("--- Calculando Áreas ---");
        System.out.printf("Área do Quadrado de lado 10: %.2f%n", meuQuadrado.calcularArea());
        System.out.printf("Área do Retângulo de 10x5: %.2f%n", meuRetangulo.calcularArea());
        System.out.printf("Área do Círculo de raio 10: %.2f%n", meuCirculo.calcularArea());
    }
}
