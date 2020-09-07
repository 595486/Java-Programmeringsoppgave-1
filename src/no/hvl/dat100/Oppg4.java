package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppg4 {

	public static void main(String[] args) {
		
		// Les inn bruttoinntekt
		
		double Skatt = 0;
		int Inntekt = 0;
		
		Inntekt = Integer.parseInt(showInputDialog("Inntekt"));
	
		
		// Beregn trinnskatten
		
		if (Inntekt <= 164100) {
			
		Skatt = Inntekt * 0.00;
				
		}
		
		else if (Inntekt <= 230950) {
			
		Skatt = Inntekt * 0.93;
		
		}

		else if (Inntekt <= 580650) {
		
		Skatt = Inntekt * 2.41;
	
		}
		
		else if (Inntekt <= 934050) {
			
		Skatt = Inntekt * 11.52;
		
		}
		
		else {
			
		Skatt = Inntekt * 14.52;
			
		}
		// Skriv ut trinnskatten

		showMessageDialog(null, Skatt);
		
	}

}
