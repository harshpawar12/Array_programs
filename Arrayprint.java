package Array;

import java.util.Scanner;

public class Arrayprint {
	//Q1.Wap to input an array and print it.
	public int[] arr(int a[])
	{
		
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of an array:");
			int size=sc.nextInt();
			int a[]=new int[size];
			System.out.println("Enter the element in array:");
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			Arrayprint A=new Arrayprint();
			int p[]=A.arr(a);
			System.out.println("the original array are:");
			for(int i=0;i<p.length;i++)
			{
				System.out.print(p[i]+" ");
			}
	}

}
