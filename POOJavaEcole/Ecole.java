package POOJavaEcole;

public class Ecole {

    // Attributs :
    String nom;
    String[] matieresEnseignees;
    String ville;
    Etudiant[]etudiants;


    // constructeur : avec les 4 attributs
    public Ecole(String nom, String[] matieresEnseignees, String ville, Etudiant[]etudiants) {
        this.nom = nom;
        this.matieresEnseignees = matieresEnseignees;
        this.ville = ville;
        this.etudiants = etudiants;
        
    }

    /*
     * Méthode : ne retourne rien mais affiche le texte « Bienvenue à l'école... » 
     * suivi du nom de l’école, ville et matières enseignées.
     */

    public void showInformations() {
        System.out.println("Bienvenue à l'école " + nom + " située à " + ville + " et proposant :");
        for (String matiere : matieresEnseignees) {
            System.out.println(matiere);
        }
    }


    // Getter :

    public String getNom() {
        return nom;
    }

    public String[] getMatieresEnseignees() {
        return matieresEnseignees;
    }

     public String getVille() {
        return ville;
    }

     public Etudiant[] getEtudiants() {
        return etudiants;
    }


    // Setter : permet de modifier

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMatieresEnseignees(String[] matieresEnseignees) {
        this.matieresEnseignees = matieresEnseignees;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setEtudiants(Etudiant[] etudiants) {
        this.etudiants = etudiants;
    }
}
