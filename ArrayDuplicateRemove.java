package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDuplicateRemove {

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
		System.out.println("finding the duplicates in array:");
		int x=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					
					a[j]=-1;
					x++;
				}
			}
		}
		System.out.println("Duplicate removed arry");
		//int c=0;
		for(int i=0;i<a.length;i++)
		{
				if(a[i]!=-1)
				{
			//		c++;
					System.out.print(a[i]+" ");

				}
			
		}
	}
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDuplicateRemove A=new ArrayDuplicateRemove();
		A.arr();

	}

}
