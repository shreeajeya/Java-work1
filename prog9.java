package Mypack;

public class prog9 {

	public static void main(String[] args)
	{
		 int a = 10, b = 25, c = 15, largest;
	        largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
	        System.out.println("largest number among " + a+ ", " + b + " and " + c + " is " + largest);
	}

}
