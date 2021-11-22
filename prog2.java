package Mypack;
import java.util.Scanner;
public class prog2
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		if(num>0)
		{
			System.err.println("Number is positive");
		}
		else
		{
			System.err.println("Number is negative");
	    }
	}
}


