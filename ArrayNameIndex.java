package Array;

import java.util.Scanner;

public class ArrayNameIndex {
	
	public void arr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the size of array:");
		int size=sc.nextInt();
		String str[]=new String[size];
		System.out.println("Enter the elemnt in array:");
		for(int i=0;i<str.length;i++)
		{
			str[i]=sc.next();
		}
		System.out.println("name in dex of array:");
		for(int i=0;i<str.length;i++)
		{
			System.out.println(i+" "+str[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayNameIndex A=new ArrayNameIndex();
		A.arr();

	}

}
