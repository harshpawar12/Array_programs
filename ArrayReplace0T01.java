package Array;

import java.util.Scanner;

public class ArrayReplace0T01 {
	
	int [] arr(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				a[i]=1;
			}
		}
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
		ArrayReplace0T01 A=new ArrayReplace0T01();
		int c[]=A.arr(a);
		System.out.println("the replace arry are:0 to 1 :");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}

}
