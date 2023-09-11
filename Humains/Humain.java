package Humains;

//Cette classe ne doit pas être instanciable => mot-clé : abstract
public abstract class Humain {

  // Attributs :
  String nom;
  String prenom;
  int age;
  double taille;
  double poids;
  int anneeNaissance;
  String pays;

  /*
   * 1er constructeur : permettant d’instancier la classe avec trois attributs
   * seulement : nom, prénom et âge
   */
  Humain(String nom, String prenom, int age) {
    this.nom = nom;
    this.prenom = prenom;
    this.age = age;
  }

  // 2nd constructeur : avec les 7 attributs
  Humain(String nom, String prenom, int age, double taille, double poids, int anneeNaissance, String pays) {
    this.nom = nom;
    this.prenom = prenom;
    this.age = age;
    this.taille = taille;
    this.poids = poids;
    this.anneeNaissance = anneeNaissance;
    this.pays = pays;
  }

  /*
   * Méthode : ne retourne rien mais affiche le texte « Bonjour, je
   * m’appelle… » suivi du prénom et du nom de l’humain.
   */

  public void sayHello() {
    System.out.println("Bonjour, je m'appelle " + prenom + " " + nom);
  }

  // Getter : retourne le pays de l'humain
  public String getPays() {
    return pays;
  }

  public double getPoids() {
    return poids;
  }

  // Setter : permet de modifier le poids
  public void setPoids(double poids) {
    this.poids = poids;
  }

  // ===================================================================
  
   /* Méthode sayEverything : ne retourne rien mais affiche le texte « Bonjour, je m’appelle… » 
   suivi du prénom et du nom de l’humain, age, poids, taille, année de naissance, pays.*/
      
  public void sayEverything() {

    System.out.println("Bonjour, je m'appelle " + prenom + " " + nom + ", j'ai " + age + " ans, je pèse " + poids
        + " kg, je mesure " + taille + " cm, je suis né en " + anneeNaissance + " et je viens de " + pays + ".");

  }

  // Setter : permet de modifier la taille
  public void setTaille(double taille) {
    this.taille = taille;
  }

  // Setter : permet de modifier l'année de naissance
  public void setAnneeNaissance(int anneeNaissance) {
    this.anneeNaissance = anneeNaissance;
  }

  // Setter : permet de modifier le pays
  public void setPays(String pays) {
    this.pays = pays;
  }
}
