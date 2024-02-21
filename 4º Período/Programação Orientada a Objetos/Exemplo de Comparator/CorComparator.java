import java.util.Comparator;

public class CorComparator implements Comparator<Carro>{
    @Override
    public int compare(Carro c1, Carro c2) {
        return c1.getCor().compareTo(c2.getCor());
    }
}
