package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayKsmallest {
	
	void arr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elemnt in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Kth smallest number in array:");
		int k=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				
					if(a[i]<a[j])
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
			}
			
		}
		System.out.println(Arrays.toString(a));
		int val=a[a.length-k];
		System.out.println("Kth smallest number are:"+val);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayKsmallest k=new ArrayKsmallest();
		k.arr();
	}

}
