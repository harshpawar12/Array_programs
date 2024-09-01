package Array;

import java.util.Scanner;

public class ArraySum {
//Q5.Wap to input an array and find sum.
	
	public int[] arr(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println("The sum of Totally array is:");
		System.out.println(sum);
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
		ArraySum A=new ArraySum();
		int c[]=A.arr(a);

	}

}
