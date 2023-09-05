public class Credito extends Operacao {
    public Credito(double valor) {
        super.valor = valor;
    }

    @Override
    public double operar() {
        return super.valor;
    }
}
