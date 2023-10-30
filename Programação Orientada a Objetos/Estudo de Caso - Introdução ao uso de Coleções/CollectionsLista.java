import java.util.ArrayList;

public class CollectionsLista {
    private ArrayList<CollectionsLivro> listaLivros = new ArrayList<CollectionsLivro>();

    public void adicionarLivro (CollectionsLivro livro) {
        listaLivros.add(livro);
    }

    public void removerLivro (CollectionsLivro livro) {
        listaLivros.remove(livro);
    }

    public void imprimirLivros () {
        for (CollectionsLivro livro : listaLivros) {
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Editora: " + livro.getEditora());
            System.out.println("ISBN: " + livro.getIsbn());
            System.out.println();
        }
    }

    public boolean livroExiste (CollectionsLivro livro) {
        return listaLivros.contains(livro);
    }

    public CollectionsLivro obterLivro (CollectionsLivro livro) {
        int index = listaLivros.indexOf(livro);
        if (index != -1) { // -1 significa que o livro não foi encontrado
            return listaLivros.get(index);
        }
        return null;
    }

    public boolean estaVazia () {
        return listaLivros.isEmpty();
    }
}