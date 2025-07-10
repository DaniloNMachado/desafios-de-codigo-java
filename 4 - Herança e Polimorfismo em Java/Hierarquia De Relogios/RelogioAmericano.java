import java.text.SimpleDateFormat;
import java.util.Locale;

public class RelogioAmericano extends Relogio {

    public RelogioAmericano(int hora, int minuto, int segundo) {
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

    @Override
    public String getHoraFormatada() {
        int horaBase24h = super.getHora();

        int horaAmericana;
        String periodo;

        if (horaBase24h == 0) {
            horaAmericana = 12;
            periodo = "AM";
        } else if (horaBase24h == 12) {
            horaAmericana = 12;
            periodo = "PM";
        } else if (horaBase24h > 12) {
            horaAmericana = horaBase24h - 12;
            periodo = "PM";
        } else {
            horaAmericana = horaBase24h;
            periodo = "AM";
        }
        return String.format("%02d:%02d:%02d %s", horaAmericana, super.getMinuto(), super.getSegundo(), periodo);
    }
}
