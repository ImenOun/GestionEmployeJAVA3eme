import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Création de quelques étudiants
        Etudiant etudiant1 = new Etudiant(55, "Imen", 21);
        Etudiant etudiant2 = new Etudiant(35, "Ahmed", 22);
        Etudiant etudiant3 = new Etudiant(8, "Salim", 19);

        // Liste des étudiants
        List<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(etudiant1);
        etudiants.add(etudiant2);
        etudiants.add(etudiant3);

        // Instance de EtudiantManagement
        StudentManagement management = new StudentManagement();

        // Affichage des étudiants
        System.out.println("Affichage des étudiants :");
        Consumer<Etudiant> printEtudiant = etudiant -> System.out.println(etudiant);
        management.displayStudents(etudiants, printEtudiant);

        // Filtrer et afficher les étudiants avec un âge supérieur à 20
        System.out.println("\nÉtudiants âgés de plus de 20 ans :");
        management.displayStudentsByFilter(etudiants, e -> e.getAge() > 20, printEtudiant);


        // Créer un nouvel étudiant
        System.out.println("\nCréation d'un nouvel étudiant :");
        Etudiant nouvelEtudiant = management.createStudent(() -> new Etudiant(4, "David", 21));
        System.out.println(nouvelEtudiant);

        // Trier les étudiants par ID
        System.out.println("\nÉtudiants triés par ID :");
        List<Etudiant> sortedEtudiants = management.sortStudentsById(etudiants, Comparator.comparingInt(Etudiant::getId));
        sortedEtudiants.forEach(printEtudiant);

        // Conversion en stream
        System.out.println("\nConversion en stream et affichage :");
        management.convertToStream(etudiants).forEach(printEtudiant);
    }
}
