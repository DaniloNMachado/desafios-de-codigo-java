package Hierarquia de Usuários;

public class Vendedor extends Usuario {

    private int quantidadeDeVendas = 0;
    private boolean administrador = false;

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    public void realizarVenda() {
        quantidadeDeVendas++;
    }

    public int getQuantidadeDeVendas() {
        return this.quantidadeDeVendas;
    }
}