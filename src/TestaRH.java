public class TestaRH {

    public static void main(String[] args) {
        FolhaDePagamento folhaDePagamento = new FolhaDePagamento();

        Presidente presidente = new Presidente();
        presidente.setSalario(10000);

        Gerente gerente = new Gerente();
        gerente.setSalario(5000);

        Engenheiro engenheiro = new Engenheiro();
        engenheiro.setSalario(7000);

        folhaDePagamento.registrar(presidente);
        folhaDePagamento.registrar(gerente);
        folhaDePagamento.registrar(engenheiro);

        folhaDePagamento.login(presidente);
        Cliente cliente = new Cliente();
        folhaDePagamento.login(cliente);

    }
}
