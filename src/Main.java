

import java.util.TreeSet;
public class Main {
    public static void main(String[] args)
    {
        SocieteArrayList societe=new SocieteArrayList();
        //Employe
        Employe e1 = new Employe(100,"Ahmed","hamouda","IT",3);
        Employe e2 = new Employe(58,"ahlem","halouma","Finance",5);
        Employe e3 = new Employe(79,"saliim","slouma","Rh",9);
        Employe e4 = new Employe(4,"Soumaya","Soumaya","Rh",10);

        ////================Ajouter Les Employes====================
        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);
        System.out.println("================ La Liste des Employes ====================");
        societe.displayEmploye();
        System.out.println("================ Recherche des Employes Par Nom ====================");
        System.out.println(societe.rechercherEmploye("Ahmed"));
        System.out.println("================ Recherche des Employes Par Objet ====================");
        System.out.println(societe.rechercherEmploye(e1));
        System.out.println("================ Suprimer des Employes ====================");
        societe.supprimerEmploye(e4);
        System.out.println("================ La Liste apres suppression ====================");
        societe.displayEmploye();
        System.out.println("================ La Liste trier par id(comparable) ====================");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("================ La Liste trier par departement et grade(comparator) ====================");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();


    }
}
