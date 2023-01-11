import java.util.Scanner;

public class Fahrkartenautomat {

	public static void main(String[] args) {

		Scanner tastatur = new Scanner(System.in);

		int auswahl = 0;
		double zuZahlenderBetrag = 0.0;
		int ticketanzahl = 0;
		double eingezahlterGesamtbetrag;
		double eingeworfeneMuenze;
		double rueckgabebetrag;
		double nochZuZahlen;
		
		
		//Fahrkartenbestellvorgang
		System.out.println("Fahrkartenbestellvorgang:");
		System.out.println("=======================");
		System.out.println("\nWaehlen Sie ihre Wunschfahrkarte fuer Berlin AB aus:");
		System.out.println("\tKurzstrecke AB \t\t[2,00 EUR]\t(1)");
		System.out.println("\tEinzelfahrschein AB \t[3,00 EUR]\t(2)");
		System.out.println("\tTageskarte AB \t\t[8,80 EUR]\t(3)");
		System.out.println("\t4-Fahrten-Karte AB \t[9,40 EUR]\t(4)");

		while (auswahl < 1 || auswahl > 5) {
			System.out.print("\nIhre Wahl: ");
			auswahl = tastatur.nextInt();
				if (auswahl < 1 || auswahl > 5) {
					System.out.println(">>falsche Eingabe<<");
				}
		}

		if (auswahl == 1) {
			zuZahlenderBetrag = 2;
		} else if (auswahl == 2) {
			zuZahlenderBetrag = 3;
		} else if (auswahl == 3) {
			zuZahlenderBetrag = 8.80;
		} else if (auswahl == 4) {
			zuZahlenderBetrag = 9.40;
		}
		
		/*
		// Geldbetrag eingeben
		System.out.print("Ticketpreis (Euro): ");
		zuZahlenderBetrag = tastatur.nextDouble();
		if (zuZahlenderBetrag <= 0) {
			zuZahlenderBetrag = 1;
			System.out.println("Fehlerhafte Eingabe - Ticketpreis wurde auf 1,00 Euro gesetzt");
		}
		*/
		
		// Anzahl Tickets
		while (ticketanzahl < 1 || ticketanzahl > 10) {
			System.out.print("Anzahl der Tickets: ");
			ticketanzahl = tastatur.nextInt();
			
			if (ticketanzahl < 1 || ticketanzahl > 10) {
			System.out.println("Wählen Sie bitte eine eine Anzahl von 1 bis 10 Tickets aus");
			}
		}
		
		
		
		zuZahlenderBetrag = ticketanzahl * zuZahlenderBetrag;

		// Geldeinwurf
		eingezahlterGesamtbetrag = 0.0;
		nochZuZahlen = 0.0;
		while (eingezahlterGesamtbetrag < zuZahlenderBetrag) {
			nochZuZahlen = zuZahlenderBetrag - eingezahlterGesamtbetrag;
			System.out.printf("Noch zu zahlen: %.2f Euro\n", nochZuZahlen);
			System.out.print("\nEingabe (mind. 5 Cent, höchstens 2 Euro): ");
			eingeworfeneMuenze = tastatur.nextDouble();
			eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + eingeworfeneMuenze;
		}

		// Rückgeldberechnung und -ausgabe 
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
}


