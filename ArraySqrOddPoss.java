package Array;

import java.util.Scanner;

public class ArraySqrOddPoss {
	int []arr(int a[])
	{
		System.out.println("Square of odd position");
		int square=0;int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if((i+1)%2!=0)
			{
				square=a[i]*a[i];
				sum=square;
				System.out.println(a[i]+" ");
				System.out.println("Square of odd possition:"+sum);

			}
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elemnt in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		ArraySqrOddPoss A=new ArraySqrOddPoss();
		int c[]=A.arr(a);
		
	}

}
