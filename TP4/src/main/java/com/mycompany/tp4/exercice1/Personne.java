package com.mycompany.tp4.exercice1;

/** TP4 - Exercice 1 / Question 1 : classe Personne. */
public class Personne {
    private float solde;
    private int id;
    private String nom;
    private String prenom;
    private long NCIN;

    // Constructeur par défaut : personne "vide"
    public Personne() {
        initPersonne();
    }

    // Constructeur paramétré
    public Personne(int id, String nom, String prenom, long NCIN, float solde) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.NCIN = NCIN;
        this.solde = solde;
    }

    // Initialise (ou réinitialise) la personne
    public void initPersonne() {
        this.id = 0;
        this.nom = "";
        this.prenom = "";
        this.NCIN = 0;
        this.solde = 0;
    }

    // Retourne 1 si la personne est vide, 0 sinon
    public int personneVide() {
        return (nom == null || nom.isEmpty()) && (prenom == null || prenom.isEmpty()) ? 1 : 0;
    }

    public void afficher() {
        System.out.println("ID : " + id + " | " + nom + " " + prenom
                + " | NCIN : " + NCIN + " | Solde : " + solde);
    }

    // Débite le compte : retourne 1 si OK, 0 si solde insuffisant
    public int debiter(float valeur) {
        if (valeur > 0 && valeur <= solde) {
            solde -= valeur;
            return 1;
        }
        return 0;
    }

    // Ajoute au solde : retourne 1 si OK, 0 sinon
    public int ajout(float valeur) {
        if (valeur > 0) {
            solde += valeur;
            return 1;
        }
        return 0;
    }

    // Getters / setters
    public float getSolde() { return solde; }
    public void setSolde(float solde) { this.solde = solde; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }
    public long getNCIN() { return NCIN; }
    public void setNCIN(long NCIN) { this.NCIN = NCIN; }
}
