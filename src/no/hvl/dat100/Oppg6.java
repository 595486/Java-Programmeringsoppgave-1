package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppg6 {

	public static void main(String[] args) {
		
		// Les inn heltall
		
		int Heltall;
		
		int Total = 1;
		
		Heltall = Integer.parseInt(showInputDialog("Fakultet av: "));
		
		// Beregn verdien n!
		
		if (Heltall > 0) {
		
		
		for (int i = 1; i < Heltall + 1; i++) {
		
			
		Total = Total * i;
		
		}
			
		}
		
		// Skrive verdien til n!
		
		System.out.println(Total);

				
	}

	}

