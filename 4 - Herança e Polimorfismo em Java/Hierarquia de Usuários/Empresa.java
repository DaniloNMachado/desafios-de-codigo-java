package Hierarquia de Usuários;

public class Empresa {
    public static void main(String[] args) {
 
        Gerente gerente = new Gerente("Ana", "ana@email.com", "senha123");
        Vendedor vendedor = new Vendedor("Carlos", "carlos@email.com", "vendas456");
        Atendente atendente = new Atendente("Beatriz", "bia@email.com", "atende789");

        System.out.println("--- Testando Funções ---");
        
        gerente.realizarLogin();
        gerente.gerarRelatorioFinanceiro();
        System.out.println("Gerente é admin? " + gerente.isAdministrador());

        System.out.println("--------------------");

        vendedor.realizarVenda();
        vendedor.realizarVenda();
        System.out.println("Vendas do " + vendedor.getNome() + ": " + vendedor.getQuantidadeDeVendas());

        System.out.println("--------------------");

        atendente.receberPagamento(50.25);
        atendente.receberPagamento(100.00);
        atendente.fecharCaixa();
    }
}