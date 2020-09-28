package input01;

import javax.swing.JOptionPane;

public class Input01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        //Create a JOptionPane.
//		        //Store the input as a String and print it.
//		String [] desserts = {"Ice cream", "Cake", "Chocolate"};
//		        String input = (String)JOptionPane.showInputDialog(null,
//		        		"Choose a dessert",
//		        		"Desserts",
//		        		2,
//		        		null,
//		        		desserts,
//		        		desserts[0]);
//		        System.out.println(input);
		        
		        String [] icecream = {"Chocolate", "Vanilla", "Strawberry"};
		        String input = (String)JOptionPane.showInputDialog(null,
		        		"Choose a flavour",
		        		"Ice cream flavours",
		        		3,
		        		null,
		        		icecream,
		        		icecream [0]);
		        System.out.println(input);
		        
		
		        //Parse the input as an int.
		        //Print its value +1
		        //int input = Integer.parseInt(JOptionPane.showInputDialog("Input a number"));
		       // input++;
		        //System.out.println(input);
		 
		        
		        
		        //Try creating a dialog, parsing it, and initializing an int in a single line.
		        //You should have only one semicolon (;) in this line.

		       //int input = Integer.parseInt(JOptionPane.showInputDialog("Input a number") + 1);
		    }
	}


