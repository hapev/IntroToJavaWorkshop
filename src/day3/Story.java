package day3;

import javax.swing.JOptionPane;

public class Story {


public static void main(String[] args) {
	
	

	String name = JOptionPane.showInputDialog("Enter your name");
	JOptionPane.showMessageDialog(null,"Hello "+ name);
	String option1 = JOptionPane.showInputDialog("Type a or b");
	
	
    if (option1.equals("a")){
    	JOptionPane.showMessageDialog(null,name + ", you lost!");
    
    	
    	
    }


	  
    if (option1.equals("b")){
    	JOptionPane.showMessageDialog(null,name + ", you won!");
    
    	
    	
    
    }}}

	
	

	
	



