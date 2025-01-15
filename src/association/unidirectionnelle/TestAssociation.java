package association.unidirectionnelle;

public class TestAssociation {
	public static void main(String[] args) {
		Animal milou = new Animal("Milou", "Waf waf");
		Animal garfield = new Animal("Garfield", "Lasagnes !");
		
		Personne tintin = new Personne("tintin", milou);
		Personne john = new Personne("John", garfield);
		
		System.out.println(tintin.getAnimal().getNom());
		System.out.println(john.getAnimal().getCri());
		
		tintin.appeler();
	}
}
