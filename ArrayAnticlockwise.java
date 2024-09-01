package Array;

import java.util.Scanner;

public class ArrayAnticlockwise {
	
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
			int temp=a[0];
			for(int i=0;i<a.length-1;i++)
			{
				a[i]=a[i+1];
			}
			a[a.length-1]=temp;
		}
		System.out.println("Rotating Array Anti-clockwise");

		System.out.println("---The Updated Array Are---");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayAnticlockwise A=new ArrayAnticlockwise();
		A.arr();

	}

}
