import java.util.ArrayList;

public class Avaliacao {
    private ArrayList<Float> notas = new ArrayList<>(); // Listas dinâmica para acomodar várias notas e pesos
    private ArrayList<Float> pesos = new ArrayList<>(); 
    private float soma_peso, soma_nota, peso, nota;

    public Avaliacao(float peso, float[] pesos, float[] notas) {
        this.peso = peso;
        for (int i = 0; i < pesos.length; i++) {
            this.notas.add(notas[i]);
            this.pesos.add(pesos[i]);
            soma_nota += notas[i];
            soma_peso += pesos[i];
        }

        // Regra de 3 para calcular a nota final
        nota = (soma_nota * peso) / soma_peso;
    }

    public Avaliacao (float peso, float nota) {
        this.peso = peso;
        this.nota = nota;
    }
    
    public float getNota() {
        return nota;
    }
    
    public float getPeso() {
        return peso;
    }

    public static void main(String[] args) {
        float av1_peso = 1;                     // Peso da avaliação
        float[] av1_pesos = {2, 2, 2, 4};       // 3 notas valendo 2 e 1 nota valendo 4
        float[] av1_notas = {1, 1, 1.5f, 4};    // Notas de um aluno

        Avaliacao av = new Avaliacao(av1_peso, av1_pesos, av1_notas);
        System.out.println(av.getNota());
        System.out.println(av.getPeso());
    }
}
