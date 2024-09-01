package Array;

import java.util.Scanner;

public class ArrayFind1stlastsum {
	int []arr(int a[])
	{
		int sum=0;
		System.out.println("the sum of that number are present or not:");

		for(int i=0;i<a.length;i++)
		{
			sum=a[0]+a[a.length-1];
				if(sum==a[i])
				{
					System.out.println(a[i]+" present");
				}
				}
		System.out.println("sum of first & last ele:"+sum);
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
		ArrayFind1stlastsum A=new ArrayFind1stlastsum();
		int c[]=A.arr(a);
		
		
		
		
	}

}
