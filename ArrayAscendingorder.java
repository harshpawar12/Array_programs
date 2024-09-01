package Array;

import java.util.Scanner;

public class ArrayAscendingorder {
	int[] arr(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array;");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.println("Enter the eelmnt in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		ArrayAscendingorder A=new ArrayAscendingorder();
		int b[]=A.arr(a);
		System.out.println("Asending array are:");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		
	}

}
