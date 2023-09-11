package POOJavaEcole;

//Classe 
public class Etudiant {

    // Attributs :
    String nom;
    String prenom;
    int age;
    String matiereEtudiee;
    Boolean diplomeObtenu;

    // constructeur : avec les 5 attributs
    public Etudiant(String nom, String prenom, int age, String matiereEtudiee, Boolean diplomeObtenu) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.matiereEtudiee = matiereEtudiee;
        this.diplomeObtenu = diplomeObtenu;
    }

    
     /* Méthode : ne retourne rien mais affiche le texte « Bonjour, je
     * m’appelle… » suivi du prénom et du nom de l’étudiant, age et matière étudiée.
     */

    public void sayHello() {
        System.out.println("Bonjour, je m'appelle " + prenom + " " + nom + ", j'ai " + age + " et j'étudie "
                + matiereEtudiee + ".");
    }

    // Méthode : condition si diplôme obtenu

    public void isGraduated() {
        if (diplomeObtenu = true) {
            System.out.println("j'ai obtenu mon diplôme");
        } else {
            System.out.println("je ne suis pas encore diplômé(e)");
        }
    }


    // Getter

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public String getMatiereEtudiee() {
        return matiereEtudiee;
    }

    public Boolean getDiplomeObtenu() {
        return diplomeObtenu;
    }


    // Setter : permet de modifier

    public void setNom(String nom) {
        this.nom = nom;
    }

     public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

     public void setAge(int age) {
        this.age = age;
    }

     public void setMatiereEtudiee(String matiereEtudiee) {
        this.matiereEtudiee = matiereEtudiee;
    }

    public void setDiplomeObtenu(Boolean diplomeObtenu) {
        this.diplomeObtenu = diplomeObtenu;
    }


}
