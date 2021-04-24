import java.util.*;
import java.lang.Math;

public class lineComp {

	public static void main(String[] args){

		System.out.println("Welcome to Line Comparison Computation Program");
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter the Values for First line!!");
		System.out.println("Enter value of x1:-");
		double x1= sc.nextInt();
		System.out.println("Enter value of y1:-");
		double y1= sc.nextInt();
		System.out.println("Enter value of x2:-");
		double x2= sc.nextInt();
		System.out.println("Enter value of y2:-");
		double y2= sc.nextInt();

		System.out.println("Enter the Values for second line!!");
		System.out.println("Enter value of m1:-");
		double m1= sc.nextInt();
		System.out.println("Enter value of n1:-");
		double n1= sc.nextInt();
		System.out.println("Enter value of m2:-");
		double m2= sc.nextInt();
		System.out.println("Enter value of n2:-");
		double n2= sc.nextInt();

		double len1 = Math.sqrt((Math.pow((x2-x1),2)) + (Math.pow((y2-y1),2)));
		System.out.println("The Length of Line 1 is:-" + len1);

		double len2 = Math.sqrt((Math.pow((m2-m1),2)) + (Math.pow((n2-n1),2)));
		System.out.println("The Length of Line 2 is:-" + len2);

		if (len2 == len1)
			System.out.println("The 2 Lines are Equal!!");
		else if (len1 > len2)
			System.out.println("Length of Line 1 is Greater than Length of Line 2");
		else if (len1 < len2)
			System.out.println("Length of Line 1 is Smaller than Length of Line 2");
	}
}
