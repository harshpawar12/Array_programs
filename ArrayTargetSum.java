package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTargetSum {
	int []arr(int a[],int T)
	{
		int sum=0;
		System.out.println("pair are");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				
			
			sum=a[i]+a[j];
			if(sum==T)
			{
				System.out.println(a[i]+"+ "+a[j]+"="+sum);
			}
		}
			
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the element in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enetr the Targeted sum:");
		int T=sc.nextInt();
		ArrayTargetSum A=new ArrayTargetSum();
		int k[]=A.arr(a, T);
		
		

	}

}
