package visibilite.jeu;

public class TestDe {
	public static void main(String[] args) {
		De monDe = new De();
		De de12 = new De(12);
		
		System.out.println(monDe.getNbFaces());
		System.out.println(de12.getNbFaces());
		
		do {
			monDe.lancer();
			System.out.println(monDe.getResultat());
		} while (monDe.getResultat() != 6);
		
		System.out.println("Nombre de dés instanciés : " + De.getNbDesInstancies());
	}
}
