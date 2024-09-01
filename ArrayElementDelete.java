package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElementDelete {
	int [] arr(int a[],int ele)
	{
	for(int i=ele-1;i<=a.length-1;i++)
	{
		for(int j=i+1;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
	}
	System.out.println("Element are deleted ");
	for(int i=0;i<a.length-1;i++)
	{
		System.out.print(a[i]+" ");
	}
	
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the eleemnt in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("Enter the eleemt delete by user:");
		int ele=sc.nextInt();
		
		ArrayElementDelete A=new ArrayElementDelete();
		int k[]=A.arr(a, ele);
		
	}

}
