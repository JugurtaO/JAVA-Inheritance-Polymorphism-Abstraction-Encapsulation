package quincaillerie;

import clients.Civilite;
import clients.Particulier;
import clients.Entreprise;

public class Quincaillerie {

    public static void main(String[] args) {
        /*
         * TODO Question 3: Afficher les caractéristiques de pneu, chambre à air e,
         * disque de jante et rayon
         * 
         * 
         * Question 6: Afficher les fiches caractéristiques des 2 piièces composites
         * jantes en kit et brouette en kit décrites dans l'énoncé.
         * Question 14: Afficher les fiches caractéristiques des 2 piièces composites
         * jantes montée et brouette montée décrites dans l'énoncé.
         * Question 27: Ajouter un client particulier et une entreprise et afficher le
         * résultat.
         */

        PieceDeBase pneu = new PieceDeBase("pneu", "4741", 12.5, 60, 2);
        PieceDeBase chambreAair = new PieceDeBase("chambre à air", "4565", 4, 20, 2);
        PieceDeBase disqueDeJante = new PieceDeBase("disque de jante", "1214", 4.5, 60, 2);
        PieceDeBase rayon = new PieceDeBase("rayon", "4748", 1.0, 20, 1);

        pneu.affiche();
        System.out.println("\n");

        chambreAair.affiche();
        System.out.println("\n");

        disqueDeJante.affiche();
        System.out.println("\n");

        rayon.affiche();
        System.out.println("\n");

        //// en kit////

        PieceCompositeEnKit janteEnKit = new PieceCompositeEnKit("jante en kit", "4541", 10);
        janteEnKit.ajoute(disqueDeJante);
        janteEnKit.ajoute(rayon);
        janteEnKit.ajoute(rayon);
        janteEnKit.ajoute(rayon);
        janteEnKit.affiche();

        PieceCompositeEnKit roueDeBrouetteEnKit = new PieceCompositeEnKit("roue de brouette en kit", "1512", 15);
        roueDeBrouetteEnKit.ajoute(pneu);
        roueDeBrouetteEnKit.ajoute(chambreAair);
        roueDeBrouetteEnKit.ajoute(janteEnKit);
        roueDeBrouetteEnKit.affiche();

        //// montee ///

        PieceCompositeMontee jante = new PieceCompositeMontee("jante", "4541", 1, 7);
        jante.ajoute(disqueDeJante);
        jante.ajoute(rayon);
        jante.ajoute(rayon);
        jante.ajoute(rayon);

        jante.affiche();

        PieceCompositeMontee roueDeBrouette = new PieceCompositeMontee("roue de brouette", "1512", 1, 8);
        roueDeBrouette.ajoute(pneu);
        roueDeBrouette.ajoute(chambreAair);
        roueDeBrouette.ajoute(jante);

        roueDeBrouette.affiche();

        // catalogue//
        Catalogue c = new Catalogue();
        c.ajoute(pneu);
        c.ajoute(rayon);
        c.ajoute(chambreAair);
        c.ajoute(disqueDeJante);
        c.ajoute(roueDeBrouette);
        c.ajoute(roueDeBrouetteEnKit);
        c.ajoute(jante);
        c.ajoute(janteEnKit);

        c.ajoute(pneu);
        c.ajoute(roueDeBrouette);

        System.out.println(c.toString());

        c.affichePiece("roue de brouette en kit", "011512");

        // clients

        Civilite M = Civilite.M;
        Civilite Mme = Civilite.Mme;
        Civilite Mlle = Civilite.Mlle;

        Particulier John = new Particulier("Brault", "5 rue Saint Lazard,75000 Paris", "johnbrault@gmail.com ", "john", M);

        Entreprise SEMB= new Entreprise("Société des Eaux Minérales Bas-Tilles", "201 rue des clercs, 38000 Grenoble", "sembsociete@semb.fr", "123 568 941 00056");


        System.out.println(John.toString());
        System.out.println(SEMB.toString());
    }
}
