package Array;

import java.util.Scanner;

public class ArrayDiffMaximumInEle {
	void arr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the element in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("maximum diffrence of that element.");
		int max=0,min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			else if(a[i]<min)
			{
				min=a[i];
			}
		}
		int result=max-min;
		System.out.println(result);

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDiffMaximumInEle A=new ArrayDiffMaximumInEle();
		A.arr();

	}

}
