package Array;

import java.util.Scanner;

public class ArrayMax {
	int []arr(int a[])
	{
		int max=0;int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];

			}
		}
		System.out.println("max in array:"+max);

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
		
		ArrayMax A=new ArrayMax();
		int c[]=A.arr(a);
		
	}

}
