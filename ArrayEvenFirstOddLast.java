package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEvenFirstOddLast {
//even and odd numbers of a given array of integers.
	//Put all even numbers first,
	//and then odd numbers.	
	void arr()
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
		System.out.println("Even odd number in array:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				
					if(a[i]%2!=0)
					{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					}
			}
		}
		System.out.println("Array are:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayEvenFirstOddLast A=new ArrayEvenFirstOddLast();
		A.arr();
	}

}
