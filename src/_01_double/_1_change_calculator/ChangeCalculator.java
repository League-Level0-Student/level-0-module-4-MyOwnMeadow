package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {
		
		// Ask the user how many nickels they have
		String nickleS = JOptionPane.showInputDialog("ENTER THE NUMBER OF NICKLES IN YOUR POSSESION [NUMBERS ONLY, NO LETTERS OR WORDS].");
		
		// Convert their answer to an int.   Hint: Integer.parseInt() 
		int nickles = Integer.parseInt(nickleS);
		
		// Ask the user how many dimes they have, and convert their answer
		String dimeS = JOptionPane.showInputDialog("ENTER THE NUMBER OF DIMES [SAME RULES APLIY].");
		int dimes = Integer.parseInt(dimeS);
		
		// Ask the user how many quarters they have, and convert their answer
		String quartS = JOptionPane.showInputDialog("FINALY, ENTER THE NUMBER OF QUARTERS [YOU CAN ADD UP THE NUMBER OF PEINIES YOURSELF].");
		int quarts = Integer.parseInt(quartS);
		
		// Calculate how much money the user has.  Hint: Use a double variable
		int monyInCents = (nickles*5) + (dimes*10) + (quarts*25);
		System.out.println("Mony (In Cents): " + monyInCents);
		int cents = ((nickles*5) + (dimes*10) + (quarts*25))%100;
		System.out.println("Cents: " + cents);
		int dollors = (((nickles*5) + (dimes*10) + (quarts*25)) - cents)/100;
		System.out.println("Dollors: " + dollors);
		
		String zerop = "";
		if(cents - (cents%10) == 0) {
			zerop = "0";
		}
		JOptionPane.showMessageDialog(null, "CALCULATING...");
		JOptionPane.showMessageDialog(null, "YOU HAVE $" + dollors + "." + zerop + cents + " IN YOUR POSSETION.");
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

