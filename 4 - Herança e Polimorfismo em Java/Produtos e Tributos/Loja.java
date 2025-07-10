package desafios-de-codigo-java.4-Herança e Polimorfismo em Java.Produtos e Tributos;

public class Loja {
    public static void main(String[] args) {

        ProdutoAlimentacao arroz = new ProdutoAlimentacao(100.0);
        System.out.printf("Imposto do Arroz (Alimentação): R$ %.2f%n", arroz.getValorImposto());
        ProdutoCultura parque = new ProdutoCultura(100.0);
        System.out.printf("Imposto do Parque (Cultura): R$ %.2f%n", parque.getValorImposto());
        ProdutoSaude convenio = new ProdutoSaude(100.0);
        System.out.printf("Imposto do Convênio (Saúde): R$ %.2f%n", convenio.getValorImposto());
        ProdutoVestuario camisa = new ProdutoVestuario(100.0);
        System.out.printf("Imposto do Vestuário (Vestuário): R$ %.2f%n", camisa.getValorImposto());

    }
}
