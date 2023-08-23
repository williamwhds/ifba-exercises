public class ProgramaBiblioteca {
    public static void main (String[] args) {
        LivroXPTO livro = new LivroXPTO("Repeteco", "Brian Lee O'Malley", 2016, "Romance, Historia em Quadrinhos", "Companhia das Letras", 5, "1ª", "978-8535928129");
        FilmeXPTO filme = new FilmeXPTO("Bastardos Inglorios", "Quentin Tarantino", 2009, "Acao, Guerra, Comedia", "Universal Pictures", 2, "Quentin Tarantino", "Brad Pitt", "Sinopse aqui [...]", "2h33m");

        PublicacaoXPTO[] lista = new PublicacaoXPTO[2];

        lista[0] = livro;
        lista[1] = filme;

        for (int i=0;i<lista.length;i++) {
            lista[i].imprimeDados();
        }
    }
}
