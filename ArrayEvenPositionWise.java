package Array;

import java.util.Scanner;

public class ArrayEvenPositionWise {
	
	public int[] arr(int a[])
	{
		System.out.println("printing the elemtn in Even position:");
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if((i+1)%2==0)
			{
				c++;
				System.out.println(a[i]+" ");
			}
		}
		System.out.println("count is:"+c);
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the element in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		ArrayEvenPositionWise A=new ArrayEvenPositionWise();
		int c[]=A.arr(a);
		
	}

}
