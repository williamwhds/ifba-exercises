public abstract class Operacao {
    private double valor;
    
    public Operacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public abstract double operar();
}