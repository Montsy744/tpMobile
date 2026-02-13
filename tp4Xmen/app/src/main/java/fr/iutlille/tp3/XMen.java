package fr.iutlille.tp3;

import androidx.annotation.DrawableRes;

public class XMen {
    // variables représentant les informations
    private String nom;
    private String alias;
    private String description;
    private String pouvoir;

    private @DrawableRes int idImage;

    public XMen(String nom, String alias, String description, String pouvoir, int idImage) {
        this.nom = nom;
        this.alias = alias;
        this.description = description;
        this.pouvoir = pouvoir;
        this.idImage = idImage;
    }

    // constructeur sans paramètre
    public XMen(){
        nom = "inconnu";
        this.idImage = R.drawable.undef;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getPouvoir() {
        return pouvoir;
    }

    public void setPouvoir(String pouvoir) {
        this.pouvoir = pouvoir;
    }

    public int getIdImage() {
        return idImage;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }
}
