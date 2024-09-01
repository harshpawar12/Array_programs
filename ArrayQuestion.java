package Array;

import java.util.Scanner;

public class ArrayQuestion {
/*
 * Q. Wap take an array as an argument from
 *  user and return 2nd most repeated element.
 */
	int []arr(int a[])
	{
		int c=2;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					c++;
				}
			}
			
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enetr the elemnt in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		ArrayQuestion A=new ArrayQuestion();
		int k[]=A.arr(a);
	
		

	}

}
