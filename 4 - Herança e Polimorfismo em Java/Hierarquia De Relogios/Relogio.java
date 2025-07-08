import java.util.Scanner;

public abstract class Relogio {

    private int hora;
    private int minuto;
    private int segundo;

    public Relogio(int hora, int minuto, int segundo) {
        this.hora(hora);
        this.minuto(minuto);
        this.segundo(segundo);
    }

    public void setHora(int novaHora) {
        if (novaHora >= 0 && novaHora < 24) {
            this.hora = novaHora;
        } else {
            System.out.println("ERRO: Hora inválida. O valor deve estar entre 0 e 23.");
        }
    }

    public void setMinuto(int novoMinuto) {
        if (novoMinuto >= 0 && novoMinuto < 60) {
            this.minuto = novoMinuto;
        } else {
            System.out.println("ERRO: Minuto inválido. O valor deve estar entre 0 e 59.");
        }
    }

    public void setSegundo(int novoSegundo) {
        if (novoSegundo >= 0 && novoSegundo < 60) {
            this.segundo = novoSegundo;
        } else {
            System.out.println("ERRO: Segundo inválido. O valor deve estar entre 0 e 59.");
        }
    }

    public int getHora() {
        return this.hora;
    }

    public int getMinuto() {
        return this.minuto;
    }

    public int getSegundo() {
        return this.segundo;
    }

    public String getHoraFormatada() {
        return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
    }

    public abstract void sincronizar(Relogio outroRelogio);

}
