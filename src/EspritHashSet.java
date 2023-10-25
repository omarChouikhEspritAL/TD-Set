import java.util.HashSet;

public class EspritHashSet implements GestionEnseignant{
    HashSet<Enseignant>enseignantHashSet =new HashSet<>();
    @Override
    public void ajouterEnseignant(Enseignant e) {
        enseignantHashSet.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return enseignantHashSet.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        for (Enseignant e : enseignantHashSet){
            return e.getId()==id;
        }
        return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        enseignantHashSet.remove(e);
    }

    @Override
    public void displayEnseignants() {
        System.out.println(enseignantHashSet);
    }
}
