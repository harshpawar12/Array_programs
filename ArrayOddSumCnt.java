package Array;

import java.util.Scanner;

public class ArrayOddSumCnt {
	public int[] arr(int a[])
	{
		System.out.println("------------------------------");
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.print(a[i]+" ");
				c++;
			}
	
		}
		System.out.println("count is"+c);
		return a;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the element in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		ArrayOddSumCnt A=new ArrayOddSumCnt();
		int c[]=A.arr(a);
		

	}

}
