package UI;

import javax.swing.JFrame;

import PD.NumberOfDiceRangeException;
import PD.NumberOfFacesRangeException;
/**
* StartUI is a Class that runs the windowed program
* 
* @package UI
* @author(David Santos) 
*/
public class StartUI {
	/**
	* Instantiates StartUI and is a runnable program.
	* 
	* @param  agrs for running the program
	*/
	
	public static void main(String[] args) {

		JFrame frame = new MyFrame();
		frame.pack(); // set the size based on content
		frame.setVisible(true); // so we can see the frame
	}

}
