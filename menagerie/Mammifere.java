package menagerie;

public abstract class Mammifere extends Animal {

    public Mammifere(String nom) {
        super(nom);
    }

    @Override
    public String toString() {
        String res="Je m'appelle " + getNom()+" et je peux faire : " + cri();
        return res ;
    }

    
}
