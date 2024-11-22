package set;


import java.util.Comparator;

public class ComparatorParID implements Comparator<Departement> {
    @Override
    public int compare(Departement d1, Departement d2) {
        return Integer.compare(d1.getId(), d2.getId());
    }
}
