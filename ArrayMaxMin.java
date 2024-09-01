package Array;

import java.util.Scanner;

public class ArrayMaxMin {
	int []arr(int a[])
	{
		int max=0,min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			else if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("max is:"+max);
		System.out.println("min is:"+min);
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array;");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.println("Enter the eelmnt in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		ArrayMaxMin A=new ArrayMaxMin();
		int b[]=A.arr(a);
		
	
	}

}
