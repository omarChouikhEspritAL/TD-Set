import java.util.Comparator;

public class Enseignant implements Comparable<Enseignant>{
    private int id;
    private String nom;
    private String pernom;

    public Enseignant(int id, String nom, String pernom) {
        this.id = id;
        this.nom = nom;
        this.pernom = pernom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPernom() {
        return pernom;
    }

    public void setPernom(String pernom) {
        this.pernom = pernom;
    }

    @Override
    public boolean equals(Object obj) {
        return ((Enseignant)obj).getId()==this.getId();
    }

    @Override
    public String toString() {
        return "Enseignant{id=" + id +", nom='" + nom + ", pernom='" + pernom +'}';
    }

    @Override
    public int compareTo(Enseignant o) {
        return o.getId()-this.getId();
    }
}
