package heritage;

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
	}
}
