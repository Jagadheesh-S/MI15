import java.util.*;
public class F1 {

	public static void main(String[] args) {
		int n=6;
		int index=2;
	int[] ar=new int[10]; 
	ar[0]=3;
	ar[1]=9;
	ar[2]=5;
	ar[3]=33;
	ar[4]=4;
	ar[5]=7;
	ar[6]=8;
	for(int i=n;i<index;i--)
	{
		ar[i+1]=ar[i];
		ar[index]=ar[i];
	}
	
  }

}

