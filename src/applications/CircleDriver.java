package applications;

// Import classes
import circle.Circle;
import circle.Point;

/*
 * Course: CSIS 162 - Programming II
 * Institution: University of Wisconsin-River Falls
 * Development Language: Java
 */

/**
 * <p>
 * 		Constructs a {@link Circle} object by using a {@link Point} object
 * 		as its center.
 * 		Contains the {@link #main} method that "glues" other classes
 *		together and executes the program.
 * </p>
 * <p>
 * 		Depends on:
 * </p>
 * <ul>
 * 		<li>
 * 			{@link Circle}
 * 		</li>
 * 		<li>
 * 			{@link Point}
 * 		</li>
 * </ul>
 * 
 * @author  Brady Lange - <a href = "https://www.linkedin.com/in/brady-lange/" target = "_blank">LinkedIn</a>
 * @version  1.0.1 (01/25/2019)
 * @since  1.0 (09/10/2017)
 */
public class CircleDriver 
{ 
// ------------------- Main Method -------------------
	/**
	 * Instantiates and sets up a {@link Circle} and 
	 * {@link Point}.
	 * 
	 * @param args  Array of command line arguments to be passed
	 */
	public static void main(String[] args) 
	{
		System.out.println("**************************************************************************");
		System.out.println("***                        Circle with Points:                         ***");
		System.out.println("**************************************************************************");
		// Instantiate a Circle object
		Circle circleOne = new Circle(1.0, 0,0);
		
		// Calculate the area of the circle
		double calcArea = circleOne.calcArea();
		String sCalcArea = String.format("%.2f", calcArea);											// Format area to two decimal places  
		Point center = circleOne.getCenter();
		
		// Print the area and the center of the circle
		System.out.println("Circle's Area: " + sCalcArea + "\nCircle's Center: " + center);
		
		// Move the center of the circle
		Point movePoint = new Point(-3,6);
		circleOne.move(movePoint);
		
		// Resize the radius of the circle
		circleOne.resize(0.50);
		
		// Calculate the new area of the circle
		double newArea = circleOne.calcArea();
		String sNewArea = String.format("%.2f", newArea);											// Format new area to two decimal places 
		
		// Print the area and the center of the circle
		System.out.println("**************************************************************************\n");
		System.out.println("Updated Circle Properties: ");
		System.out.println("**************************************************************************");
		System.out.println("Circle's New Area: " + sNewArea + "\nCircle's New Center: " + circleOne.getCenter());
		System.out.println("**************************************************************************\n");
	} 
// ------------------- End Main Method -------------------
} // End of class CircleDriver