import Humains.*; // on importe toutes les classes du package POOJava

// classe principale du programme
public class Main {

    // public static void main = méthode du programme (obligatoire en Java)
    public static void main(String args[]) {

        // Créez une instance de Homme en utilisant le constructeur à 3 paramètres
        Homme homme1 = new Homme("Doe", "John", 30);

        // Créez une instance de Homme en utilisant le constructeur à 8 paramètres
        Homme homme2 = new Homme("Bon", "Jean", 25, 170, 60, 1998, "France", "FC Nantes");
    
        // Méthode :
       homme1.sayHello();
       homme2.sayHello();

       
       System.out.println("équipe préférée de homme1 : " + homme1.getEquipePreferee() + "\n");
       System.out.println("équipe préférée de homme2 : " + homme2.getEquipePreferee() + "\n");
        

    }
}



