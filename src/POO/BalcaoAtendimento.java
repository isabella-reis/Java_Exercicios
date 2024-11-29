package POO;

import java.util.Date;

public class BalcaoAtendimento {

    private Atendente atendente;

    private int numBalcao;
    private String nomeLoja;
    private int qtdDeAtendimentos;
    private Date dataEHoraAtendimento; // LocalDateTime e LocalDateTime.now()

    public BalcaoAtendimento (Atendente atendente, int numBalcao, String nomeLoja, int qtdDeAtendimentos, Date dataEHoraAtendimento) {
        this.atendente = atendente;
        this.numBalcao = numBalcao;
        this.nomeLoja = nomeLoja;
        this.qtdDeAtendimentos = qtdDeAtendimentos;
        this.dataEHoraAtendimento = dataEHoraAtendimento;
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

    public Date getDataEHoraAtendimento() {
        return dataEHoraAtendimento;
    }


    public void inserirDataEHora () {

    }

    public static void main(String[] args) {

    }
}
