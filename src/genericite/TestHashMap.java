package genericite;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
	public static void main(String[] args) {
		Map<String, Personne> contacts = new HashMap<>();
		
		contacts.put("Berger", new Personne("Berger", "Michel"));
		contacts.put("Cassin", new Personne("Cassin", "Etienne"));
		contacts.put("Kamakawiwo'ole", new Personne("Kamakawiwo'ole", "Israel"));
		contacts.put("Blanc", new Personne("Blanc", "Michel"));
		
		System.out.println(contacts.get("Berger"));
		contacts.remove("Berger");
		
		System.out.println(contacts.get("Berger"));
		
		
		contacts.put("Cassin", new Personne("Cassin", "Antoine"));
		System.out.println(contacts.get("Cassin"));
		
		// Map<String, List<Personne>> contactsAlphabetique = new HashMap<>();
	}
}
