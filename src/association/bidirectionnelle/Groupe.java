package association.bidirectionnelle;

import java.util.ArrayList;
import java.util.List;

public class Groupe {
	private String nom;
	private List<Eleve> eleves = new ArrayList<Eleve>();
	
	public Groupe(String nom, List<Eleve> eleves) {
		this.nom = nom;
		this.eleves = eleves;
	}

	public Groupe(String nom) {
		this.nom = nom;
	}
	
	private void ajouterEleve(Eleve eleveAAjouter) {
		eleves.add(eleveAAjouter);
		eleveAAjouter.setGroupe(this);
	}
	
	/*
	 * Créer une méthode qui ajoute tous les élèves au groupe...
	 * Le paramètre "eleves" est considéré comme un tableau.
	 */
	public void ajouterEleves(Eleve...eleves) {
		System.out.println(eleves.length);
		for (Eleve current : eleves) {
			ajouterEleve(current);
		}
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Eleve> getEleves() {
		return eleves;
	}

	public void setEleves(List<Eleve> eleves) {
		this.eleves = eleves;
	}

	@Override
	public String toString() {
		return "Groupe [nom=" + nom + ", eleves=" + eleves + "]";
	}
}
