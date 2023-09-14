package UI;

import javax.swing.JFrame;

/**
* MyFrame is a Class that extends JFrame and creates a frame with
* the desired settings.
* 
* @package PD
* @author(David Santos) 
*/
public class MyFrame extends JFrame{
	/**
	* Instantiates MyFrame that exits when you click the close button, has "DiceRoller" as title
	* and contains the panel that we want.
	*
	*/
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("DiceRoller");
		getContentPane().add(new MyPanel());
		this.add(new MyPanel());
		
	}
}
