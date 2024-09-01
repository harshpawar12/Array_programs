package Array;

import java.util.Arrays;
import java.util.Scanner;
/*
 * Input:
arr1[] = {2, 3, 6, 7, 9}
arr2[] = {1, 4, 8, 10}
k = 5
Output:
6
 */


public class ArraySortKthvalue {
	int  arr(int a[],int b[],int c[],int k)
	{
		int x=0;
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
			x++;
		}
		for(int i=0;i<b.length;i++)
		{
			c[x]=b[i];
			x++;
			
		}
		int i=0;
		for( i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					int temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
			if((i+1)==k)
			{
				
				return c[i];
				
			}
		}
		return c[i];
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the size of 1st array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elelemnt in 1st arr:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enetr the size of 2nd array:");
		int size1=sc.nextInt();
		int b[]=new int[size1];
		System.out.println("Enter the elelemnt in 2nd arr:");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		int c[]=new int[a.length+b.length];
		System.out.println("enter the kth elemment:");
		int k=sc.nextInt();
		ArraySortKthvalue m=new ArraySortKthvalue();
		int s=m.arr(a, b, c, k);
		
		System.out.println("the positional element are:");
		System.out.println(s);
	
		

	}

}
