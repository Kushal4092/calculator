package work1;
/*
 * <p>Title: Lab 1</p>
 * <p>Description: Making a Program</p>
 * 
 * @author kushal Penugonda
 */

// class definition
public class Work1App  // class header
{
	public static void main(String[] args )// main method header
	{
		// variable declarations
		int x;
		int y;
		double z;
		
		//assignment and output statements
		x=1+3*2;
		System.out.println("x is " + x);
		
		y=x+x;
		System.out.println("y is "+ y);
		
		y = y +1;
		System.out.println("y is now "+y);
		
		x=x-5;
		System.out.println("x is now "+x);
		
		z=y/x;
		System.out.println("z is "+z);
		
		y=y/x;
		System.out.println("y is now "+ y);
	}

}