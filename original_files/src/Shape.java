package data;

public class Shape {
	/*
	 * I assume that this is a Square shape
	 * Its l and w have equal magnitude
	 */
	
	private double length;
	private double width;
	private double p;
	
	
	public Shape(double l, double w)
	{
		length = l;
		width = w;	
		p = 0.0;
	}
	
	public void perimeter()
	{
		this.p = 2*(this.length+this.width);
	}
	
	public double getPerimeter()
	{
		return p;
	}
	
	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}
	
	public String toString() {
	    return String.format("(L:%d, W:%d)", length, width);
	  }

}
