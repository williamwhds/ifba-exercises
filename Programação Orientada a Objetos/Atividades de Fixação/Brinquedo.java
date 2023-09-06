public abstract class Brinquedo {
    protected double velocidade;
    protected double aceleracao;

    public double getAceleracao() {
        return aceleracao;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public abstract void mover();

    public void velocidade (int vel) {
        this.velocidade += vel;
    }

    public void  velocidade (double vel) {
        this.velocidade += vel;
    }

    public void velocidade (double vel, double acel){
        this.velocidade += vel;
        this.aceleracao += acel;
    }
}
