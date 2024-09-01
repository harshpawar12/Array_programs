package Array;

import java.util.Scanner;

public class ArrayPrintMostRepeted {
	/*
	 * Q. Wap take an array as an argument from user 
	 * and return 2nd most repeated element.
	 */
	void arr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the eleemnt in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("most repeted elemnt in arry");
			int c=0;
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					c++;
				}
				
			}
			if(c>a[i])
			{
				System.out.println(a[i]+" ");
				break;
			}
			
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayPrintMostRepeted A=new ArrayPrintMostRepeted();
		A.arr();
		
	}

}
