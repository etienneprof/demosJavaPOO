package uno;

public abstract class Carte {
	protected String couleur;
	
	public Carte(String couleur) {
		this.couleur = couleur;
	}
	
	public abstract void jouer();
	public abstract boolean estValide(Carte cartePrecedente);

	public String getCouleur() {
		return couleur;
	}
	
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
}
