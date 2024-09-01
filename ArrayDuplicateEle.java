package Array;

import java.util.Scanner;

public class ArrayDuplicateEle {
	
int[]arr(int a[])
{
	System.out.println("Duplicate element in the array:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[i]+" ");
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
		System.out.println("Enter the elemnt in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		ArrayDuplicateEle A=new ArrayDuplicateEle();
		int c[]=A.arr(a);
		
	}

}
