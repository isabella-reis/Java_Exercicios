package POO;

import javax.swing.text.DefaultStyledDocument;

public class Chamado implements Relatorio {

    public enum Status {
        ABERTO,
        FECHADO,
        EM_ATENDIMENTO
    }
    private Atendente atendente;
    private Cliente cliente;
    private String nomeProduto;
    private Status status;


    public Chamado(Atendente atendente, Cliente cliente, String nomeProduto, Status status) {
        this.atendente = atendente;
        this.cliente = cliente;
        this.nomeProduto = nomeProduto;
        this.status = status;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("------ Relatorio de Chamado -------");
        System.out.println("PRODUTO: " + nomeProduto);
        System.out.println("STATUS: " + status);
        System.out.println("ATENDENTE: " + atendente.getNome());
    }

}
