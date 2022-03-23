public class FolhaDePagamento {

    private double pagamentoTotal = 0;

    public void registrar(Empregado empregado){
        pagamentoTotal = pagamentoTotal + empregado.calcSalario();
    }

    public void login(Autenticavel autenticavel){
        if (autenticavel.autenticar("123")){
            System.out.println("Logado com sucesso!");
        }else{
            System.out.println("Falha de login.");
        }
    }

    public double GetPagamentoTotal() {
        return pagamentoTotal;
    }
}
