import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
				int ct;
				System.out.println("enter a value ");
				Scanner sc=new Scanner(System.in);
				
				int a=sc.nextInt();
				for(int i=2;i<=a;i++)
				{
					ct=0;
					for(int j=2;j<i;j++)
					{
						if((i/j)*j==i)
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



