package Array;

import java.util.Scanner;

public class ArraySecmin {
	int []arr(int a[])
	{
		int min=Integer.MAX_VALUE,secmin=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				secmin=min;
				min=a[i];
			}
			else if(a[i]<secmin)
			{
				secmin=a[i];
			}
		}
		System.out.println("secmin of that is:"+secmin);
		return a;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array;");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.println("Enter the eelmnt in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		ArraySecmin A=new ArraySecmin();
		int b[]=A.arr(a);
		
	
	}

}
