package POO;

public class Aplicacao {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Isabella", "123@gmail.com", "49278399203");
        Cliente cliente2 = new Cliente("Leonardo", "456@hotmail.com", "12345678901");
        Cliente cliente3 = new Cliente("Francisco", "789@outlook.com", "09876543210" );

        Atendente atendente1 = new Atendente("Filomena", "350111");
        Atendente atendente2 = new Atendente("Catarina", "350112");

        Chamado chamado1 = new Chamado(atendente1, cliente1, "Geladeira Eletrolux", Chamado.Status.ABERTO);
        chamado1.gerarRelatorio();
        Chamado chamado2 = new Chamado(atendente2, cliente2, "Playstation", Chamado.Status.EM_ATENDIMENTO);
        chamado2.gerarRelatorio();
        Chamado chamado3 = new Chamado(atendente2, cliente3, "Notebook Gamer", Chamado.Status.FECHADO);
        chamado3.gerarRelatorio();
    }

}
