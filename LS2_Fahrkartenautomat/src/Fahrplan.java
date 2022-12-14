public class Fahrplan {
	
    public static void main(String[] args) {
    	
        // Weichenstellungen
        int fahrzeit = 0;
        char haltInSpandau = 'n';
        char richtungHamburg = 'n';
        char haltInStendal = 'j';
        char endetIn = 'w'; //h=Hannover, b=Braunschweig, w=Wolfsburg

        fahrzeit = fahrzeit + 8; // Fahrzeit Hbf -> Spandau

        if (haltInSpandau == 'j') {
            fahrzeit = fahrzeit + 2; // Halt in Spandau
        }
        
        if (richtungHamburg == 'j') {
        	fahrzeit = fahrzeit + 96; // Fahrzeit Spandau -> Hamburg
        	} else {
        		fahrzeit = fahrzeit + 34;// Spandau -> Haltepunkt öst. v. Stendal
        
        	if (haltInStendal == 'j') {
        		fahrzeit = fahrzeit + 16; // Haltepunkt öst. v. Stendal -> Hbf Stendal
        	} else {
        		fahrzeit = fahrzeit + 6; // Haltepunkt öst. v. Stendal -> Weiche Stendal
        	}
        
        	if (endetIn == 'w') {
        		fahrzeit = fahrzeit + 29; // Weiche Stendal -> Wolfsburg
        	} else if (endetIn == 'b'){
        		fahrzeit = fahrzeit + 50; // Weiche Stendal -> Braunschweig
        	} else {
        		fahrzeit = fahrzeit + 62; // Weiche Stendal -> Hannover
        }
        	
        }
        
        System.out.print(fahrzeit);
        			
        }
 
    }