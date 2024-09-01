package Array;

import java.util.Scanner;

public class ArrayChk0and1 {
	void arr ()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enetr the eelemt in array: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Check the array ele are 0 & -1:");
		
		for(int i=0;i<a.length;i++)
		{
		if(a[i]==0)
		{
			System.out.println("0 are present");
		}
		else if(a[i]==-1)
		{
			System.out.println("-1 are present");
		}
		
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayChk0and1 A=new ArrayChk0and1();
		A.arr();
	}

}
