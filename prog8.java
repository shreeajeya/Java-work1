package Mypack;

public class prog8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       int a = 50, b=60;

        System.out.println("Before swap");
        System.out.println("value of a is : " + a);
        System.out.println("value of b is : " + b);

        a = a - b;
        b = a + b;
        a = b - a;

        System.out.println("After swap");
        System.out.println("value of a is : " + a);
        System.out.println("value of b is : " + b);
	}

}
