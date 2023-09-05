public class Debito extends Operacao {
    public Debito(double valor) {
        super.valor = valor;
    }

    @Override
    public double operar() {
        return -super.valor;
    }
}
