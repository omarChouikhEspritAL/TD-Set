import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        EspritTreeSet treeSetList = new EspritTreeSet(new TriNom());

        Enseignant e1 = new Enseignant(1,"ens1","preEns1");
        Enseignant e2 = new Enseignant(1,"ens1","preEns1");
        Enseignant e3 = new Enseignant(2,"ens2","preEns2");
        Enseignant e4 = new Enseignant(3,"ens3","preEns3");

        treeSetList.ajouterEnseignant(e1);
        treeSetList.ajouterEnseignant(e2);
        treeSetList.ajouterEnseignant(e3);
        treeSetList.ajouterEnseignant(e4);
 treeSetList.displayEnseignants();



        System.out.println(treeSetList.rechercherEnseignant(1));
        System.out.println(treeSetList.rechercherEnseignant(e2));

        treeSetList.displayEnseignants();

        treeSetList.supprimerEnseignant(e3);
        treeSetList.displayEnseignants();
        System.out.println("*********hasSet*************\n");
        EspritHashSet hashSetList = new EspritHashSet();
        hashSetList.ajouterEnseignant(e1);
        hashSetList.ajouterEnseignant(e2);
        hashSetList.ajouterEnseignant(e3);
        hashSetList.ajouterEnseignant(e4);
        hashSetList.displayEnseignants();
        hashSetList.supprimerEnseignant(e3);
        System.out.println(hashSetList.rechercherEnseignant(e3));
        System.out.println(hashSetList.rechercherEnseignant(2));
        hashSetList.displayEnseignants();

    }
}