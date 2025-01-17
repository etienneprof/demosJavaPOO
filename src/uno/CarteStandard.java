package uno;

public class CarteStandard extends Carte {
	private int valeur;
	
	public CarteStandard(String couleur, int valeur) {
		super(couleur);
		this.valeur = valeur;
	}

	@Override
	public void jouer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean estValide(Carte cartePrecedente) {
		// TODO Auto-generated method stub
		return false;
	}

}
