import java.util.Scanner;
import java.util.Locale;

public class Petshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int nivelDaAgua = 0;
        int nivelDoShampoo = 0;
        boolean temPetNaMaquina = false;
        boolean petEstaLimpo = false;
        boolean maquinaEstaSuja = false;

        final int capacidadeDeAgua = 30;
        final int capacidadeDeShampoo = 10;

        boolean ligada = false;

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n========== PET WASH ==========");
            System.out.printf(
                    "[ Máquina: %s | Água: %d/%d L | Shampoo: %d/%d L | Pet na Máquina: %s | Máquina Suja: %s ]%n",
                    (ligada ? "Ligada" : "Desligada"), nivelDaAgua, capacidadeDeAgua, nivelDoShampoo,
                    capacidadeDeShampoo,
                    (temPetNaMaquina ? "Sim" : "Não"), (maquinaEstaSuja ? "Sim" : "Não"));
            System.out.println("---------------------------------------");
            System.out.println("0 - Ligar a máquina");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer com água");
            System.out.println("3 - Abstecer com shampoo");
            System.out.println("4 - Verificar nível de água");
            System.out.println("5 - Verificar nível de shampoo");
            System.out.println("6 - Verrificar se tem pet no banho");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar máquina");
            System.out.println("10 - Sair e Desligar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            System.out.println("---------------------------------------");

            switch (opcao) {
                case 0:
                    if (ligada) {
                        System.out.println("AVISO: A máquina já está ligada. Vamos continuar!");
                    } else {
                        ligada = true;
                        System.out.println("Máquina ligada. Hora do banho!");
                    }
                    break;

                case 1:
                    if (!ligada) {
                        System.out.println("AVISO: Ligue a máquina antes de colocar um pet.");
                    } else if (!temPetNaMaquina) {
                        System.out.println("AVISO: Não há nenhum pet na máquina para dar banho.");
                    } else if (petEstaLimpo) {
                        System.out.println("AVISO: O pet já está limpo!");
                    } else if (nivelDaAgua >= 10) {
                        System.out.printf("AVISO: Nível de água insuficiente. Necessário: 10L / Atual: %dL%n",
                                nivelDaAgua);
                    } else if (nivelDoShampoo >= 2) {
                        System.out.printf("AVISO: Nível de shampoo insuficiente. Necessário: 2L / Atual: %dL%n",
                                nivelDoShampoo);
                    } else {
                        System.out.println("Iniciando o banho... Bzzzt... Splash!");
                        nivelDaAgua -= 10;
                        nivelDoShampoo -= 2;
                        petEstaLimpo = true;
                        System.out.println("Banho finalizado! O pet está limpo.");
                    }
                    break;

                case 2:
                    if (ligada) {
                        if (nivelDaAgua < 30) {
                            nivelDaAgua = Math.min(nivelDaAgua + 2, 30);
                            System.out.printf("Abastecendo... Nível da água: %d litros.%n", nivelDaAgua);
                        } else {
                            System.out.println("AVISO: Tanque de água já está cheio.");
                        }
                    } else {
                        System.out.println("AVISO: Ligue a máquina antes de abastecer.");
                    }
                    break;

                case 3:
                    if (ligada) {
                        if (nivelDoShampoo < 10) {
                            nivelDoShampoo = Math.min(nivelDoShampoo + 2, 10);
                            System.out.printf("Abastecendo... Nível de Shampoo: %d litros.%n", nivelDoShampoo);
                        } else {
                            System.out.println("AVISO: Tanque de shampoo já está cheio.");
                        }
                    } else {
                        System.out.println("AVISO: Ligue a máquina antes de abastecer.");
                    }
                    break;

                case 4:
                    System.out.printf("Nível da Água: %d litro(s)\n", nivelDaAgua);
                    break;

                case 5:
                    System.out.printf("Nível de Shampoo: %d litros \n", nivelDoShampoo);
                    break;

                case 6:
                    if (temPetNaMaquina) {
                        System.out.println("Sim, há um pet na máquina.");
                    } else {
                        System.out.println("Não, a máquina está vazia.");
                    }
                    break;

                case 7:
                    if (!ligada) {
                        System.out.println("AVISO: Ligue a máquina antes de colocar um pet.");
                    } else if (temPetNaMaquina) {
                        System.out.println("AVISO: Já existe um pet na máquina. Retire-o primeiro.");
                    } else if (maquinaEstaSuja) {
                        System.out.println(
                                "AVISO: A máquina está suja e precisa ser limpa antes de receber um novo pet.");
                    } else {
                        temPetNaMaquina = true;
                        petEstaLimpo = false;
                        System.out.println("Pet inserido na máquina. Pronto para o banho!");
                    }
                    break;

                case 8:
                    if (temPetNaMaquina) {
                        if (!petEstaLimpo) {
                            maquinaEstaSuja = true;
                            System.out.println("Pet sujo foi retirado. A máquina agora precisa ser limpa!");
                        } else {
                            System.out.println("Pet limpo retirado com sucesso!");
                        }
                        temPetNaMaquina = false;
                    } else {
                        System.out.println("AVISO: Não há nenhum pet na máquina para ser retirado.");
                    }
                    break;

                case 10:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        System.out.println("Bom trabalho! Até a próxima!");
        scanner.close();
    }
}
