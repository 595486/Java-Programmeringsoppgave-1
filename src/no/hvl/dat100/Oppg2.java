package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppg2 {

	public static void main(String[] args) {
		
		int NedreGrense;
		int �vreGrense;
		
		int i = 1;
		int rest;
		
		NedreGrense = Integer.parseInt(showInputDialog("Nedre Grense: "));
		�vreGrense = Integer.parseInt(showInputDialog("�vre Grense: "));
		
		i = NedreGrense;
		
		while (i <= �vreGrense) {
			
		rest = i % 2;
		
		if (rest != 0) {
			
		showMessageDialog(null, i);
		
		}
		
		i = i + 1;

	}

	}

}
