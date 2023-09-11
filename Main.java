import Humains.*; // on importe toutes les classes du package POOJava
import POOJavaEcole.*;

// classe principale du programme
public class Main {

    // public static void main = méthode du programme (obligatoire en Java)
    public static void main(String args[]) {

        // Créez une instance de Homme en utilisant le constructeur à 3 paramètres
        Homme homme1 = new Homme("Doe", "John", 30);

        // Utilisez les setters pour attribuer des valeurs manquantes
        homme1.setTaille(180); // Par exemple, attribuez une taille de 180 cm
        homme1.setAnneeNaissance(1992); // Attribuez une année de naissance de 1992
        homme1.setPays("États-Unis"); // Attribuez un pays de naissance

        // Créez une instance de Homme en utilisant le constructeur à 8 paramètres
        Homme homme2 = new Homme("Bon", "Jean", 25, 170, 60, 1998, "France", "FC Nantes");

        // Méthode :
        homme1.sayHello();
        homme2.sayHello();

        System.out.println("équipe préférée de homme1 : " + homme1.getEquipePreferee() + "\n");
        System.out.println("équipe préférée de homme2 : " + homme2.getEquipePreferee() + "\n");

        // Modifiez poids de homme1 et homme2
        homme1.setPoids(65);
        System.out.println(homme1.getPoids());// afficher le poids

        homme2.setPoids(homme2.getPoids() + 5);
        System.out.println(homme2.getPoids());// afficher le poids

        // ===============================================================

        // Créez une instance de la classe Femme (avec le second constructeur)
        Femme femme1 = new Femme("Doe", "Jane", 27, 165, 55, 1996, "France", "Gala");

        // Méthode :
        femme1.sayHello();

        System.out.println("magazine préféré de femme : " + femme1.getMagazinePrefere());

        // Modifiez son magazine préféré pour « Niort Agglo Magazine »

        femme1.setMagazinePrefere("Niort Agglo Magazine");

        System.out.println("magazine préféré de femme : " + femme1.getMagazinePrefere());

        // ===============================================================

        // Tableau humains regroupant les trois humains créés :
        Humain[] tableauHumains = { homme1, homme2, femme1 };

        // Bouclez sur le tableau avec une boucle for :
        for (Humain humain : tableauHumains) {

            // Méthodes :
            humain.sayHello();
            humain.sayEverything();

        }

        // ========================== Exercice 2 =====================================

        // création de 3 étudiants :
        Etudiant kevin = new Etudiant("Dupont", "Kevin", 20, "Developpement Web", false);
        Etudiant emma = new Etudiant("Kramer", "Emma", 18, "Infographie", false);
        Etudiant chloe = new Etudiant("Martin", "Chloé", 21, "Concepteur UI", false);

        // tableau école :
        String[] matieresEnseignees = { "Developpement web", "Infographie", "Concepteur UI" };
        Etudiant[] etudiants = { kevin, emma, chloe };

        Ecole arinfo = new Ecole("ARINFO", matieresEnseignees, "NIORT", etudiants);

        // Afficher les informations de l'école
        arinfo.showInformations();

        // Bouclez sur l'attribut étudiant avec une boucle for :
        for (Etudiant etudiant : arinfo.getEtudiants()) {

            etudiant.sayHello();
            etudiant.setDiplomeObtenu(true);
            etudiant.isGraduated();

        }
    }

}
