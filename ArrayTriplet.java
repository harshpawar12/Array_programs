package Array;

import java.util.Scanner;

public class ArrayTriplet {
	int [] arr(int a[],int T)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					int sum=a[i]+a[j]+a[k];
					if(sum==T)
					System.out.println(a[i]+"+"+a[j]+"+"+a[k]+"="+sum);
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the eleemnt in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("Enter Targted number:");
		int T=sc.nextInt();
		ArrayTriplet A=new ArrayTriplet();
		int k[]=A.arr(a,T);
		

	}

}
