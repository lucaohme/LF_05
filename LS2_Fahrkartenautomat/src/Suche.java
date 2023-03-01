import java.util.Scanner;

public class Suche {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] zahlenArray = { 1, 5, 5, 7, 3, 11, 22, 23, 27 };
		int zahl = sc.nextInt();
		boolean find = false;
		
		for (int i = 0; i < zahlenArray.length; i++) {
			if (zahlenArray[i] == zahl) {
				find = true;
				break;
		}
		}
		if (find) {
				System.out.println ("Gefunden.");
		} else {
		System.out.println("Nicht gefunden.");
		}	
		sc.close();
		}
	}
