package Array;

import java.util.Scanner;

public class ArrayDeletePosition {

	int []arr(int a[],int ele)
	{
		for(int i=ele-1;i<a.length-1;i++)
		{
			for(int j=i;j<a.length-1;j++)
			{
				a[i]=a[i+1];
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
		System.out.println("Enter the eelemmt in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the u can delete element:");
		int ele=sc.nextInt();
		ArrayDeletePosition A=new ArrayDeletePosition();
		int k[]=A.arr(a, ele);
		System.out.println("Element deleted");
		for(int i=0;i<a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
