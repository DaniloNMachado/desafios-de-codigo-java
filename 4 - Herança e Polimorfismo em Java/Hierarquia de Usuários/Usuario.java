public class Usuario {

    private String nome = "";
    private String email = "";
    private String senha = "";

    public Usuario(String nome, String email, String senha) {
        this.name = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getSenha() {
        return this.senha;
    }

    public void getRealizarLogin() {
        System.out.println("O usuário " + this.nome + " realizou login com sucesso!");
    }
}
