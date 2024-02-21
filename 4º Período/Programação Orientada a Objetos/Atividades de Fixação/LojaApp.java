public class LojaApp {
    public static void main(String[] args) {
        Loja acougue = new Loja("Carnes e Cia", "Acougue", 2001);

        acougue.admitirVendedor("Roberto", 20);
        acougue.getVendedor().vender();

        acougue.demitirVendedor();
        System.out.println(acougue.getVendedor());
    }
}