/*
 * The objects of the class {@code Point} represent mutable 
 * points in the plane.
 * 
 * @author ALopes IP2324
 * @author omeir haroon 61810
 */
public class Point {
	
	//default values
	private static final double DEFAULT_X = 0.0;
	private static final double DEFAULT_Y = 0.0;
	//values
	private double x = getX();
	private double y = getY();

	/**
	 * Constructs a point at the origin (0,0) of the coordinate space.
	 * 
	 * @ensures {@code getX() == 0.0 && getY() == 0.0}
	 */
	public Point (){
			this(DEFAULT_X, DEFAULT_Y);
	}

	/**
	 * Constructs a point at the specified location in the 
	 * coordinate space.
	 * 
	 * @param x coordinate of the point in the X axis
	 * @param y coordinate of the point in the Y axis
	 * @ensures {@code getX() == x && getY() == y}
	 */
	public Point (double x, double y){
		this.x = x;
		this.y = y;
	}

	/**
	 * Returns the coordinate of the point in the X axis in double precision.
	 * 
	 * @return the coordinate of the point in the X axis in double precision
	 */
	public double getX (){
		return ((int)x%10);
	}

	/**
	 * Returns the coordinate of the point in the Y axis.
	 * 
	 * @return The coordinate of the point in the Y axis.
	 */
	public double getY (){
		return 0; //TODO: CHANGE ME
	}

	/**
	 * Translates this point by dx along the X axis and dy along 
	 * the Y axis.
	 * 
	 * @param dx Distance to X axis
	 * @param dy Distance to Y axis
	 */
	public void translate (double dx, double dy){
		//TODO
	}
	
	/**
	 * Moves this point to the specified location in the coordinate plane.
	 * 
	 * @param x  The new coordinate of the point in the X axis
	 * @param y The new coordinate of the point in the Y axis
	 * @ensures {@code getX() == x  && getY() == y }
	 */
	public void move (double x, double y){
		//TODO
	}

	/**
	 * Returns a copy of this point.
	 * 
	 * @return A copy of this point.
	 * @ensures {@code \result != null}
	 * @ensures {@code \result.getX() == this.getX()}
	 * @ensures {@code \result.getY() == this.getY()}
	 */
	public Point copy (){
		return null; //TODO: CHANGE ME
	}

	/**
	 * Returns the distance from this Point to a specified point.
	 * 
	 * @param otherPoint The other point
	 * @requires {@code  otherPoint != null}
	 * @return The distance from this to the specified point
	 * @ensures {@code \result >= 0} 
	 **/
	public double distance (Point otherPoint){
		return 0; //TODO: CHANGE ME
	}

	/**
	 * Returns a string representation of this point and its location 
	 * in the coordinate space.
	 * 
	 * @return String representando este ponto
	 */
	public String toString (){
		return null; //TODO: CHANGE ME
	}


	/**
	 * Determines whether or not three points are colinear.
	 * 
	 * @param otherPoint1 One point
	 * @param otherPoint2 Another ponto
	 * @return If this and the given two points are colinear
	 * @requires {@code  otherPoint1 != null && otherPoint2 != null}
	 */
	public boolean colinear(Point otherPoint1, Point otherPoint2){
		return false; //TODO: CHANGE ME
	}

}
