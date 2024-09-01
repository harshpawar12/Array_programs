package Array;

import java.util.Scanner;

public class ArrayInsertEle {

	void arr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enetr the element in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enetr the element position");
		int ele=sc.nextInt();
		System.out.println("Enter the ele you want to insert");
		int k=sc.nextInt();
		for(int j=ele;j<=a.length;j++)
		{
			for(int i=a.length-1;i>k;i--)
			{
				a[i]=a[i-1];
			}
		}
		a[ele-1]=k;
		System.out.println("Inserted suceesfully");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayInsertEle A=new ArrayInsertEle();
		A.arr();

	}

}
