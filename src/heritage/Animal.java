package heritage;

public class Animal {
	protected String nom;

	public Animal(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		return "Animal : \n\t" + nom;
	}
}
