package wilson_p1;

import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fourNum = 0; 
		int	numberSize = 0;
		int a, b, c, d;
		
		Scanner scnr = new Scanner(System.in);
		
		while (numberSize == 0 )
	    {
			System.out.println("Enter a four digit number"); //Prompt user for four digit number
			fourNum = scnr.nextInt();
	    
		
			if (fourNum >= 10000)
			{
				System.out.println("Invalid number. Try again. (only 4-digits)");
			
			}
		else
		numberSize = 1;
	    }
		
		a = fourNum / 1000;
	    b = fourNum / 100 % 10;
	    c = fourNum / 10 % 10;
	    d = fourNum % 10;
	     
	    a = (a + 7)%10;
	    b = (b + 7)%10;
	    c = (c + 7)%10;
	    d = (d + 7)%10;
	     
	    System.out.println("" + c + d + a + b);
		
		
		
		
}
	
	
}
