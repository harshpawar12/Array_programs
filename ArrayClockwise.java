package Array;

import java.util.Scanner;

public class ArrayClockwise {
	void arr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the element in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enetr the number to user rotate");
		int n=sc.nextInt();
		for(int j=1;j<=n;j++)
		{
			int temp=a[a.length-1];
			for(int i=a.length-1;i>0;i--)
			{
				a[i]=a[i-1];
			}
			a[0]=temp;
		}
		System.out.println("The Clockwise Array are:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayClockwise A=new ArrayClockwise();
		A.arr();
		
	}

}
