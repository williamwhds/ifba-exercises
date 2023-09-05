public class Debito extends Operacao {
    public Debito(double valor) {
        super.setValor(valor);
    }

    @Override
    public double operar() {
        return -super.getValor();
    }
}
