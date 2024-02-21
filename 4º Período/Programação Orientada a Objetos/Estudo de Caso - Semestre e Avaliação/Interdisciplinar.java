public class Interdisciplinar extends Avaliacao{
    public Interdisciplinar (float peso, float[] pesos, float[] notas) {
        super(peso, pesos, notas);
    }

    public Interdisciplinar (float peso, float nota) {
        super(peso, nota);
    }

    public float getNota() {
        return super.getNota();
    }

    public float getPeso() {
        return super.getPeso();
    }
}
