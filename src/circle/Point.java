package circle;

/* 
 * Developer: Brady Lange 
 * Course: Object-Oriented Programming - CSIS 235
 * Class: Point
 * Language: Java
 * Date: 9/10/17
 * Description: This class contains point attributes (X and Y coordinates) and algorithms to modify the attributes. 
 */

// This class is used to be an attribute of the Circle class
public class Point 
{ 
	// Instance variables
	private int x;
	private int y;												// Point coordinates (X = Vertical on graph, Y = Horizontal on graph)

// ------------------- Default Constructor -------------------
	// Default Constructor
	public Point()
	{ 
		// Instantiate default properties
		x = 0;
		y = 0;
	}
// ------------------- End Default Constructor -------------------
	
// ------------------- Alternate Constructor -------------------
	// Alternate Constructor - X-Coordinate, Y-Coordinate 
	public Point(int x, int y)
	{
		// Instantiate properties with parameter values 
		this.x = x;
		this.y = y;
	}
// ------------------- End Alternate Constructor -------------------

// ------------------- Copy Constructor -------------------
	// Copy Constructor - Point
	public Point(Point obj)
	{
		// Instantiate properties with parameter values 
		this.x = obj.x;												// Shallow copy point's x-coordinate	
		this.y = obj.y;												// Shallow copy point's y-coordinate
	} 
// ------------------- End Copy Constructor -------------------
	
// ****************
// *** Setters: ***
// ****************
// ------------------- Set X-Coordinate Method -------------------
	// Method that alters the point's x-coordinate 
	public void setX(int x)
	{
		this.x = x;													// Update point's x-coordinate
	} 
// ------------------- End Set X-Coordinate Method -------------------
	
// ------------------- Set Y-Coordinate Method -------------------
	// Method that alters the point's y-coordinate
	public void setY(int y)
	{
		this.y = y;													// Update point's y-coordinate 
	} 
// ------------------- End Set Y-Coordinate Method -------------------
	
// ------------------- Set X-Coordinate and Y-Coordinate Method -------------------
	// Method that alters the point's x-coordinate and y-coordinate
	public void setXY(int x, int y)
	{
		this.x = x;													// Update point's x-coordinate 
		this.y = y;													// Update point's y-coordinate 
	}
// ------------------- End Set X-Coordinate and Y-Coordinate Method -------------------
	
// ****************
// *** Getters: ***
// ****************
// ------------------- Get X-Coordinate Method -------------------
	// Method that returns the point's x-coordinate
	public double getX()
	{
		return x;												// Return point's x-coordinate
	} 
// ------------------- End X-Coordinate Method -------------------
	
// ------------------- Get Y-Coordinate Method -------------------
	// Method that returns the point's y-coordinate
	public double getY()
	{	
		return y;												// Return point's y-coordinate
	} 
// ------------------- End Get Y-Coordinate Method -------------------
	
// ------------------- Get X-Coordinate and Y-Coordinate Method -------------------
	// Method that returns the point's x-coordinate and y-coordinate
	public Point getXY()
	{
		Point newPoint = new Point(x,y);						// Create new Point object 
		return newPoint; 										// Return point's x and y coordinates
	} 
// ------------------- End Get X-Coordinate and Y-Coordinate Method -------------------
	
// ------------------- To String Method -------------------
	// Method that converts the point's data to a String
	public String toString()
	{
		String data = "(" + x + ", " + y + ")";
		return data;											// Return point's data 
	}
// ------------------- End To String Method -------------------
} // End of class Point