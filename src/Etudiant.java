//import   java.lang.String;


public class Etudiant {
    private int id;
    private String nom;
    private int age;
    public Etudiant(){}
    public Etudiant(int id,String nom,int age)
    {
        this.id=id;
        this.nom= nom;
        this.age=age;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getNom() {
        return nom;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString()
    {
        return "Students: ID: "+ id+ " ,Nom : "+ nom+" ,Age: "+age;
    }


}
