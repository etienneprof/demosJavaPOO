package abstraction;

public class Oiseau extends Animal {
	private boolean peutVoler;
	
	public Oiseau(String nom, boolean peutVoler) {
		super(nom);
		this.peutVoler = peutVoler;
	}
	
	@Override
	public String crier() {
		return "Cui cui";
	}

	public boolean isPeutVoler() {
		return peutVoler;
	}

	public void setPeutVoler(boolean peutVoler) {
		this.peutVoler = peutVoler;
	}

	@Override
	public String toString() {
		String result = super.toString();
		result += "\n\t";
		if (peutVoler) {
			result += "Est capable de voler";
		} else {
			result += "Ne peut pas voler";
		}
		return result;
	}
}
