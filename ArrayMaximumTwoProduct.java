package Array;

import java.util.Scanner;

public class ArrayMaximumTwoProduct {
	
	int arr(int a[])
	{
		int max=0;int secmax=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				secmax=max;
				max=a[i];
			}
			else if(a[i]>secmax)
			{
				secmax=a[i];
			}
	}
		int val=max*secmax;
		
		return val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of arrauy:");
		int  size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the element in arra");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		ArrayMaximumTwoProduct M=new ArrayMaximumTwoProduct();
		int j=M.arr(a);
		System.out.println("produnt of max element in array");
		System.out.println(j);
		

	}

}
