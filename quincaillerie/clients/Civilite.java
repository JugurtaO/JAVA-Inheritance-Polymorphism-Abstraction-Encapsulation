package clients;

// TODO Questioin 23: Définir l'énumération Civlite.

// 

public enum Civilite {

    M("Monsieur"),
    Mme("Madame"),
    Mlle("Mademoiselle");

    private String denomination;

    Civilite(String s) {
        this.denomination = s;
    }

    // public String getdenomination() {
    //     return this.denomination;
    // }


    public String toString(){
        return this.denomination;
    }
}