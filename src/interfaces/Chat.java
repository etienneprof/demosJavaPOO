package interfaces;

public class Chat extends Animal {

	public Chat(String nom) {
		super(nom);
	}

	@Override
	public void dessiner() {
		System.out.println(" /\\_/\\\r\n"
				+ "( o.o )\r\n"
				+ " > ^ <");
	}

}
