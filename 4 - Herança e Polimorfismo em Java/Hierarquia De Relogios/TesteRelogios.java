package desafios-de-codigo-java.4-Herança e Polimorfismo em Java.Hierarquia De Relogios;

public class TesteRelogios {

    public static void main(String[] args) {

        System.out.println("--- Criando os Relógios ---");

        Relogio relogioBR = new RelogioBrasileiro(23, 59, 55);

        Relogio relogioEUA = new RelogioAmericano(10, 30, 0);

        System.out.println("Hora no Brasil: " + relogioBR.getHoraFormatada());
        System.out.println("Hora nos EUA: " + relogioEUA.getHoraFormatada());

        System.out.println("\n--- Sincronizando os Relógios ---");

        relogioEUA.sincronizar(relogioBR);

        System.out.println("Nova hora nos EUA após sincronizar: " + relogioEUA.getHoraFormatada());
    }
}