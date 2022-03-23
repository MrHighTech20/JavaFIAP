public class Engenheiro extends Empregado {

    private String dept;
    private String crea;

    @Override
    public double calcSalario() {
        return this.getSalario() * 1.5;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }
}
