public abstract class Empregado {

    private int id;
    private String nome;
    private double salBase;

    public double calcSalario() {
        return salBase;
    }

    public double getSalario() {
        return salBase;
    }

    public void setSalario(double salBase) {
        this.salBase = salBase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
