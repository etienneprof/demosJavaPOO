package uno;

import java.util.ArrayList;
import java.util.List;

public class Uno {
	public static void main(String[] args) {
		List<Carte> pioche = new ArrayList<Carte>();
		pioche.add(new CarteStandard("jaune", 5));
		pioche.add(new CarteStandard("jaune", 6));
		pioche.add(new CarteStandard("vert", 6));
		pioche.add(new CartePioche("rouge"));
		
		Carte carteAuHasard = pioche.get(2);
		carteAuHasard.estValide(carteAuHasard);
		
		System.out.println(carteAuHasard.getClass().getSimpleName());
	}
}
