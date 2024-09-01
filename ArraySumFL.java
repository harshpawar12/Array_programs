package Array;

import java.util.Scanner;

public class ArraySumFL {
	
//Q4.Wap to input an array and find sum of its 1st and 2nd element.
	public int[] arr(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=a[0]+a[1];
		}
		System.out.println("sum of first and second element are:");
		System.out.println(sum);

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
		ArraySumFL A=new ArraySumFL();
		int c[]=A.arr(a);
	

	}

}
