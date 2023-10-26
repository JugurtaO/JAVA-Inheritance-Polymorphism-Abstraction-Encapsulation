package quincaillerie;

// TODO Question 5: écrire la classe PieceCompositeEnKit.
// 

/**
 * PieceCompositeEnKit
 */
public class PieceCompositeEnKit extends PieceComposite {

    protected int dureeMontage;

    public PieceCompositeEnKit(String nom, String reference, int dureeMontage) {
        super(nom, reference);
        setReference(reference);
        if(dureeMontage>=0)
            this.dureeMontage = dureeMontage;
        else 
            this.dureeMontage=0;
    }

    @Override
    protected void setReference(String reference) {
        if (reference.charAt(0) == '0' && reference.charAt(1) == '1')
            super.setReference(reference);
        else
            super.setReference("01" + reference);
    }

    public double prix() {
        double price = 0;
        for (Piece p : liste) {
            price += p.prix();
        }

        return price;
    }

    public int dureeGarantie() {
        return dureeGarantieDeBase() / 2;

    }

    public void affiche() {
        super.afficheDebut();
        System.out.println("durée de montage particulier : " + dureeMontage + " mn");
        System.out.println("composants :");
        System.out.println(compoString());

    }
}
