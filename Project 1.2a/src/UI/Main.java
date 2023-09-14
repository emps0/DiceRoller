package UI;
import PD.NumberOfDiceRangeException;
import PD.NumberOfFacesRangeException;
import Test.Tester;
/**
* Main is a Class that runs the testers from the Test Package.
* 
* @package UI
* @author(David Santos) 
*/
public class Main {
	/**
	* Instantiates Main and is a runnable program.
	* 
	* @param  agrs for running the program
	* @throws NumberOfDiceRangeException - propagates from DiceBag.
	* @throws NumberOfFacesRangeException - propagates from Dice.
	*/
	public static void main(String[] args) throws NumberOfFacesRangeException, NumberOfDiceRangeException {
		// TODO Auto-generated method stub
		Tester test1 = new Tester();
		test1.ac1(10, 10);
		System.out.println(test1.ac2(10, 100));
//		System.out.println(test1.ac3(10));
		int[] result = test1.ac3(10);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
