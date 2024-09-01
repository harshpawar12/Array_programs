package Array;

import java.util.Arrays;
import java.util.Scanner;

public class NegativeNumberFirst {
	/*
	 * Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
Output: -12 -13 -5 -7 -3 -6 11 6 5
	 */
	void arr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the size of arry:");
		int size=sc.nextInt();
		int a[]=new int [size];
		int b[]=new int [a.length];
		System.out.println("Enetr the element in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int x=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
			b[x]=a[i];
			x++;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				b[x]=a[i];
				x++;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			a[i]=b[i];
		}
		System.out.println("modified array are:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NegativeNumberFirst N=new NegativeNumberFirst();
		N.arr();

	}

}
