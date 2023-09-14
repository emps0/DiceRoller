package PD;

/**
* NumberOfFacesRageException is a Class that extends Extension and creates an Exception
* that should be raised when the number of Faces of the Dice to be rolled is smaller or equal to 0.
* 
* @package PD
* @author(David Santos) 
*/
public class NumberOfFacesRangeException extends Exception{
	NumberOfFacesRangeException(){
		super();
	}
	NumberOfFacesRangeException(String message){
		super(message);
	}
}
