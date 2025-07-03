import java.util.Scanner;
import java.util.Locale;

public class Carro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        boolean ligado = false;
        int marcha = 0;
        int velocidade = 0;

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n========== PAINEL DO CARRO ==========");
            System.out.printf("[ Estado: %s | Velocidade: %d km/h | Marcha: %dª ]%n", (ligado ? "Ligado" : "Desligado"),
                    velocidade, marcha);
            System.out.println("---------------------------------------");
            System.out.println("1 - Ligar o carro");
            System.out.println("2 - Desligar o carro");
            System.out.println("3 - Acelerar o carro");
            System.out.println("4 - Diminuir a velocidade");
            System.out.println("5 - Troca de Marcha");
            System.out.println("6 - Virar");
            System.out.println("7 - Sair do carro");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            System.out.println("---------------------------------------");

            switch (opcao) {
                case 1:
                    if (ligado) {
                        System.out.println("O carro já está ligado.");
                    } else {
                        ligado = true;
                        System.out.println("Carro ligado. VRUM VRUM!");
                    }
                    break;
                case 2:
                    if (ligado) {
                        if (velocidade == 0 && marcha == 0) {
                            ligado = false;
                            System.out.println("O carro desligado.");
                        } else {
                            System.out.println(
                                    "AVISO: Para desligar, o carro deve estar parado (0 km/h) e em ponto morto (marcha 0).");
                        }
                    } else {
                        System.out.println("O carro já está desligado.");
                    }
                    break;
                case 3:
                    if (!ligado) {
                        System.out.println("Para acelerar, primeiro ligue o carro.");
                    } else if (marcha == 0) {
                        System.out.println("AVISO: Não é possível acelerar em ponto morto.");
                    } else {
                        int limiteDaMarcha = 0;
                        if (marcha == 1) {
                            limiteDaMarcha = 20;
                        } else if (marcha == 2) {
                            limiteDaMarcha = 40;
                        } else if (marcha == 3) {
                            limiteDaMarcha = 60;
                        } else if (marcha == 4) {
                            limiteDaMarcha = 80;
                        } else if (marcha == 5) {
                            limiteDaMarcha = 100;
                        } else if (marcha == 6) {
                            limiteDaMarcha = 120;
                        }
                        if (velocidade < limiteDaMarcha) {
                            velocidade++;
                            System.out.printf("Acelerando... Velocidade atual: %d km/h%n", velocidade);
                        } else {
                            System.out.println("AVISO: Limite de velocidade para a marcha " + marcha + " ("
                                    + limiteDaMarcha + " km/h) atingido. Troque de marcha para acelerar mais.");
                        }
                    }
                    break;
                case 4:
                    if (!ligado) {
                        System.out.println("AVISO: O carro está desligado e não pode ser desacelerado.");
                    } else if (velocidade > 0) {
                        velocidade--;
                        System.out.printf("Reduzindo... Velocidade atual: %d km/h%n", velocidade);
                    } else {
                        System.out.println("O carro já está parado (0 km/h).");
                    }
                    break;
                case 5:
                    if (ligado) {
                        System.out.print("Para qual marcha você deseja ir (0-6)? ");
                        int novaMarcha = scanner.nextInt();
                        if (novaMarcha >= 0 && novaMarcha <= 6) {

                            boolean trocaPermitida = false;

                            if (novaMarcha == 0) {
                                trocaPermitida = true;
                            } else if (novaMarcha == 1 && velocidade >= 0 && velocidade <= 20) {
                                trocaPermitida = true;
                            } else if (novaMarcha == 2 && velocidade >= 20 && velocidade <= 40) {
                                trocaPermitida = true;
                            } else if (novaMarcha == 3 && velocidade >= 40 && velocidade <= 60) {
                                trocaPermitida = true;
                            } else if (novaMarcha == 4 && velocidade >= 60 && velocidade <= 80) {
                                trocaPermitida = true;
                            } else if (novaMarcha == 5 && velocidade >= 80 && velocidade <= 100) {
                                trocaPermitida = true;
                            } else if (novaMarcha == 6 && velocidade >= 100 && velocidade <= 120) {
                                trocaPermitida = true;
                            }

                            if (trocaPermitida) {
                                marcha = novaMarcha;
                                System.out.println("Marcha trocada para a " + marcha + "ª.");
                            } else {
                                System.out.println("ERRO: A velocidade atual (" + velocidade
                                        + " km/h) não é compatível para engatar a " + novaMarcha + "ª marcha.");
                            }
                        } else {
                            System.out.println("ERRO: Marcha inválida. Escolha de 0 a 6.");
                        }
                    } else {
                        System.out.println("Ligue o carro antes de trocar a marcha.");
                    }
                    break;

                case 6:

                    if (ligado) {

                        if (velocidade >= 1 && velocidade <= 40) {
                            System.out.println("Carro virando com segurança.");
                        } else {
                            if (velocidade == 0) {
                                System.out.println("AVISO: O carro precisa estar em movimento para virar.");
                            } else {
                                System.out.println("AVISO: Velocidade muito alta (" + velocidade
                                        + " km/h) para virar com segurança.");
                            }
                        }
                    } else {
                        System.out.println("Ligue o carro antes de tentar virar.");
                    }
                    break;
                case 7:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        System.out.println("\nVocê saiu do carro. Programa encerrado.");
        scanner.close();
    }

}
