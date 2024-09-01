package Array;

import java.util.Scanner;

public class ArraySecmax {
	int [] arr(int a[])
	{
		int max=0,secmax=0;
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
		System.out.println("Secmaximum is:"+secmax);
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
		ArraySecmax A=new ArraySecmax();
		int b[]=A.arr(a);
		
	
	}

}
