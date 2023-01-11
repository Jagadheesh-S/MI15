import java.util.*;
public class fp2 {

	public static void main(String[] args) {
		int number,rev=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value: ");
		number=sc.nextInt();
		while(number>0)
		{
			rem=number%10;
			rev=rev*10+rem;
			number=number/10;
		}
		System.out.println("Revers a number: " +rev);

	}

}
