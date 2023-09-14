package PD;

/**
* NumberOfDiceRageException is a Class that extends Extension and creates an Exception
* that should be raised when the number of Dice to be rolled is smaller or equal to 0.
* 
* @package PD
* @author(David Santos) 
*/
public class NumberOfDiceRangeException extends Exception{
	NumberOfDiceRangeException(){
		super();
	}
	NumberOfDiceRangeException(String message){
		super(message);
	}
}
