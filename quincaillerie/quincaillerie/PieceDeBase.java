package quincaillerie;

/**
 * PieceDeBase
 */
public class PieceDeBase extends Piece {

    protected double prix;
    protected int dureeGarantie;
    protected int dureeFabrication;

    public PieceDeBase(String nom, String reference, double prix, int dureeGarantie, int dureeFabrication) {
        super(nom, reference);
        setReference(reference);

        if (prix >= 0 && dureeGarantie >= 0 && dureeFabrication >= 0) {
            this.prix = prix;
            this.dureeGarantie = dureeGarantie;
            this.dureeFabrication = dureeFabrication;
        } else {
            this.prix = 0;
            this.dureeGarantie = 0;
            this.dureeFabrication = 0;
        }
    }

    protected void setReference(String reference) {
        if (reference.charAt(0) == '0' && reference.charAt(1) == '0')
            super.setReference(reference);
        else
            super.setReference("00" + reference);
    }

    public void affiche() {
        super.afficheDebut();

    }

    public double prix() {
        return prix;
    };

    public int dureeGarantie() {
        return dureeGarantie;
    };

    public int dureeGarantieDeBase() {
        return dureeGarantie;
    };

    public int dureeFabrication() {
        return dureeFabrication;
    };

}