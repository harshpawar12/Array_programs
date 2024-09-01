package Array;

import java.util.Arrays;
import java.util.Scanner;
//Q8.Wap to input an array and and print odd  no.
public class ArrayOddNumber {
	public int[] arr(int a[])
	{
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				c++;
			}
		}
		int b[]=new int[c];
		int ind=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				b[ind]=a[i];
				ind++;
			}
		}
		
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

		ArrayOddNumber A=new ArrayOddNumber();
		System.out.println();
		System.out.println("the ODD number ");

		int b[]=A.arr(a);
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]+" ");
		}

		

	}

}