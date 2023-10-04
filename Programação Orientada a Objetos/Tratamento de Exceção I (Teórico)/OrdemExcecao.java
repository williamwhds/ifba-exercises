/*
 *  9.  Escreva um programa em Java que mostra que a ordem dos tratadores de 
 *      exceções é importante.  Se você tentar capturar um tipo de exceção de 
 *      superclasse antes de um tipo de subclasse, o compilador deve gerar erros. 
 *      Explique por que ocorrem esse erros.
 */

public class OrdemExcecao extends Exception {
    public OrdemExcecao(String msg) {
        super(msg);
    }

    public static void main(String[] args) {
        // Tentando capturar Superclasse antes da Subclasse
        try {
            throw new OrdemExcecao("Ordem incorreta");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } catch (OrdemExcecao e) { // Já foi capturada na Exception
            System.out.println(e.getMessage());
        }
    }
}