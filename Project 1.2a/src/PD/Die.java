package PD;
import java.util.Random;
/**
* Die is a Class that represents a Die 
* that has a particular number of faces.
* 
* @package PD
* @author(David Santos) 
*/
public class Die {
	
	private int faces;
	private Random rand = new Random();
	private int currentFace;
	
//default constructor
	/**
	* Instantiates a Die that has 6 faces. 
	*/
	public Die() {
		this.faces = 6 ;//default number of faces
	}
	
// constructor
	/**
	* Instantiates a Die with the specified number of Faces.
	*
	* @param  numFaces  for the number of faces.
	* @throws NumberOfFacesRangeException - if the number of Faces is not greater than 0.
	*/
	public Die(int numFaces) throws NumberOfFacesRangeException {
		this();
		this.setFaces(numFaces);
		
	}
//setters
		public void setFaces(int face) throws NumberOfFacesRangeException{
			if (face <=0){
				NumberOfFacesRangeException exception = 
				new NumberOfFacesRangeException("Number of faces must be greater than zero");
				throw exception;
			}
			else {
			this.faces = face;
			return;
			}
		}

//getters
		public int getFaces() {
			return this.faces;
		}
		
//behavior
		/**
		* Rolls the die and returns a random value based on
		* the number of faces.
		* 
		* @return int face of dice that is up (random number between 1 and number of faces).
		*/	
		public int roll() {
			currentFace = 1 + rand.nextInt(faces);
			return currentFace;
		}
		/**
		* Converts the value of the current face that is up into String and returns it.
		* 
		* @return String of the current face that is up.
		*/	
		public String toString() {
			return Integer.toString(currentFace);
		}
}
