public class RH {
    public static void main(String[] args){
        Engenheiro engenheiro = new Engenheiro();
        engenheiro.setSalario(5000);
        System.out.println(engenheiro.calcSalario());

        Gerente gerente = new Gerente();
        gerente.setSalario(3000);
        gerente.setBonus(500);
        System.out.println(gerente.calcSalario());

        Presidente presidente = new Presidente();
        presidente.setSalario(10000);
        presidente.setValorCota(3000);
        System.out.println(presidente.calcSalario());

    }
}

