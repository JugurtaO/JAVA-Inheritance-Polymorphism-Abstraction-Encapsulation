package clients;

// TODO Question 24: écrire la classe Client.
// 

/**
 * Client
 */
public abstract class Client {
    protected String nom;
    protected String adressePostale;
    protected String adresseElectronique;


    public Client(String nom, String adressePostale,String adresseElectronique){
        this.nom=nom;
        this.adressePostale=adressePostale;
        this.adresseElectronique=adresseElectronique;
    }

}