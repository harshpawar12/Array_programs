package Array;

import java.util.Scanner;

public class ArrayOddelement {
//Q2.Wap enter an array and find the sum and count of odd element .
	public int[] arr(int a[])
	{
		int sum=0,c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				sum+=a[i];
				c++;
				System.out.print(a[i]+" ");
			
			}
		}
		System.out.println("sum of elemnt is:"+sum);
		System.out.println("count of elemnt "+c);
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elemnt in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		ArrayOddelement A=new ArrayOddelement();
		int c[]=A.arr(a);
		
	}

}
