public class Credito extends Operacao {
    public Credito(double valor) {
        super.setValor(valor);
    }

    @Override
    public double operar() {
        return super.getValor();
    }
}
