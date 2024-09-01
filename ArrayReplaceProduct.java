package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReplaceProduct {
	
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
		System.out.println("product of that element.");
		for(int i=0;i<a.length;i++)// i=1
		{
			int product=1;
			for(int j=0;j<a.length;j++)//j=0
			{
				if(i!=j)//i!=0 //1!=2.
				{
					product*=a[j];//1*1=1
								//1*2=2.2*3=6.6*4=24.24*5=120.120*6=720,720*7=5040
				}
			}
			System.out.print(product+" ");

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayReplaceProduct A=new ArrayReplaceProduct();
		A.arr();

	}

}
