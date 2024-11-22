package set;

import java.util.TreeSet;

public class MainDeux {
    public static void main(String[] args) {
        System.out.println("****************************************************************");
        System.out.println("****************************************************************");

        System.out.println("**************************** Partie Set ************************");

        System.out.println("****************************************************************");
        System.out.println("****************************************************************");


        DepartementHashSet gestionDepartements = new DepartementHashSet();

        Departement d1 = new Departement(15, "Informatique", 50);
        Departement d2 = new Departement(1, "Ressources Humaines", 30);
        Departement d3 = new Departement(53, "Marketing", 25);
        Departement d4 = new Departement(78, "Marketing", 30);


        gestionDepartements.ajouterDepartement(d1);
        gestionDepartements.ajouterDepartement(d2);
        gestionDepartements.ajouterDepartement(d3);
        gestionDepartements.ajouterDepartement(d4);



        System.out.println("=================Liste des départements ajoutés ==============");
        gestionDepartements.displayDepartement();


        System.out.println("===============Recherche du département 'Marketing' ==========");
        if (gestionDepartements.rechercherDepartement("Marketing")) {
            System.out.println("Département trouvé.");
        } else {
            System.out.println("Département non trouvé.");
        }


        System.out.println("===============Tri des départements par ID =================");
        TreeSet<Departement> sortedDepartements = gestionDepartements.trierDepartementById();
        for (Departement dep : sortedDepartements) {
            System.out.println(dep);
        }


        System.out.println("=============Suppression du département 'Ressources Humaines' =================");
        gestionDepartements.supprimerDepartement(d2);
        gestionDepartements.displayDepartement();
    }

}


