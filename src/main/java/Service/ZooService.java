package Service;

import Interface.IZooService;
import Model.Animal;
import Model.Secteur;
import Model.Zoo;

import java.util.ArrayList;
import java.util.List;

public class ZooService implements IZooService {
    public  void AjouterAnimalDansSecteur(Zoo zoo, Animal animal){
        List<Secteur> secteurs = new ArrayList<Secteur>();
        for (Secteur secteur : zoo.getSecteursAnimaux() ){
            if (secteur.getTypeAnimalparsecteur().equals(animal.getTypeAnimal())){
                secteur.AjouterAnimal(animal);

            }
            secteurs.add(secteur);
        }
        zoo.setSecteursAnimaux(secteurs);


    }

}
