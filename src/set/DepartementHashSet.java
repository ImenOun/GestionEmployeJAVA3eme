package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;
public class DepartementHashSet implements IDepartement<Departement> {
    Set<Departement> departements = new HashSet<>();
    public void ajouterDepartement(Departement departement) {
        departements.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement d : departements) {
            if (d.getNomDepartement().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean rechercherDepartement(Departement d) {
        return departements.contains(d);
    }
    @Override
    public void supprimerDepartement(Departement departement) {
        departements.remove(departement);
    }

    @Override
    public void displayDepartement() {
        System.out.println(departements);
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        // Crée un TreeSet avec un comparateur personnalisé basé sur l'id
        TreeSet<Departement> sortedSet = new TreeSet<>(Comparator.comparingInt(Departement::getId));
        sortedSet.addAll(departements); // Ajoute tous les départements dans le TreeSet
        return sortedSet;
    }
}
