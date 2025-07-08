// Arquivo: Cinema.java
public class Cinema {
    public static void main(String[] args) {

        System.out.println("--- Ingresso Meia-Entrada ---");
        IngressoMeiaEntrada ingressoMeia = new IngressoMeiaEntrada(50.0, "Divertidamente 2", true);

        double valorRealMeia = ingressoMeia.getValorReal();

        System.out.printf("Filme: %s (Dublado: %s)%n", ingressoMeia.getNomeFilme(), ingressoMeia.isDublado());
        System.out.printf("Valor a pagar: R$ %.2f%n", valorRealMeia);

        System.out.println("\n--- Ingresso Família ---");
        IngressoFamilia ingressoFamilia = new IngressoFamilia(50.0, "Divertidamente 2", true, 4);
        double valorRealFamilia = ingressoFamilia.getValorReal();

        System.out.printf("Filme: %s (Dublado: %s)%n", ingressoFamilia.getNomeFilme(), ingressoFamilia.isDublado());
        System.out.printf("Valor a pagar (4 pessoas com 5%% de desconto): R$ %.2f%n", valorRealFamilia);
    }
}