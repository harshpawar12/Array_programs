package Array;

import java.util.Scanner;

public class ArrayAverage {
	public int[] arr(int a[])
	{
		int sum=0,avg=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
			avg=sum/a[i];
			
		}
		System.out.println("The sum of Totally array is:");
		System.out.println(sum);
		System.out.println("The Average of array is:");
		System.out.println(avg);
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.println("Enter the element in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		ArrayAverage A=new ArrayAverage();
		int c[]=A.arr(a);

	}

}
