import java.util.Collections;
import java.util.ArrayList;

public class Carro {
    private String placa;
    private String modelo;
    private String cor;
    private int ano;

    public Carro(String placa, String modelo, String cor, int ano) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        String s = "Placa: " + placa + "\n";
        s += "Modelo: " + modelo + "\n";
        s += "Cor: " + cor + "\n";
        s += "Ano: " + ano + "\n";
        return s;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.placa != null ? this.placa.hashCode() : 0);
        hash = 97 * hash + (this.modelo != null ? this.modelo.hashCode() : 0);
        hash = 97 * hash + (this.cor != null ? this.cor.hashCode() : 0);
        hash = 97 * hash + this.ano;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Carro)) {
            return false;
        }
        Carro outro = (Carro) obj;
        return this.placa.equals(outro.placa) && this.modelo.equals(outro.modelo) && this.cor.equals(outro.cor) && this.ano == outro.ano;
    }

    public static void main(String[] args) {
        ArrayList<Carro> carros = new ArrayList<>();
        Carro c1 = new Carro("ABC-1234", "Fusca", "Azul", 1970);
        Carro c2 = new Carro("DEF-5678", "Brasilia", "Amarelo", 1980);
        Carro c3 = new Carro("GHI-9012", "Chevette", "Vermelho", 1990);
        Carro c4 = new Carro("JKL-3456", "Opala", "Preto", 2000);

        carros.add(c1);
        carros.add(c2);
        carros.add(c3);
        carros.add(c4);

        // sort placa
        Collections.sort(carros, new PlacaComparator());

        System.out.println("Ordenado por placa:");
        for (Carro c : carros) {
            System.out.println(c);
        }

        // sort cor
        Collections.sort(carros, new CorComparator());

        System.out.println("Ordenado por cor:");
        for (Carro c : carros) {
            System.out.println(c);
        }

        // sort modelo
        Collections.sort(carros, new ModeloComparator());

        System.out.println("Ordenado por modelo:");
        for (Carro c : carros) {
            System.out.println(c);
        }

        // sort ano
        Collections.sort(carros, new AnoComparator());

        System.out.println("Ordenado por ano:");
        for (Carro c : carros) {
            System.out.println(c);
        }
    }
}
