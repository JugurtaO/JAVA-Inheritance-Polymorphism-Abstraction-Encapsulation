package clients;

// TODO Question 27: écrire la classe Entreprise.
// 



public class Entreprise extends Client {
    protected final String SIRET;

    public Entreprise(String nom, String adressePostale, String adresseElectronique,String siret) {
        super(nom, adressePostale, adresseElectronique);
        this.SIRET=siret;
      
    }

    public String toString() {
        return "Entreprise : "+this.nom+ ",(" + this.SIRET + ")";
    }
}
