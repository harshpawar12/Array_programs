package Array;

import java.util.Scanner;

public class ArrayMisssingnumbeer {

		void arr()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of array:");
			int size=sc.nextInt();
			int a[]=new int[size-1];
			System.out.println("Enter the elemnt in array:");
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			System.out.println("Missing number are:");
			int sum=0;
			for(int i=0;i<a.length;i++)
			{
				sum=sum+a[i];
			}
			int val=size*(size+1)/2;
			System.out.println(val-sum);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayMisssingnumbeer A=new ArrayMisssingnumbeer();
		A.arr();

	}

}
