
package set;
import java.util.Objects;
public class Departement {
    private int id;
    private String nomDepartement;
    private int nbrEmploye;
    public Departement(){}
    public Departement(int id,String nomDepartement,int nbrEmploye)
    {
        this.id=id;
        this.nomDepartement=nomDepartement;
        this.nbrEmploye=nbrEmploye;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }
    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getNbrEmploye()
    {
        return nbrEmploye;
    }
    public void setNbrEmploye(int nbrEmploye) {
        this.nbrEmploye = nbrEmploye;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj==this) return true;
        if(obj==null) return  false;
       return (obj instanceof Departement dep)&& this.id==dep.id && this.nomDepartement.equals(dep.nomDepartement);
    }

    @Override
    public String toString()
    {
        return "Departement: ID: "+id+" ,Nom de Departement: "+nomDepartement+" ,Nombre d employes: "+nbrEmploye +"\n";
    }
    @Override
    public int hashCode() {
        int r = 31;
        r = 17 + id * r;
        r = 17 + nomDepartement.hashCode() * r;
        return r;
    }
}
