package Array;

import java.util.Scanner;

public class ArraySerchelemnt {
	
	int [] arr(int a[],int ele)
	{
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ele)
			{
				c++;
			}
		}
		System.out.println("count of serched elemet is:"+c);
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
		ArraySerchelemnt A=new ArraySerchelemnt();
		int c[]=A.arr(a,ele);
		
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]+" ");
		}
		
		
	}

}
