package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppg3 {

	public static void main(String[] args) {
		
	double x;
	int n;
	
	// Lese inn x fra bruker
	x = Double.parseDouble(showInputDialog("Angi x"));
	
	// Les inn n fra bruker
	n = Integer.parseInt(showInputDialog("Angi n"));
	
	// Beregn resultat
	double resultat = 1;
	int i = 1;
	while (i <= n) {
	
	resultat = resultat * x;
	
	i = i + 1;
	}
	

	// Skriv ut resultat mine beregninger
	
	showMessageDialog(null, resultat);
	
	// skriv ut resultat ved bruk av Mat.pow

	showMessageDialog(null, Math.pow(x, n));
	
	
	
	
	}


	}


