package association.bidirectionnelle;

public class TestAssociationBidirectionnelle {
	public static void main(String[] args) {
		Eleve neo = new Eleve("Neo");
		Eleve trinity = new Eleve("Trinity");
		Eleve morpheus = new Eleve("Morpheus");
		Eleve loracle = new Eleve("Loracle");
		Eleve smith = new Eleve("Smith");
		
		Groupe matrix = new Groupe("Matrix");
		
		matrix.ajouterEleves(neo, trinity, morpheus, loracle, smith, new Eleve("Valentin"));
		matrix.ajouterEleves(new Eleve("Clara"));
		
		System.out.println(matrix);
	}
}
