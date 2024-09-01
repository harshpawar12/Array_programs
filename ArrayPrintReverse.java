package Array;

import java.util.Scanner;

public class ArrayPrintReverse {
	int[] arr(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			
		}
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
		ArrayPrintReverse A=new ArrayPrintReverse();
		int c[]=A.arr(a);
		System.out.println("reverse array is:");
		for(int i=c.length-1;i>=0;i--)
		{
			System.out.println(c[i]+" ");
		}
		
	}

}
