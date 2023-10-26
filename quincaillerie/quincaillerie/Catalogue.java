package quincaillerie;

import java.util.ArrayList;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

// TODO Questions 21: écrire la classe Catalogue.
// 

/**
 * Catalogue
 */
public class Catalogue {

    protected ArrayList<Piece> liste;

    public Catalogue() {
        liste = new ArrayList<Piece>();
    }

    private boolean estPresente(Piece p) {
        return liste.contains(p);
    }

    public void ajoute(Piece p) {
        if (!estPresente(p))
            liste.add(p);
        else
            System.out.println("La pièce : {" + p.nom + ":" + p.reference + "} existe dèjà dans le catalogue");
    }

    public String toString() {
        System.out.println("Catalogue : ");
        ;
        String str = "";
        for (Piece p : liste) {
            if (p instanceof PieceComposite)
                str += p.nom + " - " + p.reference + " | ";
            else
                str += p.toString() + " | ";
        }
        str += "\n";
        return str;
    }

    public void affichePiece(String nom, String reference) {

        boolean found = false;
        Piece piece = null;

        ListIterator<Piece> it = liste.listIterator();
        while (!found && it.hasNext()) {
            piece = it.next();
            if (piece.nom.equals(nom) && piece.reference.equals(reference)) {
                found = true;

            }
        }

        if (found)
            piece.affiche();

        else
            System.out.println("Pièce introuvable !");

    }
}
