package locale;

import java.util.Locale;

public class DemoLocale {
	public static void main(String[] args) {
		// JDK : Java Development Kit --> pour les devs
		// JRE : Java Runtime Environment --> pour les utilisateurs
		// Ctrl + Shift + O --> imports automatiques
		
		/*
		 * On *instancie* la classe Locale dans une variable "localeFR"
		 * localeFR est une *instance* de la classe Locale.
		 * Pour ça, on a utilisé le *constructeur" avec le mot clé "new"
		 */
		Locale localeFR = new Locale("FR", "fr");
		
		// 3 surcharges du constructeur de Locale
		Locale localeEN = new Locale("EN", "gb");
		Locale localeDE = new Locale("DE");
		Locale localeMarseille = new Locale("FR", "fr", "ma");
		
		System.out.println(localeFR.getCountry());
		System.out.println(localeEN.getCountry());
		
		System.out.println(localeFR.getDisplayName());
		System.out.println(localeEN.getDisplayName());
		
		// Surcharge de la méthode getDisplayLanguage
		System.out.println(localeFR.getDisplayLanguage());
		System.out.println(localeEN.getDisplayLanguage(localeEN));
		System.out.println(localeEN.getDisplayLanguage(localeDE));
		
		System.out.println("****************");
		// Utilisation de la méthode de classe getAvailableLocales()
		Locale[] mesLocales = Locale.getAvailableLocales();
		for (Locale current : mesLocales) {
			System.out.println(current);
		}
		System.out.println(mesLocales.length);
	}
}
