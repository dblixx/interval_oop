package interval_oop;

/**
 * Each instance of this class represents a sequence of consecutive integers.
 * @author 15105
 * @immutable
 */
public class Interval {
	
	//getters or inspector methods
	
	/**
	 * @basic
	 */
	public int getLowerBound() { throw new RuntimeException("Not yet implimented");}
	
	/**
	 * @basic
	 */
	public int getUpperBound() { throw new RuntimeException("Not yet implimented");}
	
	/**
	 *@post The result equals the upper bound minus the lower bound
	 *		| result == getUpperBound() - getLowerBound() 
	 */
	public int getWidth() {throw new RuntimeException("Not yet implimented");}
	
	/**
	 * @post The result is not null
	 * | getElements() != null
	 */
	public int[] getElements() {throw new RuntimeException("Not yet implimented");}
	
	/**
	 * @pre The given lower bound is not greater than the upper bound.
	 * 		| lowerBound <= upperBound
	 */
	public Interval(int lowerBound, int upperBound) {throw new RuntimeException("Not yet implimented");}
	
	//no mutators -- no methods that
	
}
