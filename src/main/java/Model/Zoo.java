package Model;

import Exceptions.LimiteVisiteurException;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private Integer visiteurs;
    private static Integer nbvisiteurMaxParsecteur = 15;
    public List<Secteur> secteursAnimaux;

    public List<Secteur> getSecteursAnimaux() {
        return secteursAnimaux;
    }

    public void setSecteursAnimaux(List<Secteur> secteursAnimaux) {
        this.secteursAnimaux = secteursAnimaux;
    }

    public Integer getVisiteurs() {
        return visiteurs;
    }

    public void setVisiteurs(Integer visiteurs) {
        this.visiteurs = visiteurs;
    }

    public Integer getNbvisiteurMaxParsecteur() {
        return nbvisiteurMaxParsecteur;
    }

    public void setNbvisiteurMaxParsecteur(Integer nbvisiteurMaxParsecteur) {
        this.nbvisiteurMaxParsecteur = nbvisiteurMaxParsecteur;
    }

    public Zoo(Integer visiteurs, List<Secteur> secteursAnimaux) {
        this.visiteurs = visiteurs;
        this.secteursAnimaux = secteursAnimaux;
    }

    public Zoo() {
        this.visiteurs= 0;
        this.secteursAnimaux = new ArrayList<Secteur>();
    }
    public void  AjouterSecteur(TypeAnimal typeAnimal){
        Secteur secteur = new Secteur(typeAnimal);
        secteursAnimaux.add(secteur);
    }
    public  void NouveauVisiteur() throws LimiteVisiteurException {
        int nb = this.visiteurs + 1 ;
        if (nb > secteursAnimaux.size()*nbvisiteurMaxParsecteur){
            throw new LimiteVisiteurException("le nombre des visiteurs atteint le maximum");
        }
        this.visiteurs = nb ;
    }
}
