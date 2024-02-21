public class Calculo {
    //private final double totalSalario;
    private boolean declarado = false;
    private double totalSalario;

    public void calculaSalario (double salarioBase, double horasTrabalhadas) {
        if (!declarado) {
            this.totalSalario = salarioBase * horasTrabalhadas;
            this.declarado = true;
        }
    }

    public double getTotalSalario () {
        return this.totalSalario;
    }

    public static void main (String args[]) {
        Calculo teste = new Calculo();

        teste.calculaSalario(250, 75);
        System.out.println(teste.getTotalSalario());

        teste.calculaSalario(1000000, 10000);
        System.out.println(teste.getTotalSalario()); // Não pode ser alterado após declarado com calculaSalario()
    }
}
