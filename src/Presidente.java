public final class Presidente extends Empregado implements Autenticavel {

    private double valorCota;
    private String senha = "123";

    @Override
    public double calcSalario() {
        return this.getSalario() + this.valorCota;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha == senha;
    }

    public double getValorCota() {
        return valorCota;
    }

    public void setValorCota(double valorCota) {
        this.valorCota = valorCota;
    }
}
