public class Trabalho extends Avaliacao {
    public Trabalho (float peso, float[] pesos, float[] notas) {
        super(peso, pesos, notas);
    }

    public Trabalho (float peso, float nota) {
        super(peso, nota);
    }

    public float getNota() {
        return super.getNota();
    }

    public float getPeso() {
        return super.getPeso();
    }
}
