package POO;

import java.util.ArrayList;
import java.util.List;

public class Aplicacao {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Isabella", "123@gmail.com", "49278399203"));
        clientes.add(new Cliente("Leonardo", "456@hotmail.com", "12345678901"));
        clientes.add(new Cliente("Francisco", "789@outlook.com", "09876543210" ));

        List<Atendente> atendentes = new ArrayList<>();
        atendentes.add(new Atendente("Filomena", "350111"));
        atendentes.add(new Atendente("Catarina", "350112"));

        // Relatórios de balcao
        BalcaoAtendimento balcao01 = new BalcaoAtendimento(atendentes.get(0), 1, "Loja A", 2);
        balcao01.gerarRelatorio();

        // Relatorios de chamado
        Chamado chamado1 = new Chamado(atendentes.get(0), clientes.get(0), "Geladeira Eletrolux", Chamado.Status.ABERTO);
        chamado1.gerarRelatorio();
        Chamado chamado2 = new Chamado(atendentes.get(1), clientes.get(1), "Playstation", Chamado.Status.EM_ATENDIMENTO);
        chamado2.gerarRelatorio();
        Chamado chamado3 = new Chamado(atendentes.get(0), clientes.get(2), "Notebook Gamer", Chamado.Status.FECHADO);
        chamado3.gerarRelatorio();
    }

}
