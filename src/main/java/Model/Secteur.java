package Model;

import java.util.ArrayList;
import java.util.List;

public class Secteur {
    TypeAnimal typeAnimalparsecteur;
    public List<Animal> animauxDansSecteurs;

    public List<Animal> getAnimauxDansSecteurs() {
        return animauxDansSecteurs;
    }

    public void setAnimauxDansSecteurs(List<Animal> animauxDansSecteurs) {
        this.animauxDansSecteurs = animauxDansSecteurs;
    }

    public TypeAnimal getTypeAnimalparsecteur() {
        return typeAnimalparsecteur;
    }

    public void setTypeAnimalparsecteur(TypeAnimal typeAnimalparsecteur) {
        this.typeAnimalparsecteur = typeAnimalparsecteur;
    }
    public void AjouterAnimal(Animal animal){
        this.animauxDansSecteurs.add(animal);
    }

    public Secteur(TypeAnimal typeAnimalparsecteur) {
        this.animauxDansSecteurs = new ArrayList<>();
        this.typeAnimalparsecteur = typeAnimalparsecteur;
    }
}
