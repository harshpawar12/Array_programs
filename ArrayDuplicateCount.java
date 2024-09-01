package Array;

import java.util.Scanner;

public class ArrayDuplicateCount {
	
	 int  arr(int a[],int n)
	{
		 int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				c++;
				
			}

		}
		return c;
		}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the eleemnt in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Repeted eleemnt count:");
		int n=sc.nextInt();
		ArrayDuplicateCount A=new ArrayDuplicateCount();
		int k=A.arr(a,n);
		System.out.println(k);
		}

}
