public class Mittelwert {

   public static void main(String[] args) {

      // (E) "Eingabe"
      // Werte für x und y festlegen:
      // ===========================
      double x = 2.0;
      double y = 4.0;
    
      
      // (V) Verarbeitung
      // Mittelwert von x und y berechnen:
      // ================================

     double m = berechneMittelwert(x,y);
      
      // (A) Ausgabe
      // Ergebnis auf der Konsole ausgeben:
      // =================================
      System.out.printf("Der Mittelwert von %.2f und %.2f ist %.2f\n", x, y, m);
   }
   
   static double berechneMittelwert(double x, double y) {
       double m = (x + y) / 2.0;
       return m;
   }

}