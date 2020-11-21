package applications;

// Import classes
import circle.Point;

/*
 * Course: CSIS 162 - Programming II
 * Institution: University of Wisconsin-River Falls
 * Development Language: Java
 */

/**
 * <p>
 * 		Constructs a {@link Point} object.
 * 		Contains the {@link #main} method to execute the program.
 * </p>
 * <p>
 * 		Depends on:
 * </p>
 * <ul>
 * 		<li>
 * 			{@link Point}
 * 		</li>
 * </ul>
 * 
 * @author  Brady Lange - <a href = "https://www.linkedin.com/in/brady-lange/" target = "_blank">LinkedIn</a>
 * @version  1.0.1 (01/25/2019)
 * @since  1.0 (09/10/2017)
 */
public class PointDriver
{ 
// ------------------- Main Method -------------------
	/**
	 * Instantiates and sets up a {@link Point}.
	 * 
	 * @param args  Array of command line arguments to be passed
	 */
	public static void main(String[] args)
	{ 
		System.out.println("**************************************************************************");
		System.out.println("***                            Point (X, Y):                           ***");
		System.out.println("**************************************************************************");
		Point coordinateOne = new Point(5,3);						// Instantiate a Point object
		
		System.out.println("Coordinate: " + coordinateOne);			// Print out coordinates
		System.out.println("**************************************************************************\n");
	} 
// ------------------- End Main Method -------------------
} // End of class PointDriver