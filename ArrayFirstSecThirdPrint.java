package Array;

import java.util.Scanner;

public class ArrayFirstSecThirdPrint {
	public int[] arr(int a[])
	{
		System.out.println("Sum of First third number are:");
	
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			break;


		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the eleemnt in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		ArrayFirstSecThirdPrint A=new ArrayFirstSecThirdPrint();
		int c[]=A.arr(a);
		
		
	}

}
