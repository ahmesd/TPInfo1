package Model;

import Interface.IZooService;
import Service.ZooService;

public class App {

    public static void main(String[] args){
        Zoo zoo =new Zoo();
        IZooService iZooService = new ZooService();
        zoo.AjouterSecteur(TypeAnimal.CARNIVORE);
        Animal chien = new Chien("Snoopy",TypeAnimal.CARNIVORE);

        iZooService.AjouterAnimalDansSecteur(zoo,chien);
        System.out.println(zoo.getSecteursAnimaux().size());
        System.out.println(zoo.getSecteursAnimaux().get(0).getAnimauxDansSecteurs().size());

    }
}
