package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEleZeroFirst {
	
	int [] arr(int a[])
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
		System.out.println("Enter the element in arry");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elemnt in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		sc.close();
		ArrayEleZeroFirst A=new ArrayEleZeroFirst();
		int k[]=A.arr(a);
		System.out.println(Arrays.toString(k));
		
		

	}

}
