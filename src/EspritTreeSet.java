import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class EspritTreeSet implements GestionEnseignant {
    TreeSet<Enseignant>enseignantTreeSet=new TreeSet<>(Collections.reverseOrder());
    @Override
    public void ajouterEnseignant(Enseignant e) {
        enseignantTreeSet.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        for (Enseignant enseignant : enseignantTreeSet){
            return enseignant.equals(e);
        }
        return false;
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        for (Enseignant enseignant:enseignantTreeSet) {
            return enseignant.getId()==id;
        }
        return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        enseignantTreeSet.remove(e);
    }

    @Override
    public void displayEnseignants() {
        System.out.println(enseignantTreeSet);
    }


}
