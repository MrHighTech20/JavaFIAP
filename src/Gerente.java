public class Gerente extends Empregado implements Autenticavel {

    private String area;
    private double bonus;
    private String senha = "123";

    @Override
    public double calcSalario() {
        return this.getSalario() + this.bonus;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha == senha;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
