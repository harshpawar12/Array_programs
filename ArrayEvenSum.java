package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEvenSum {
//Q9.Wap to input an array and and find the sum of even no.
	public int[] arr(int a[])
	{
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				c++;
			}
		}
		int b[]=new int[c];
		int ind=0;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				sum+=a[i];
				b[ind]=a[i];
				ind++;
			}
		}
		System.out.println("Sum of even are:"+sum);

		
		return b;
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
		System.out.println("The Original Array are:");

		System.out.print(Arrays.toString(a));

		ArrayEvenSum A=new ArrayEvenSum();
		System.out.println();
		System.out.println("the even number ");

		int b[]=A.arr(a);
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]+" ");
		}

		

	}

}