package Humains;

// Cette classe hérite de la classe Humain : extends
// Elle récupère donc tous ses attributs et ses méthodes.
public class Homme extends Humain {

    // Attribut supplémentaire :
    private String equipePreferee = "aucune";

    /*
     * Constructeur : nous réutilisons les attributs de la classe Humain
     * = super
     */
    public Homme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    // Constructeur : nous rajoutons l'attribut "equipePreferee"
    public Homme(String nom, String prenom, int age, double taille, double poids, int anneeNaissance, String pays,
            String equipePrefereeHomme) {
        super(nom, prenom, age, taille, poids, anneeNaissance, pays);
        equipePreferee = equipePrefereeHomme;
    }

    // Méthode
    public void sayHello() {
        System.out.println("Bonjour, je m'appelle " + prenom + " " + nom + ", je suis un homme et j'ai" + age + "ans.");

    }

    // Getter
    public String getEquipePreferee() {
        return equipePreferee;
    }

    // Méthode sayEverything redéfinie: affiche une phrase supplémentaire avec
    // l'équipe préférée

    public void sayEverything() {
        super.sayEverything();// appelle la phrase précédente contenant les précédentes infos.

        System.out.println("Mon équipe préférée est " + equipePreferee + ".");

    }
}