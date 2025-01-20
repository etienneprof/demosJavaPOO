package genericite;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		List<Personne> lesMorts = new ArrayList<>();
		
		lesMorts.add(new Personne("Berger", "Michel"));
		lesMorts.add(new Personne("Kamakawiwo'ole", "Israel"));
		lesMorts.add(new Personne("Blanc", "Michel"));
		
		for (long i = 0; i < 10000L; i++) {
			lesMorts.add(new Personne("Nom" + i, "Prenom" + i));
		}
		
		System.out.println(lesMorts);
		
		lesMorts.remove(0);
		lesMorts.remove(new Personne("Blanc", "Michel"));
		
		System.out.println(lesMorts);
		
		System.out.println(lesMorts.get(0));
		lesMorts.set(0, new Personne("Sardou ", "Michel"));
		
		System.out.println(lesMorts);
		
		System.out.println(lesMorts.get(0).hashCode());
		
		long end = System.currentTimeMillis();
		System.out.println("Le programme s'est exécuté en " + (end - start) + " millisecondes");
	}
}
