public class RelogioBrasileiro extends Relogio {

    public RelogioBrasileiro(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }

    @Override
    public void sincronizar(Relogio outRelogio) {
        int novaHora = outRelogio.getHora();
        int novoMinuto = outRelogio.getMinuto();
        int novoSegundo = outRelogio.getSegundo();

        this.setHora(novaHora);
        this.setMinuto(novoMinuto);
        this.setSegundo(novoSegundo);
    }
}
