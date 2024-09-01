package Array;

import java.util.Scanner;

public class ArrayLeadersNumber {
	int []arr(int a[]){
		System.out.println("Leaders number are:");
		int temp=a[a.length-1];
		System.out.println(temp);
		
		for(int i=a.length-1;i>0;i--)
		{
			if(a[i-1]>temp)
			{
				System.out.println(a[i-1]+" ");
				temp=a[i-1];
			}
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the element in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	
		ArrayLeadersNumber A=new ArrayLeadersNumber();
		int k[]=A.arr(a);
		
		


	}

}
