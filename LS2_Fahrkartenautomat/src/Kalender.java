import java.util.Scanner;

public class Kalender {

	public static void main(String[] args) {

		int tage = 0;
		int monat;
		Scanner tastatur = new Scanner(System.in);

		System.out.print("Wie lautet der Monat (1-12): ");
		monat = tastatur.nextInt();

		if (monat >= 1 && monat <= 12) {

			switch (monat) {
			case 1, 3, 5, 7, 8, 10, 12:
				tage = 31;
				break;
			case 2:
				tage = 28;
				break;
			default:
				tage = 30;
			}
			System.out.printf("Der %d-te Monat im Jahr hat %d Tage.", monat, tage);
			tastatur.close();
		} else {
			System.out.println("Ungueltigen Monat angegeben!");
		}

	}
}
