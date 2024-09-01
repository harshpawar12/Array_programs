package Array;

import java.util.Scanner;

public class ArrayMultiFiveTh {
	
	public void arr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elemnt in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Five positional ele multiply by 25 ");
		int mult=0;
		for(int i=0;i<a.length;i++)
		{
			if((i+1)==5)
			{
				mult=a[i]*25;
			}
		}
		System.out.println();
		System.out.println("five elemnt multipliacation is:"+mult);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayMultiFiveTh A=new ArrayMultiFiveTh();
		A.arr();

	}

}
