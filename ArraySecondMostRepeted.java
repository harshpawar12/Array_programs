package Array;

import java.util.Scanner;

public class ArraySecondMostRepeted {
	
	int  arr(int a[])
	{
		int max=0,secmax=0;
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					c++;
				}
			}
			if(c>max)
			{
				secmax=max;
				max=a[i];
			
			}
			else if(c>secmax && a[i]!=max)
			{
				secmax=a[i];
			}
		}
		System.out.println(max);
		System.out.println(secmax);
		return secmax;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enetr the element in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		ArraySecondMostRepeted A=new ArraySecondMostRepeted();
		int k=A.arr(a);
		System.out.println("Second most repeted is:"+k);
		
		

	}

}
