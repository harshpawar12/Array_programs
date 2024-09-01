package Array;

import java.util.Scanner;

public class ArrayMerging {
	int []arr(int a[],int b[],int c[])
	{
		int x=0;
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
			x++;
		}
		for(int i=0;i<b.length;i++)
		{
			c[x]=b[i];
			x++;
		}
		return c;
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
		int b[]=new int [size];
		System.out.println("Enter the eelmnt in array:");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		int c[]=new int [a.length+b.length];
		ArrayMerging A=new ArrayMerging();
		int j[]=A.arr(a, b, c);
		System.out.println("Merged array are:");
		for(int i=0;i<j.length;i++)
		{
			System.out.print(j[i]+" ");
		}
			
		
	}

}
