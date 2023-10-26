package menagerie;

public class Animalerie {

    public String getChenil() {
        // TODO Créez un tableau de 3 animaux et renvoyez une chaîne de carractère qui
        // contient ce qui est demandé dans l'énoncé. Contrainte: utilier un foreach...

        
        Chat chat=new Chat("Tom");
        Chien chien =new Chien("Médor");
        Poisson p=new Poisson("Némo");
        
        Animal[] tab = new Animal[3];
        tab[0]=p;
        tab[1]=chien;
        tab[2]=chat;

        String res="";
        for (Animal animal : tab) {
                res+="nom : "+animal.getNom()+", s'affiche en disant : "+animal.toString()+", son cri est : "+animal.cri()+"\n";
            
        }
        return res;
    }

    public static void main(String[] args) {
        Animalerie an = new Animalerie();
        System.out.println(an.getChenil());
    }
}
