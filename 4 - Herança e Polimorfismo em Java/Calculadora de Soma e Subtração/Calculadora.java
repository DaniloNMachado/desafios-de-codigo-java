import java.util.Scanner;
import java.util.Locale;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- Calculadora ---");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite os números para somar, separados por vírgula: ");
                    scanner.nextLine(); // Limpa o buffer
                    String numerosParaSoma = scanner.nextLine();

                    String[] arrayDeNumerosSoma = numerosParaSoma.split(",");
                    int somaTotal = 0;

                    for (String numeroEmTexto : arrayDeNumerosSoma) {
                        // O 'if' aqui garante que não tentemos converter um texto vazio
                        if (!numeroEmTexto.trim().isEmpty()) {
                            int numero = Integer.parseInt(numeroEmTexto.trim());
                            somaTotal += numero;
                        }
                    }
                    System.out.println("O resultado da soma é: " + somaTotal);
                    break;

                case 2:
                    System.out.print("Digite os números para subtrair, separados por vírgula: ");
                    scanner.nextLine();
                    String numerosParaSubtrair = scanner.nextLine();

                    String[] arrayDeNumerosSubtracao = numerosParaSubtrair.split(",");

                    if (arrayDeNumerosSubtracao.length > 0 && !arrayDeNumerosSubtracao[0].isEmpty()) {

                        int subtracaoTotal = Integer.parseInt(arrayDeNumerosSubtracao[0].trim());

                        for (int i = 1; i < arrayDeNumerosSubtracao.length; i++) {
                            int numero = Integer.parseInt(arrayDeNumerosSubtracao[i].trim());
                            subtracaoTotal -= numero;
                        }
                        System.out.println("O resultado da subtração é: " + subtracaoTotal);

                    } else {

                        System.out.println("Nenhum número foi digitado.");
                    }
                    break;

                case 3:
                    continuar = false;
                    System.out.println("Encerrando a calculadora...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        scanner.close();
    }
}