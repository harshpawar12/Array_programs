package Array;

import java.util.Scanner;

public class ArraySpecificTwo {
	int []arr(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==67)
			{
				System.out.println("thous are present.");
			
			}
			else if( a[i]==77)
			{
				System.out.println(" present");
				break;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elemnt in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		ArraySpecificTwo A=new ArraySpecificTwo();
		int c[]=A.arr(a);
		
		
		

	}

}
