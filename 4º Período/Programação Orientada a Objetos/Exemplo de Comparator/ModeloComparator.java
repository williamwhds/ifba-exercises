import java.util.Comparator;

public class ModeloComparator implements Comparator<Carro> {
    @Override
    public int compare(Carro c1, Carro c2) {
        return c1.getModelo().compareTo(c2.getModelo());
    }
}
