package Humains;

// Cette classe hérite également de la classe Humain. 
// Elle récupère donc tous ses attributs et ses méthodes.*/
public class Femme extends Humain {
    
    // Attribut supplémentaire :
    private String magazinePreferee;

    /* Constructeur : nous réutilisons les attributs de la classe Humain
    = super */ 
    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age);
        this.magazinePreferee = "";
    }

    // Constructeur : nous rajoutons l'attribut "magazinePreferee"
    public Femme(String nom, String prenom, int age, double taille, double poids, int anneeNaissance, String pays, String magazinePrefereeFemme) {
        super(nom, prenom, age, taille, poids, anneeNaissance, pays);
        magazinePreferee = magazinePrefereeFemme;
    }

     // Méthode
    public void sayHello() {
        System.out.println("Bonjour, je m'appelle " + prenom + " " + nom + ", je suis une femme et j'ai" + age + "ans.");

    }

    // Getter
    public String getMagazinePreferee() {
        return magazinePreferee;
    }

    // Setter
    public void setMagazinePreferee(String magazinePreferee) {
        this.magazinePreferee = magazinePreferee;
    }
}
