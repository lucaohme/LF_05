
public class Kreis {

	public static void main(String[] args) {

		String S = "*";
		
		System.out.printf("%5s\n", S + S);
		
		System.out.printf("%s%7s", S, S);
		System.out.printf("\n%s%7s", S, S);
		
		System.out.printf("\n%5s\n", S + S);
		
	
		String fahr = "Fahrenheit" ;
		String cel = "Celsius" ;
		
		System.out.printf("\n%-12s|%10s\n", fahr, cel);
		System.out.print("------------------------");
		System.out.printf("\n%-12d|%10.2f\n", -20, -28.8889);
		System.out.printf("%-12d|%10.2f\n", -10, -23.3333);
		System.out.printf("+%-11d|%10.2f\n", 0, -17.7778);
		System.out.printf("+%-11d|%10.2f\n", 20, -6.6667);
		System.out.printf("+%-11d|%10.2f\n", 30, -1.1111);
		
	}

}
 