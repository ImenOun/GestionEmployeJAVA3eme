import java.util.Comparator;

public class ComparatorDepartement implements Comparator<Employe> {
    public int compare(Employe e1 , Employe e2)
    {
        return e1.getNomDepartement().compareTo(e2.getNomDepartement());
    }
}
