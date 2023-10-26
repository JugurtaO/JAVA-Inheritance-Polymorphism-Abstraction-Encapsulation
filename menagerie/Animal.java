package menagerie;

public abstract class Animal {
    // TODO Déclarer l'attribut nom

    protected String nom;
     
    // TODO Question 1: Constructeur
    public Animal(String nom){
        this.nom=nom;
    }
    // TODO Question 1: Accesseur
    public String getNom(){
        return nom;
    }
    // TODO Question 1: Déclarer la méthode cri.
    public abstract String cri();
}
