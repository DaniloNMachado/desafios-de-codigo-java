import java.util.Scanner;
import java.util.Locale;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        // --- 1. CRIAÇÃO DA CONTA ---
        System.out.println("Bem vindo ao Dan Bank");
        System.out.print("Para iniciar, por favor, faça um depósito inicial: R$ ");
        double saldo = scanner.nextDouble();

        double limiteChequeEspecial = (saldo <= 500) ? 50.0 : saldo * 0.5;
        double valorUsadoChequeEspecial = 0.0;

        System.out.printf("Conta criada com sucesso! Saldo: R$ %.2f | Cheque Especial: R$ %.2f%n", saldo,
                limiteChequeEspecial);

        // --- 2. MENU INTERATIVO ---
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n========== MENU ==========");
            System.out.println("1 - Consultar Saldo e Limites");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Pagar Boleto");
            System.out.println("5 - Verificar Uso do Cheque Especial");
            System.out.println("7 - Sair");
            System.out.print("Digite uma opção: ");
            int opcao = scanner.nextInt();
            System.out.println("==========================");

            switch (opcao) {
                // --- 3. IMPLEMENTAÇÃO DAS FUNÇÕES ---
                case 1: // Consultar Saldo
                    System.out.println("\n--- Saldo da Conta ---");
                    System.out.printf("Saldo Disponível: R$ %.2f%n", saldo);
                    System.out.printf("Limite Total do Cheque Especial: R$ %.2f%n", limiteChequeEspecial);
                    System.out.printf("Valor Utilizado do Cheque Especial: R$ %.2f%n", valorUsadoChequeEspecial);
                    System.out.printf("Cheque Especial Disponível: R$ %.2f%n",
                            limiteChequeEspecial - valorUsadoChequeEspecial);
                    break;

                case 2: // Depositar
                    System.out.print("Qual valor deseja depositar? R$ ");
                    double valorDeposito = scanner.nextDouble();

                    if (valorUsadoChequeEspecial > 0) {
                        if (valorDeposito >= valorUsadoChequeEspecial) {
                            double dividaAnterior = valorUsadoChequeEspecial;
                            double taxa = dividaAnterior * 0.20;
                            double sobraDoDeposito = valorDeposito - dividaAnterior;

                            valorUsadoChequeEspecial = 0.0;
                            saldo += sobraDoDeposito;
                            saldo -= taxa;

                            System.out.println("\nCheque especial quitado com sucesso!");
                            System.out.printf("Taxa de 20%% sobre R$ %.2f cobrada: R$ -%.2f%n", dividaAnterior, taxa);
                            System.out.printf("Novo saldo: R$ %.2f%n", saldo);
                        } else {
                            valorUsadoChequeEspecial -= valorDeposito;
                            System.out.printf("\nDepósito de R$ %.2f usado para abater a dívida do cheque especial.%n",
                                    valorDeposito);
                            System.out.printf("Valor restante da dívida: R$ %.2f%n", valorUsadoChequeEspecial);
                        }
                    } else {
                        saldo += valorDeposito;
                        System.out.printf("\nDepósito de R$ %.2f realizado com sucesso! Novo saldo: R$ %.2f%n",
                                valorDeposito, saldo);
                    }
                    break;

                case 3: // Sacar
                case 4: // Pagar Boleto (mesma lógica do saque)
                    // Define se a mensagem será "sacar" ou "pagar"
                    String acao = (opcao == 3) ? "sacar" : "pagar";
                    System.out.printf("Qual valor gostaria de %s? R$ ", acao);
                    double valorSaida = scanner.nextDouble();

                    double chequeDisponivel = limiteChequeEspecial - valorUsadoChequeEspecial;

                    if (valorSaida <= saldo) {
                        saldo -= valorSaida;
                        System.out.printf("\nOperação de R$ %.2f efetuada. Novo saldo: R$ %.2f%n", valorSaida, saldo);
                    } else if (valorSaida <= saldo + chequeDisponivel) {
                        double valorNecessarioDoCheque = valorSaida - saldo;
                        saldo = 0.0;
                        valorUsadoChequeEspecial += valorNecessarioDoCheque;
                        System.out.printf("\nOperação de R$ %.2f efetuada com uso do cheque especial.%n", valorSaida);
                        System.out.printf("Seu saldo agora é R$ %.2f e seu cheque especial utilizado é de R$ %.2f%n",
                                saldo, valorUsadoChequeEspecial);
                    } else {
                        System.out.println("\nSaldo e limite de cheque especial insuficientes.");
                    }
                    break;

                case 5: // Verificar Cheque Especial
                    if (valorUsadoChequeEspecial > 0) {
                        System.out.println("\nVocê ESTÁ usando o cheque especial.");
                        System.out.printf("Valor utilizado: R$ %.2f%n", valorUsadoChequeEspecial);
                    } else {
                        System.out.println("\nVocê NÃO está usando o cheque especial.");
                    }
                    break;

                case 7: // Sair
                    continuar = false;
                    break;

                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
                    break;
            }
        }

        System.out.println("\nObrigado por usar o Dan Bank!");
        scanner.close();
    }
}