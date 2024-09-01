package Array;

import java.util.Scanner;

public class ArrayFiveNumberavg {

	public int [] arr(int a[])
	{
		int sum=0,avg=0;
		for(int i=0;i<a.length;i++)
		{
			if(i<5)
			{
				sum+=a[i];
				avg=sum/5;

			}
		}
		System.out.println("Average of First five elemnt are:"+avg);
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
		ArrayFiveNumberavg A=new ArrayFiveNumberavg();
		int b[]=A.arr(a);
		
	}

}
