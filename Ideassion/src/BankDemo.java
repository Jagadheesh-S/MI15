package Banking;
import java.util.Scanner;

public class BankDemo {

	public static void main(String[] args) {
		String Acc_No;
		String Acc_Holder_Name;
		int ch=0,amount;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Account_Number: ");
		Acc_No=scanner.nextLine();
		System.out.println("Enter Account Holder Name: ");
		Acc_Holder_Name=scanner.nextLine();
		SavingsAccount checking = new SavingsAccount(Acc_No,Acc_Holder_Name);
		
		
		while(ch!=4) {
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.Check Balance");
		System.out.println("4.Exit");
		
		System.out.println("Enter your choice: ");
		ch=scanner.nextInt();
		
		switch(ch)
		{
		case 1:
			System.out.println("Enter Deposit Amount: ");
			amount=scanner.nextInt();
			checking.deposit(amount);
			System.out.println("Your Balance is: " +checking.getBalance());
			break;
		case 2:
			System.out.println("Enter Withdraw Amount: ");
			amount=scanner.nextInt();
			checking.withdraw(amount);
			System.out.println("Your Balance is: " +checking.getBalance());
			break;
		case 3:
			System.out.println("Your Balance is: " +checking.getBalance());
			break;
		case 4:
			System.out.println(" Exit ");
			break;
		default:
			System.out.println("Invalid Choice");
		}
		System.out.print("---------------------");
		System.out.print("\n");
	}
	}

}
