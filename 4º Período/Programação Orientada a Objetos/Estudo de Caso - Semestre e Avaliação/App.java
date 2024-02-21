public class App {
    public static void main(String[] args) {
        // Duas provas de peso 2
        Avaliacao prova1 = new Prova(2, 2); 
        Avaliacao prova2 = new Prova(2, 2);

        // Trabalho de peso 1, com 3 notas
        float[] pesostrabalho = {1, 1, 1};
        float[] notastrabalho = {1, 1, 1};
        Avaliacao trabalho = new Trabalho(1, pesostrabalho, notastrabalho);

        // Interdisciplinar de peso 2, com 4 notas (3 notas de peso 1 e 1 nota de peso 4)
        float[] pesosinter = {1, 1, 1, 4};
        float[] notasinter = {1, 1, 1, 4};
        Avaliacao inter = new Interdisciplinar(2, pesosinter, notasinter);

        Semestre semestre = new Semestre(prova1, prova2, trabalho, inter);
        System.out.println("Peso das avaliações é válido? " + semestre.getPesoValido());
        System.out.println("Nota necessária para ser aprovado: " + semestre.getMedia());
        System.out.println("Nota do aluno: " + semestre.getPontos());
        System.out.println("Aprovado? " + semestre.getAprovado());

    }
}
