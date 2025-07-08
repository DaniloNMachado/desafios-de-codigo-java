package Hierarquia de Usuários;

public class Gerente extends Usuario {

    private boolean administrador = true;

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    public boolean isAdministrador() {
        return this.administrador;
    }

    public void gerarRelatorioFinanceiro() {
        System.out.println("Gerando relatório financeiro completo...");
    }
}