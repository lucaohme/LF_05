import java.util.Scanner;

public class Fahrkartenautomat {

	public static void main(String[] args) {

		Scanner tastatur = new Scanner(System.in);

		double zuZahlenderBetrag;
		double rueckgabebetrag;
		double eingezahlterGesamtbetrag;

		begruessung();
		zuZahlenderBetrag = fahrkartenbestellungErfassen(tastatur);
		eingezahlterGesamtbetrag = fahrkartenBezahlen(tastatur, zuZahlenderBetrag);
		fahrkartenAusgeben();

		// Rückgeldberechnung und -ausgabe

		rueckgabebetrag = eingezahlterGesamtbetrag - zuZahlenderBetrag;

		if (rueckgabebetrag > 0.0) {
			System.out.printf("Der Rückgabebetrag in Höhe von %.2f Euro", rueckgabebetrag);
			System.out.println(" wird in folgenden Münzen ausgezahlt:");

			while (rueckgabebetrag >= 2.0) { // 2-Euro-Münzen
				System.out.println("2 Euro");
				rueckgabebetrag = rueckgabebetrag - 2.0;
			}
			while (rueckgabebetrag >= 1.0) { // 1-Euro-Münzen
				System.out.println("1 Euro");
				rueckgabebetrag = rueckgabebetrag - 1;
			}
			while (rueckgabebetrag >= 0.5) { // 50-Cent-Münzen
				System.out.println("50 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.5;
			}
			while (rueckgabebetrag >= 0.2) { // 20-Cent-Münzen
				System.out.println("20 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.2;
			}
			while (rueckgabebetrag >= 0.1) { // 10-Cent-Münzen
				System.out.println("10 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.1;
			}
			while (rueckgabebetrag >= 0.048) { // 5-Cent-Münzen
				System.out.println("5 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.04;
			}
		}

		System.out.println("\nVergessen Sie nicht, den Fahrschein\n" + "vor Fahrtantritt entwerten zu lassen!\n"
				+ "Wir wünschen Ihnen eine gute Fahrt.");

		tastatur.close();

	}

	// Begruessung
	static void begruessung() {
		System.out.println("Herzlich Willkommen!");
		System.out.println("\nWaehlen Sie eine Fahrkarte aus:");
	}

	// Kartenauswahl und Tickets
	static double fahrkartenbestellungErfassen(Scanner tastatur) {

		int auswahl = 0;
		double zuZahlenderBetrag = 0.0;

		double gesamt = 0;

		while (true) {

			double[] Fahrkartenpreise = { 3.0, 3.5, 3.8, 2.0, 8.6, 9.2, 10.0, 9.4, 12.6, 13.8, 25.5, 26.0, 26.5 };
			String[] Fahrkartenbezeichnung = { "Einzelfahrschein AB", "Einzelfahrschein BC", "Einzelfahrschein ABC",
					"Kurzstrecke AB", "Tageskarte AB", "Tageskarte BC", "Tageskarte ABC", "4-Fahrten-Karte AB",
					"4-Fahrten-Karte BC", "4-Fahrten-Karte ABC", "Kleingruppen-Tageskarte AB",
					"Kleingruppen-Tageskarte BC", "Kleingruppen-Tageskarte ABC" };

			for (int i = 0; i < Fahrkartenpreise.length; i++) {
				System.out.printf("%-30s %10.2f EUR %5d\n", Fahrkartenbezeichnung[i], Fahrkartenpreise[i], i + 1);
			}
			System.out.println("Bezahlen \t\t\t\t\t 0");

			while (true) {
				System.out.print("\nIhre Wahl: ");
				auswahl = tastatur.nextInt();

				if (!((auswahl >= 0 && auswahl < Fahrkartenbezeichnung.length + 1))) {
					System.out.println(">>falsche Eingabe<<");
				} else {
					break;
				}
			}

			if (auswahl == 0)
				break;

			zuZahlenderBetrag = Fahrkartenpreise[auswahl - 1];

			// Anzahl Tickets

			int ticketanzahl = 0;
			while (ticketanzahl < 1 || ticketanzahl > 10) {
				System.out.print("Anzahl der Tickets: ");
				ticketanzahl = tastatur.nextInt();

				if (ticketanzahl < 1 || ticketanzahl > 10) {
					System.out.println("Wählen Sie bitte eine eine Anzahl von 1 bis 10 Tickets aus");
				}
			}

			zuZahlenderBetrag = ticketanzahl * zuZahlenderBetrag;
			gesamt = gesamt + zuZahlenderBetrag;
			System.out.printf("\nZu zahlender Betrag: %.2f Euro\n", zuZahlenderBetrag);

			System.out.printf("\nZwischensumme: %.2f Euro\n", gesamt);
		}
		return gesamt;
	}

	// Geldeinwurf
	static double fahrkartenBezahlen(Scanner tastatur, double zuZahlenderBetrag) {

		double eingezahlterGesamtbetrag = 0.0;
		double nochZuZahlen = 0.0;
		double eingeworfeneMuenze;

		while (eingezahlterGesamtbetrag < zuZahlenderBetrag) {
			nochZuZahlen = zuZahlenderBetrag - eingezahlterGesamtbetrag;
			System.out.printf("Noch zu zahlen: %.2f Euro\n", nochZuZahlen);
			System.out.print("\nEingabe (mind. 5 Cent, höchstens 2 Euro): ");
			eingeworfeneMuenze = tastatur.nextDouble();
			eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + eingeworfeneMuenze;
		}

		return eingezahlterGesamtbetrag;
	}

	static void fahrkartenAusgeben() {
		System.out.println("\nFahrschein wird ausgegeben");
		for (int i = 0; i < 8; i++) {
			System.out.print("=");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n\n");
	}

}
