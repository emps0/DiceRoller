package UI;

import java.awt.Color;
import javax.swing.JOptionPane;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import PD.DiceBag;
import PD.NumberOfDiceRangeException;
import PD.NumberOfFacesRangeException;

/**
* MyPanel is a Class that extends JPanel and creates a panel with
* the desired settings, that is, labels, text fields, a background and a button.
* 
* 
* @package PD
* @author(David Santos) 
*/
public class MyPanel extends JPanel {

	private JButton push;
	private JLabel label;
	private String result = "";
	private int numFaces;
	private int numDice; 
	private JTextField textField;
	private JTextField textField2;
	//Tuple TEXTFIELDDIMENSION = new Tuple(100,40); learn how to do that later

	/**
	* Instantiates MyPanel that contains the button "Roll!!", a label containing "Result"
	* and the current result, a label containing "Enter number of Dice:"
	* and a label containing "Enter number of Faces:", two text fields, the CYAN collor
	* and a preferred dimension.
	*
	*/
	public MyPanel() {

		//creating roll button-----------------------------------------
		push = new JButton("Roll!!");
		push.addActionListener(new RollButtonListener());
		//--------------------------------------------------------------
		
		//label with result that will be updated in listener------------
		label = new JLabel("Result:" + result);
		//--------------------------------------------------------------
		
		//creating labels for entering number of dice and faces
		JLabel labelNumDice = new JLabel("Enter number of Dice:");
		JLabel labelNumFaces = new JLabel("Enter number of Faces:");
		//--------------------------------------------------------------
		
		//text fields to enter numFaces and numDice---------------------
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(100,40));
		textField2 = new JTextField();
		textField2.setPreferredSize(new Dimension(100,40));
		//--------------------------------------------------------------
		//adding stuff to the panel-------------------------------------
		this.add(labelNumDice);
		this.add(textField);
		this.add(labelNumFaces);
		this.add(textField2);
		this.add(push);
		this.add(label);
		//--------------------------------------------------------------
		
		setBackground(Color.CYAN);
		setPreferredSize(new Dimension(300, 170));

	}

	// Declare as an inner class so we can access the private class variables
	/**
	* RollButtonListener is a class that implements ActionListener and 
	* has only actionPerformed..
	* 
	* @package PD
	* @author(David Santos) 
	*/
	private class RollButtonListener implements ActionListener {
		/**
		* Sets number of Dice and Faces to inputs, creates a new DiceBag and rolls the bag.
		* The result calculated is displayed beside the text "Result"  
		*
		* @param  event
		*/


		@Override
		public void actionPerformed(ActionEvent event) {
			try {
				numDice = Integer.parseInt(textField.getText());
				numFaces = Integer.parseInt(textField2.getText());
			}
			catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Your input should be an integer number!", "An Exception has occured", JOptionPane.WARNING_MESSAGE);
			}
			try	{
			DiceBag dicebag = new DiceBag(numFaces, numDice);
			dicebag.rollBag();
			result = dicebag.toString();
			label.setText("Result: " + result);
			}
			catch(NumberOfDiceRangeException e) {
				result = "0";
				label.setText("Result: " + result);
				
				JOptionPane.showMessageDialog(null, "Number of dice must be greater than zero!", "An Exception has occured", JOptionPane.WARNING_MESSAGE);
			}
			catch(NumberOfFacesRangeException e) {
				result = "0";
				label.setText("Result: " + result);
				JOptionPane.showMessageDialog(null, "Number of faces must be greater than zero!", "An Exception has occured", JOptionPane.WARNING_MESSAGE);
			}
		}
	}

}
