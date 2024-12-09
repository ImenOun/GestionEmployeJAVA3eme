import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.stream.Stream;
public class StudentManagement implements  Management{
    @Override
    public void displayStudents(List<Etudiant> etudiants, Consumer<Etudiant> con) {
        etudiants.forEach(con);
    }
    @Override
    public void displayStudentsByFilter(List<Etudiant> etudiants, Predicate<Etudiant> pre, Consumer<Etudiant> con) {
        etudiants.stream()
                .filter(pre)
                .forEach(con);
    }



    @Override
    public Etudiant createStudent(Supplier<Etudiant> sup) {
        return sup.get();
    }

    @Override
    public List<Etudiant> sortStudentsById(List<Etudiant> etudiants, Comparator<Etudiant> com) {
        return etudiants.stream()
                .sorted(com)
                .collect(Collectors.toList());
    }

    @Override
    public Stream<Etudiant> convertToStream(List<Etudiant> etudiants) {
        return etudiants.stream();
    }
}
