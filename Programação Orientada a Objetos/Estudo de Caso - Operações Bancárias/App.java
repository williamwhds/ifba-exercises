public class App {
    public static void main(String[] args) {
        Banco banco = new Banco("João", new ContaCorrente(), "Maria", new ContaCorrente(), "José", new ContaCorrente());
        
        banco.creditar("João", 1000); // +1000
        banco.debitar("João", 100); // -100
        banco.getSaldo("João"); // 900

        banco.transferir("João", "Maria", 100);

        banco.getSaldo("João"); // 800
        banco.getSaldo("Maria"); // 100
    }
    
}
