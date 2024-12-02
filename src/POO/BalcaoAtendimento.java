package POO;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class BalcaoAtendimento {

    private Atendente atendente;

    private int numBalcao;
    private String nomeLoja;
    private int qtdDeAtendimentos;
    private String dataEHoraAtendimento;

    public BalcaoAtendimento (Atendente atendente, int numBalcao, String nomeLoja, int qtdDeAtendimentos, String dataEHoraAtendimento) {
        this.atendente = atendente;
        this.numBalcao = numBalcao;
        this.nomeLoja = nomeLoja;
        this.qtdDeAtendimentos = qtdDeAtendimentos;
        this.dataEHoraAtendimento = dataEHora();
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public int getNumBalcao() {
        return numBalcao;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public int getQtdDeAtendimentos() {
        return qtdDeAtendimentos;
    }

    public String getDataEHoraAtendimento() {
        return dataEHoraAtendimento;
    }


    public String dataEHora () {
        LocalDateTime dataEHora = LocalDateTime.now();
        DateTimeFormatter formatarDtEHr = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String dataEHoraFormatada = dataEHora.format(formatarDtEHr);

        return dataEHoraFormatada;
    }

    public static void main(String[] args) {

    }
}
