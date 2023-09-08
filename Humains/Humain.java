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

  /* 1er constructeur : permettant d’instancier la classe avec trois attributs 
  seulement : nom, prénom et âge */
  Humain(String nom, String prenom, int age) {
    this.nom = nom;
    this.prenom = prenom;
    this.age = age;
  }

  // 2nd constructeur :  avec les 7 attributs
  Humain(String nom, String prenom, int age, double taille, double poids, int anneeNaissance, String pays) {
    this.nom = nom;
    this.prenom = prenom;
    this.age = age;
    this.taille = taille;
    this.poids = poids;
    this.anneeNaissance = anneeNaissance;
    this.pays = pays;
  }

  /* Méthode :  ne retourne rien mais affiche le texte « Bonjour, je 
  m’appelle… » suivi du prénom et du nom de l’humain.*/ 

  public void sayHello() {
    System.out.println("Bonjour, je m'appelle " + prenom + " " + nom);
  }

  // Getter : retourne le pays de l'humain
  public String getPays() {
    return pays;
  }

  // Setter : permet de modifier le poids
  public void setPoids(double poids) {
    this.poids = poids;
  }

}
