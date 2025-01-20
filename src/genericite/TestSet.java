package genericite;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Set<Personne> lesMorts = new HashSet<>();
		
		lesMorts.add(new Personne("Berger", "Michel"));
		lesMorts.add(new Personne("Cassin", "Etienne"));
		lesMorts.add(new Personne("Cassin", "Etienne"));
		lesMorts.add(new Personne("Cassin", "Etienne"));
		lesMorts.add(new Personne("Cassin", "Etienne"));
		lesMorts.add(new Personne("Kamakawiwo'ole", "Israel"));
		lesMorts.add(new Personne("Blanc", "Michel"));
		
		System.out.println(lesMorts);
		
		lesMorts.remove(new Personne("Cassin", "Etienne"));
		
		System.out.println(lesMorts);
		
		long end = System.currentTimeMillis();
		System.out.println("Le programme s'est exécuté en " + (end - start) + " millisecondes");
	}
}
