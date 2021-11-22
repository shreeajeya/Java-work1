package Mypack;
import java.util.Scanner; 
public class prog6
{
	 public static void main(String[] args)
	 {
	        Scanner sc=new Scanner(System.in);  
	        System.out.print("Enter the breadth: ");  
	        int b = sc.nextInt();
	        System.out.print("Enter the height: ");  
	        int h = sc.nextInt();
	        float area;
	        area = (1/2)*b*h;
	        System.out.println("Area: "+area);  
	 }

}
