package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTwice {
	/*
	 * Input:  arr[] = {2, 3, 5, 4, 5, 3, 4}
		Output: 2 
	 */
	int [] arr(int a[])
	{
		System.out.println("the output is:");
		for(int i=0;i<a.length;i++)
		{
			int c=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
				c++;	
				}
			}
			if(c!=2)
			{
				System.out.println(a[i]);
				break;
			}
		}
		
		return a;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.println("Enter the eleemnt in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		ArrayTwice A=new ArrayTwice();
		int k[]=A.arr(a);
		
		

	}

}
