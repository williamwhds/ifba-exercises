import java.util.Comparator;

public class PlacaComparator implements Comparator<Carro> {
    @Override
    public int compare(Carro c1, Carro c2) {
        return c1.getPlaca().compareTo(c2.getPlaca());
    }
}
