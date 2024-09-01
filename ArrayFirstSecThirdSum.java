package Array;

import java.util.Scanner;

public class ArrayFirstSecThirdSum {
	public int arr(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=a[0]+a[1]+a[2];
		}
		System.out.println("Sum of First third number are:");
		System.out.print(a[0]+"+"+a[1]+"+"+a[2]+"="+sum);
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the eleemnt in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		ArrayFirstSecThirdSum A=new ArrayFirstSecThirdSum();
		int k=(int) A.arr(a);
	
		
		
	}

}
