package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class Test_Score {
	public static void main(String[] args) {
		String testSScore = JOptionPane.showInputDialog(null, "What score did you get on the test?\n" + "[ANCER IN NUMBERS ONLY; DECIMALS ALLOWED]");
		float testScore = Float.parseFloat(testSScore);
		
		if(testScore == 100) {
			JOptionPane.showMessageDialog(null, "Wow! You got a perfict score! That's amazing!");
		}
		else if(testScore == 0) {
			JOptionPane.showMessageDialog(null, "Uh.. did you just not do the test? Or did you purpisly fail it?");
		}
		else if(testScore == 96.5) {
			JOptionPane.showMessageDialog(null, "That's pretty darn good. I got... wait a seconed... we got the exact same score! How cool is that?");
		}
		else if(testScore == 110) {
			JOptionPane.showMessageDialog(null, "Wait... is that even...!? That is the maximem possible score, if you incled the bones quetions.\n"
					+ " Those quetions were really hard! What were the ancers to them?");
		}
		else if(testScore < 20) {
			JOptionPane.showMessageDialog(null, "...Oh... Maybe you shold give up on going to collage, and just work at a factery.");
		}
		else if(testScore < 50) {
			JOptionPane.showMessageDialog(null, "Maybe you shold just give up on going to collage, and just become a chief insted?\n"
					+ "Being a painter might suit you, as well.");
		}
		else if(testScore < 60) {
			JOptionPane.showMessageDialog(null, "Ah, that sucks. You know, you should start studying. Or at least change your stratagy if you do,\n"
					+ "because it is an apsolte failer of a strategy.");
		}
		else if(testScore < 70) {
			JOptionPane.showMessageDialog(null, "Maybe you can come by my house next time to study?\n"
					+ "We could also play some video games during brakes!");
		}
		else if(testScore < 80) {
			JOptionPane.showMessageDialog(null, "So, you got a C, huh? Not to shaby, if I do say so myself.");
		}
		else if(testScore < 90) {
			JOptionPane.showMessageDialog(null, "Hay, that's a prety good score!");
		}
		else if(testScore < 100) {
			JOptionPane.showMessageDialog(null, "You got an A? Awsome!");
		}
		else if(testScore < 110) {
			JOptionPane.showMessageDialog(null, "Oh, you did the bones quetions? That is realy impresive! Those were pretty hard.");
		}
		else if(testScore > 110 ) {
			JOptionPane.showMessageDialog(null, "That's really... Wait a secont, the max score is 110. Ok, what score did you realy get?");
		}
	}
}
