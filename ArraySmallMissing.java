package Array;

import java.util.Scanner;

public class ArraySmallMissing {

	void arr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the eleemnt in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		System.out.println("misiing elemen tin array:");
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		int val=size*(size+1)/2;
		System.out.println(sum-val);

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySmallMissing A=new ArraySmallMissing();
		A.arr();

	}

}
