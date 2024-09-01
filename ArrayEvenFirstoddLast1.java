package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEvenFirstoddLast1 {
	/*
	 * Input: arr[] = 1 9 5 3 2 6 7 11
		Output: 2 6 5 3 1 9 7 11
	 */
	void arr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the element in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Even first ODD last:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				
					if(a[j]%2==0)
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				
			}
		}
		System.out.println(Arrays.toString(a));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayEvenFirstoddLast1 A=new ArrayEvenFirstoddLast1();
		A.arr();

	}

}
