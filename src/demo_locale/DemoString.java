package demo_locale;

public class DemoString {
	public static void main(String[] args) {
		String phrase = "hello world";
		
		String phraseTransformee =
				phrase
				.toUpperCase()
				.concat(" !")
				.indent(4)
				.replace('O', 'x');
		
		System.out.println(phrase);
		System.out.println(phraseTransformee);
	}
}
