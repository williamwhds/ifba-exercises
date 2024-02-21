public class Prova extends Avaliacao{
    public Prova (float peso, float[] pesos, float[] notas) {
        super(peso, pesos, notas);
    }

    public Prova (float peso, float nota) {
        super(peso, nota);
    }

    public float getNota() {
        return super.getNota();
    }

    public float getPeso() {
        return super.getPeso();
    }
}
