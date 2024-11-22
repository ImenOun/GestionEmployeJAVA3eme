import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe> {
    List<Employe> employes = new ArrayList<>();
    @Override
    public void ajouterEmploye(Employe e)
    {
        employes.add(e);

    }
    @Override
    public boolean rechercherEmploye(String nom)
    {
        for(Employe e:employes)
        {
            if(e.getNom().equalsIgnoreCase(nom))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return employes.contains(e);
    }

    @Override
    public void supprimerEmploye(Employe e)
    {
        employes.remove(e);
    }

    @Override
    public void displayEmploye() {
        System.out.println(employes);
    }

    @Override
//comparable
    public void trierEmployeParId() {
        Collections.sort(employes);
    }

    //comparator
    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(employes,new ComparatorDepartement().thenComparing(new ComparatorGrade()));
    }
}
