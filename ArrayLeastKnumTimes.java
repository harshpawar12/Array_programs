package Array;

import java.util.Scanner;

public class ArrayLeastKnumTimes {
	
	void  arr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enetr the element in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter number to check repeted ele");
		int n=sc.nextInt();
		System.out.println("The element are:");
		
		for(int i=0;i<a.length;i++)
		{
			int c=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
				c++;
				}
			}
			if(c==n)
			{
				System.out.println(a[i]);
				break;
			}
			
				
		}
		}
		/*System.out.println("the number are");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}*/
		
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayLeastKnumTimes A=new ArrayLeastKnumTimes();
			A.arr();

	}

}
