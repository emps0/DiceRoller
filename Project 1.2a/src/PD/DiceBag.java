package PD;
/**
* DiceBag is a Class that represents a collection of Die 
* that have the same number of faces.
* 
* @package PD
* @author(David Santos) 
*/
public class DiceBag {
	private int faces;
	private int numDice;
	private Die[] dice;
	private int total;
	
//default constructor
	/**
	* Instantiates a DiceBag with 1 Die that has 6 faces. 
	*/
	public DiceBag() {
		this.faces = 6;//default number of faces
		this.numDice = 1;//default number of dice
	}
	
// constructor
	/**
	* Instantiates a DiceBag with the specified number 
	* of Dice with a specific number of faces.  
	*
	* @param  numFaces  for the number of faces on the dice in the bag.
	* @param  numDice  for the number of dice in the bag.
	* @throws NumberOfDiceRangeException - if the number of dice is not greater than 0.
	* @throws NumberOfFacesRangeException - propagates from Dice.
	*/
	public DiceBag(int numFaces, int numDice) throws NumberOfFacesRangeException, NumberOfDiceRangeException {
		this();
		this.setFaces(numFaces);
		this.setNumDice(numDice);
		dice = new Die[numDice];
		for (int i = 0; i < numDice ; i++) {
			dice[i] = new Die(numFaces);
		}
	}
	
//setters	
	public void setFaces(int numFaces) {
		this.faces = numFaces;
		return;
	}
	public void setNumDice(int numDice) throws NumberOfFacesRangeException, NumberOfDiceRangeException{
		if (numDice <= 0){
			NumberOfDiceRangeException exception = new NumberOfDiceRangeException("Number of Dice must be greater than zero");
			throw exception;
		}
		else {
		this.numDice = numDice;
		return;
		}
	}
	
//getters
	public int getFaces() {
		return this.faces;
	}
	public int getNumDice() {
		return this.numDice;
	}
	
//behavior
	/**
	* Rolls each Die in the bag and returns a random value based on
	* the number of faces, and adds it to the result.
	* 
	* @return int result of the sum of each face rolled on each Die.
	*/	
	public int rollBag() {
		total = 0;
//		String resultText = " ";
		
		for(int i = 0; i < numDice; i++) {
			int result = dice[i].roll();
			total += result;

		}
		return total;
	}
	/**
	* Combines the sum of the face values and each face value for each dice rolled
	* in a string that will be returned.
	* 
	* @return String of the result and faces of Die.
	*/	
	public String toString() {
		String result = Integer.toString(total) + " ";
		for (int i = 0; i < numDice; i++) {
			result += dice[i].toString() + " ";
		}
		return result;
	}
}
