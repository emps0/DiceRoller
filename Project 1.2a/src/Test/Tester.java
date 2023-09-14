package Test;
import PD.DiceBag;
import PD.Die;
import PD.NumberOfDiceRangeException;
import PD.NumberOfFacesRangeException;

public class Tester {

	public void ac1(int numDice, int numFaces) throws NumberOfFacesRangeException, NumberOfDiceRangeException {
		DiceBag diceBag = new DiceBag(numFaces, numDice);
		diceBag.rollBag();
		System.out.println(diceBag.toString());
		return;
		
	}
	public boolean ac2(int numFaces, int times) throws NumberOfFacesRangeException {
		Die die = new Die(numFaces);
		for (int i = 0; i < times ; i++) {
			int value = die.roll();
			if(value < 1 && value > numFaces) {
				return false;
			}
		}
		return true;
	}
	public int[] ac3(int numFaces) throws NumberOfFacesRangeException {
		int[] array1 = new int[numFaces];
		Die die = new Die(numFaces);
		for(int i = 0; i < 100; i++) {
			array1[die.roll()-1]++;
		}
		
		return array1;
		
	}
	
			
}
