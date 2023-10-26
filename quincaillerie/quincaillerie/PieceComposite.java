package quincaillerie;

import java.util.ArrayList;

// TODO Question 4: écrire la classe PieceComposite.
// 

/**
 * PieceComposite
 */
public abstract class PieceComposite extends Piece {
    protected ArrayList<Piece> liste;

    public PieceComposite(String nom, String reference) {
        super(nom, reference);
        liste = new ArrayList<Piece>();

    }

    public void ajoute(Piece p) {
        liste.add(p);
    }

    protected String compoString() {
        String str ="";

        for (Piece p : liste) {
            str += "\t" + p.toString()+"\n";
            

        }

        return str;

    }

    public String toString() {
        String str = super.toString() ;
        for (Piece p : liste) {
            str += "\n\t\t" + p.toString();

        }

        return str;

    }

    public int dureeGarantieDeBase() {
        int dureeMin = Integer.MAX_VALUE;
        for (Piece p : liste) {
            if (p.dureeGarantie() < dureeMin)
                dureeMin = p.dureeGarantie();
        }

        return dureeMin;
    }

    public int dureeFabrication() {
        int dureeMax = Integer.MIN_VALUE;
        for (Piece p : liste) {
            if (p.dureeFabrication() > dureeMax)
                dureeMax = p.dureeFabrication();
        }

        return dureeMax;
    }



  
}