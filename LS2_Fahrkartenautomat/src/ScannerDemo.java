	import java.util.Scanner;// Um die Scanner-Klasse zu verwenden, muss diese importiert werden

		public class ScannerDemo {

		    public static void main(String[] args) {

		        int ganzzahl;
		        double kommazahl;
		        String wort;
		        boolean wahrheitswert;
		        char buchstabe;

		        Scanner tastatur = new Scanner(System.in); // Erzeugen eines Objekts der Klasse Scanner

		        System.out.print("Bitte geben Sie eine ganze Zahl ein: ");
		        ganzzahl = tastatur.nextInt();
		        System.out.print("Sie haben " + ganzzahl + " eingegeben!\n\n");

		        System.out.print("Bitte geben Sie eine Zahl mit Nachkommastellen ein: ");
		        kommazahl = tastatur.nextDouble();
		        System.out.print("Sie haben " + kommazahl + " eingegeben!\n\n");

		        System.out.print("Bitte geben Sie eine Wort ein : ");
		        wort = tastatur.next();
		        System.out.print("Sie haben '" + wort + "' eingegeben!\n\n");

		        System.out.print("Bitte geben Sie einen Wahrheitswert ein (true / false): ");
		        wahrheitswert = tastatur.nextBoolean();
		        System.out.print("Sie haben '" + wahrheitswert + "' eingegeben!\n\n");

		        System.out.print("Bitte geben Sie einen einzelnen Buchstaben ein: ");
		        buchstabe = tastatur.next().charAt(0);
		        System.out.print("Sie haben '" + buchstabe + "' eingegeben!\n");
		       
		        tastatur.close();
		    }
		


	}
