package factorial_new;
import java.util.*;

public class Factorial {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number  : ");
		int number = input.nextInt();
		
		int fact = 1;
		
		for(int i=1;i<=number;i++)
		{
			fact = fact * i;
		}
		System.out.println("Factorial of Given number "+number+" is "+fact);
	}

}
