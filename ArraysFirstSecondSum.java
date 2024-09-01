package Array;

import java.util.Scanner;

public class ArraysFirstSecondSum {
	//Q3.Wap to input an array and print its 1st and last element.
	
	public void arr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the element in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("sum of first and last element");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[0]+" "+a[a.length-1]);
			break;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraysFirstSecondSum A=new ArraysFirstSecondSum();
	A.arr();
	}

}
