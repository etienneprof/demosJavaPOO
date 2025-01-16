package heritage;

import java.util.ArrayList;
import java.util.List;

public class TestAnimal {
	public static void main(String[] args) {
		Animal ori = new Animal("Ori");
		Herisson sonic = new Herisson("Sonic", 8);
		Renard tails = new Renard("Tails", "Orange");
		Oiseau bipbip = new Oiseau("Bip bip", false);
		Oiseau titi = new Oiseau("Titi", true);
		
		System.out.println(ori.getNom());
		
		System.out.println(sonic.getNom());
		System.out.println(sonic.getNbAiguilles());
		
		System.out.println(tails.getNom());
		System.out.println(tails.getCouleur());
		
		System.out.println(bipbip.getNom());
		System.out.println(bipbip.isPeutVoler());
		
		System.out.println(titi.getNom());
		System.out.println(titi.isPeutVoler());
		
		System.out.println("\n\n\n");
		
		System.out.println(ori);
		System.out.println(sonic);
		System.out.println(tails);
		System.out.println(bipbip);
		System.out.println(titi);
		
		dessiner(ori);
		dessiner(sonic);
		dessiner(tails);
		
		// transtypage ascendant : mes instances sont de type "Herisson" et "Oiseau", mais je les stocke dans une liste
		// de "Animal".
		List<Animal> animaux = new ArrayList<Animal>();
		animaux.add(sonic);
		animaux.add(bipbip);
		animaux.add(ori);
		
		// Polymorphisme : l'affichage de "current" utilise bien le toString de la classe la plus précise.
		for (Animal current : animaux) {
			System.out.println(current);
		}
		
	}
	
	// transtypage ascendant : je généralise une instance initialement précise.
	public static void dessiner(Animal animal) {
		System.out.println("***********************************");
		System.out.println(animal);
		// transtype descendant : je pars d'une instance générique et je la traite comme une instace plus précise
		if (animal instanceof Herisson) {
			Herisson herisson = (Herisson) animal; // un animal devient un hérisson
			System.out.println("Nombre d'aiguilles : " + herisson.getNbAiguilles());
		}
		
		System.out.println("***********************************");
		
		
	}
	
	
}














