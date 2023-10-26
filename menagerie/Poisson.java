package menagerie;

// TODO Question 7: Créez la classe Poisson...

public  class Poisson extends Animal {

    public Poisson(String nom) {
        super(nom);
    }

    // public String toString() {
    //     return super.toString() + " et je peux faire " + cri();

    // }

    public String cri() {
        return "Gloup !";
    }
}
