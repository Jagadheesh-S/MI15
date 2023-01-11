import java.util.*;
public class FP {

	public static void main(String[] args) {
		int a,ct;
		System.out.println("enter a value ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		for(int i=2;i<=a;i++)
		{
			ct=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					ct++;
					break;
				}
			
			}
			if(ct==0)
				System.out.println(i+" ");
		}
		
	}

}
