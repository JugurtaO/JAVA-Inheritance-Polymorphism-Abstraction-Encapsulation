package quincaillerie;

/**
 * Piece
 */
public abstract class Piece {

    protected String nom;
    protected String reference;

    public Piece(String nom, String reference) {
        this.nom = nom;
        setReference(reference);

    }

    protected void setReference(String reference) {

        this.reference = reference;
    };

    public abstract void affiche();

    public void afficheDebut() {
        System.out.println("nom : " + nom);
        System.out.println("reference : " + reference);
        System.out.println("prix : " + prix() + " euros");
        System.out.println("garantie :" + dureeGarantie() + " mois");
        System.out.println("duree de fabrication : " + dureeFabrication() + " jour(s)");
    }

    public String toString() {
        return nom + " - " + reference;
    }

    public abstract double prix();

    public abstract int dureeGarantie();

    public abstract int dureeGarantieDeBase();

    public abstract int dureeFabrication();

}