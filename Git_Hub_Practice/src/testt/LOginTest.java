package testt;

import java.util.Scanner;

public class LOginTest {
	

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter any no :- ");
		int a = obj.nextInt();
		int b = a;
		int r = 0;
		int c = 0;
		while(a>=1) {
			r  = a%10;
			c = r*r*r + c;
			a = a/10;
			
			

		}
		if(b==c)
			System.out.println("Given number is armstrong number");
		else
			System.out.println("Given number is not armstrong number");
		
		
	}

}
