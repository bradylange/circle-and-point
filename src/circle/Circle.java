package circle;

/* 
 * Developer: Brady Lange 
 * Course: Object-Oriented Programming - CSIS 235
 * Class: Circle
 * Language: Java
 * Date: 9/10/17
 * Description: This class contains circle attributes and algorithms to modify the attributes.
 */

// This class contains circle attributes
public class Circle 
{
	// Instance variables
	private double radius;										// Radius of the circle
	private Point center;										// Center coordinates of the circle
	
// ------------------- Default Constructor -------------------
	// Default Constructor
	public Circle()
	{ 
		// Instantiate default properties
		radius = 0;
		center = new Point();
	} 
// ------------------- End Default Constructor -------------------
	
// ------------------- Alternate Constructor -------------------
	// Alternate Constructor - Radius, X-Coordinate, Y-Coordinate 
	public Circle(double rad, int x, int y)
	{ 
		// Instantiate properties with parameter values 
		center = new Point(x,y);
		radius = rad;
	} 
// ------------------- End Alternate Constructor -------------------
	
// ------------------- Copy Constructor -------------------
	// Copy Constructor - Circle
	public Circle(Circle obj)
	{ 
		// Instantiate properties with parameter values 
		this.radius = obj.radius;								// Shallow copy circle's radius
		this.center = obj.center;								// Shallow copy circle's center 
	} 
// ------------------- End Copy Constructor -------------------	
	
// ****************
// *** Setters: ***
// ****************
// ------------------- Set Radius Method -------------------
	// Method that alters the radius the circle
	public void setRadius(double rad)
	{ 
		radius = rad;											// Alter the circle's radius
	} 
// ------------------- End Set Radius Method -------------------
	
// ------------------- Set Center Method -------------------
	// Method that alters the center of the circle
	public void setCenter(int x, int y)
	{
		Point newPoint = new Point(x, y);						// Create new Point object
		center = newPoint;										// Update circle's center 
	} 
// ------------------- End Set Center Method -------------------
	
// ****************
// *** Getters: ***
// ****************
// ------------------- Get Radius Method -------------------
	// Method that returns the radius of the circle
	public double getRadius()
	{
		return radius;											// Return circle's radius
	} 
// ------------------- End Get Radius Method -------------------
	
// ------------------- Get Radius Method -------------------
	// Method that returns the center of the circle
	public Point getCenter()
	{
		return center;											// Return circle's center 
	}
// ------------------- End Get Radius Method -------------------
	
// ------------------- Calculate Area Method -------------------
	// Method that calculates the circle's area
	public double calcArea()
	{
		double calc = radius * radius * Math.PI;				// Calculate circle's area
		return calc;											// Return circle's area 
	} 
// ------------------- End Calculate Area Method -------------------
	
// ------------------- Move Method -------------------
	// Method that moves the center of the circle
	public void move(Point cen)
	{ 
		center = cen;											// Move center of circle based upon x and y coordinate inputs
	} 
// ------------------- End Move Method -------------------
	
// ------------------- Resize Method -------------------
	// Method that resizes the radius of the circle
	public void resize(double size)
	{ 
		radius = (radius * size);								// Resize the radius based upon input
	} 
// ------------------- End Resize Method -------------------
	
// ------------------- To String Method -------------------
	// Method that converts the circle's data to a String
	public String toString()
	{ 
		String data = "Radius = " + radius + "\nCenter = " + center;
		return data;											// Return the circle's data 
	} 
// ------------------- End To String Method -------------------
} // End of class Circle