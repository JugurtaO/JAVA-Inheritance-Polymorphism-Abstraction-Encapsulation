package quincaillerie;

// TODO Question 13: écrire la classe PieceCompositeEnMontee.

// 

/**
 * PieceCompositeMontee
 */
public class PieceCompositeMontee extends PieceComposite {

    protected int dureeMontage;
    protected double prixMontage;

    public PieceCompositeMontee(String nom, String reference, int dureeMontage, double prixMontage) {
        super(nom, reference);
        setReference(reference);

        if (dureeMontage >= 0 && prixMontage >= 0) {
            this.dureeMontage = dureeMontage;
            this.prixMontage = prixMontage;
        } else {
            this.dureeMontage = 0;
            this.prixMontage = 0;
        }

    }

    @Override
    protected void setReference(String reference) {
        if (reference.charAt(0) == '0' && reference.charAt(1) == '2')
            super.setReference(reference);
        else
            super.setReference("02" + reference);
    }

    @Override
    public void affiche() {

        super.afficheDebut();
        System.out.println("durée de montage atelier : " + dureeMontage + " jour(s)");
        System.out.println("prix du montage : " + prixMontage + " euros");

        System.out.println("composants :");
        System.out.println(compoString());

    }

    @Override
    public double prix() {
        double price = prixMontage;

        for (Piece p : liste) {
            price += p.prix();

        }
        return price;
    }

    @Override
    public int dureeGarantie() {
        int garantie = 6 + super.dureeGarantieDeBase();

        return garantie;
    }

    public int dureeFabrication() {

        int dureeFab = this.dureeMontage + super.dureeFabrication();

        return dureeFab;
    }

}