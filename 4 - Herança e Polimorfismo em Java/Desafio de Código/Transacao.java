import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public record Transacao(String tipo, double valor, LocalDateTime dataHora) {

    public String getTransacaoFormatada() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String valorFormatado = String.format("R$ %.2f", this.valor);

        return String.format("%-25s | %s | %s",
                this.tipo,
                this.dataHora.format(formatador),
                valorFormatado);
    }
}