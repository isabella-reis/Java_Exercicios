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

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Isabella", "123@gmail.com", "49278399203");
        Cliente cliente2 = new Cliente("Leonardo", "456@hotmail.com", "12345678901");
        Cliente cliente3 = new Cliente("Francisco", "789@outlook.com", "09876543210" );

        Atendente atendente1 = new Atendente("Filomena", "350111");
        Atendente atendente2 = new Atendente("Catarina", "350112");

        Chamado chamado1 = new Chamado(atendente1, cliente1, "Geladeira Eletrolux", Status.ABERTO);
        chamado1.gerarRelatorio();
        Chamado chamado2 = new Chamado(atendente2, cliente2, "Playstation", Status.EM_ATENDIMENTO);
        chamado2.gerarRelatorio();
        Chamado chamado3 = new Chamado(atendente2, cliente3, "Notebook Gamer", Status.FECHADO);
        chamado3.gerarRelatorio();
    }


}
