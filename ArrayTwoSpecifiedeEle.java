package Array;

import java.util.Scanner;

public class ArrayTwoSpecifiedeEle {
		int []arr(int a[],int ele,int ele1)
		{
			System.out.println("elemnt are present in array:");
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==ele || a[i]==ele1)
				{
					System.out.println(a[i]+" ");
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
		System.out.println("serch the given element in array:");
		int ele=sc.nextInt();
		System.out.println("serch the given element in array:");
		int ele1=sc.nextInt();
		ArrayTwoSpecifiedeEle A=new ArrayTwoSpecifiedeEle();
		int c[]=A.arr(a,ele,ele1);
		
		
		
	}

}
