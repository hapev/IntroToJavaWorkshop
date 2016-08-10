package day3;

import javax.swing.JOptionPane;

/**
 * Teacher's Note: 
 * Have the kids play with the Speak & Spell. 
 * The first Speak & Spell was introduced at the summer Consumer Electronics Show in June 1978, making it 
 * one of the earliest handheld electronic devices with a visual display to use interchangeable game cartridges. 
 * Discuss with students how you would make this program. 
 * Allow them to code it themselves, or use this recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
speak ("spell Jadif");
		// 2. Catch the user's answer in a String
String word1 = JOptionPane.showInputDialog("how do you spell that?");
		// 3. If the user spelled the word correctly, speak "correct"
if (word1.equalsIgnoreCase("Jadif")){
		// 4. Otherwise say "wrong"
	JOptionPane.showMessageDialog(null, "Correct!");

}

else {
	JOptionPane.showMessageDialog(null, "Wrong!");
	
	
	
	
}

speak ("spell Falmo");
// 2. Catch the user's answer in a String
String word2 = JOptionPane.showInputDialog("how do you spell that?");
// 3. If the user spelled the word correctly, speak "correct"
if (word2.equalsIgnoreCase("falmo")){
// 4. Otherwise say "wrong"
JOptionPane.showMessageDialog(null, "Correct!");

}

else {
JOptionPane.showMessageDialog(null, "Wrong!");




}
speak ("spell oraf");
//2. Catch the user's answer in a String
String word3 = JOptionPane.showInputDialog("how do you spell that?");
//3. If the user spelled the word correctly, speak "correct"
if (word3.equalsIgnoreCase("oraf")){
//4. Otherwise say "wrong"
JOptionPane.showMessageDialog(null, "Correct!");

}

else {
JOptionPane.showMessageDialog(null, "Wrong!");





		// 5. repeat the process for other words
	}
	speak ("spell pneumonoultramicroscopicsilicovolcanoconiosis");
	//2. Catch the user's answer in a String
	String word4 = JOptionPane.showInputDialog("how do you spell that?");
	//3. If the user spelled the word correctly, speak "correct"
	if (word4.equalsIgnoreCase("pneumonoultramicroscopicsilicovolcanoconiosis")){
	//4. Otherwise say "wrong"
	JOptionPane.showMessageDialog(null, "Correct!");

	}

	else {
	JOptionPane.showMessageDialog(null, "Wrong!");




	}

	speak ("spell Jacob Sartorius");
	//2. Catch the user's answer in a String
	String word5 = JOptionPane.showInputDialog("how do you spell that?");
	//3. If the user spelled the word correctly, speak "correct"
	if (word5.equalsIgnoreCase("living trash")){
	//4. Otherwise say "wrong"
	JOptionPane.showMessageDialog(null, "Correct!");

	}

	else {
	JOptionPane.showMessageDialog(null, "Wrong!"); }


	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


