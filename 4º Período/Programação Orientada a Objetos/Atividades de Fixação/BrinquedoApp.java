public class BrinquedoApp {
    public static void main(String[] args) {
        Brinquedo helicoptero = new Helicoptero();
        ControleRemoto cr1 = new ControleRemoto(helicoptero);

        cr1.mover();

        Brinquedo navio = new Navio();
        ControleRemoto cr2 = new ControleRemoto(navio);

        cr2.mover();

        Brinquedo caminhao = new Caminhao();
        ControleRemoto cr3 = new ControleRemoto(caminhao);

        cr3.mover();
    }
}