public class Semestre {
    private Avaliacao av1, av2, av3, av4;
    private float peso_avaliacoes, pontos;
    private float peso_max = 7;
    private float media = 5;
    private boolean peso_valido = true;
    private boolean aprovado;

    public Semestre (Avaliacao av1, Avaliacao av2, Avaliacao av3, Avaliacao av4) {
        this.av1 = av1;
        this.av2 = av2;
        this.av3 = av3;
        this.av4 = av4;
        
        peso_avaliacoes = av1.getPeso() + av2.getPeso() + av3.getPeso() + av4.getPeso();
        if (peso_avaliacoes > peso_max) {
            System.out.println("Inválido: Peso das avaliações maior que o peso máximo do semestre!");
            peso_valido = false;
        }

        pontos = av1.getNota() + av2.getNota() + av3.getNota() + av4.getNota();

        if (pontos >= media) {
            aprovado = true;
        } else {
            aprovado = false;
        }
    }

    public float getPontos() {
        return pontos;
    }

    public float getPesoAvaliacoes() {
        return peso_avaliacoes;
    }

    public boolean getPesoValido() {
        return peso_valido;
    }

    public boolean getAprovado() {
        return aprovado;
    }

    public float getMedia() {
        return media;
    }
}
