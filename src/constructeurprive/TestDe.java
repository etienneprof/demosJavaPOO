package constructeurprive;

public class TestDe {
	public static void main(String[] args) {
		De monDe = De.creerDeAvecNFaces(6);
		De de12 = De.creerDePipe(12);
		De de6 = De.standard();
		
		System.out.println(monDe.getNbFaces());
		System.out.println(de12.getNbFaces());
		
		do {
			monDe.lancer();
			System.out.println(monDe.getResultat());
		} while (monDe.getResultat() != 6);
		
		System.out.println("Nombre de dés instanciés : " + De.getNbDesInstancies());
	}
}
