import  java.util.Objects;
public class Employe implements Comparable<Employe> {
    private   int identifiant ;
    private  String nom;
    private  String prenom;
    private  String NomDepartement;
    private  int grade;
    Employe() { }
    Employe(int identifiant,String nom, String prenom,String NomDepartement,int grade)
    {
        this.identifiant=identifiant;
        this.nom=nom;
        this.prenom=prenom;
        this.NomDepartement=NomDepartement;
        this.grade=grade;
    }

    public int getIdentifiant() {
        return identifiant;
    }
    public String getNom(){
        return nom;
    }
    public String getPrenom()
    {
        return prenom;
    }

    public String getNomDepartement() {
        return NomDepartement;
    }

    public int getGrade() {
        return grade;
    }
    public void setIdentifiant(int identifiant)
    {
        this.identifiant=identifiant;
    }
    public void setNom(String nom)
    {
        this.nom=nom;
    }
    public void setPrenom(String prenom)
    {
        this.prenom=prenom;
    }
    public void setNomDepartement(String NomDepartement)
    {
        this.NomDepartement=NomDepartement;
    }
    public void setGrade(int grade)
    {
        this.grade=grade;
    }
    @Override
    public boolean equals(Object obj)
    {
        if(obj==this) return true;
        if(obj==null)return false;
        return (obj instanceof Employe em)&&this.identifiant==em.identifiant&&this.nom.equals(em.nom);
    }
    @Override
    public String toString()
    {
        return "Employe: Identifiant: "+identifiant+" ,Nom: "+nom+" ,Prenom: "+prenom+" ,Nom de Département: "+NomDepartement+" ,Grade: "+grade +"\n";
    }
    @Override
    public int compareTo(Employe e)
    {
        return this.identifiant-e.identifiant;
    }
}
